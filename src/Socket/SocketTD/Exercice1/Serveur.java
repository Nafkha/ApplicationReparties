package Socket.SocketTD.Exercice1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        ServerSocket s = new ServerSocket(port);
        System.out.println("En attente de connexion");
        Socket socClient = s.accept();
        System.out.println("Connexion établie");
        BufferedReader entreeClient = new BufferedReader(
                new InputStreamReader(socClient.getInputStream())
        );
        PrintWriter sortieServeur = new PrintWriter(
                new BufferedWriter(new OutputStreamWriter(socClient.getOutputStream())),true
        );

        String clientInput = "";

        while (!clientInput.toUpperCase().equals("END")){
            clientInput = entreeClient.readLine();
            String strMaj = clientInput.toUpperCase();
            sortieServeur.println(strMaj);
        }
        entreeClient.close();
        sortieServeur.close();
        socClient.close();
        s.close();

    }
}
