package Socket.SocketExample;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static final int port = 1200;

    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(port);
        System.out.println("En Attente de connexion");
        Socket socClient = s.accept();
        System.out.println("Connexion établie");

        BufferedReader entreeServeur = new BufferedReader(
                new InputStreamReader(socClient.getInputStream())
        );

        PrintWriter sortieServeur = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(socClient.getOutputStream())
                ),true
        );
        String str = entreeServeur.readLine();
        String strMajuscule = str.toUpperCase();
        System.out.println("Le message en majuscule est "+strMajuscule);
        entreeServeur.close();
        sortieServeur.close();
        socClient.close();
    }
}
