package Socket.SocketTD.Exercice2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    final static int port=1200;
    final static String server = "127.0.0.1";

    public static void main(String[] args) throws Exception {
        System.out.println("Demande de connexion");
        Socket s = new Socket(server,port);
        System.out.println("Connexion établie");

        BufferedReader entreeServeur = new BufferedReader(
                new InputStreamReader(s.getInputStream())
        );

        PrintWriter sortieClient = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(s.getOutputStream())
                ),true
        );
        Scanner sc = new Scanner(System.in);
        String str =  "";
        String result = "";

        while (true){
            System.out.println("Donner un mot");
            str = sc.nextLine();
            sortieClient.println(str);
            result = entreeServeur.readLine();
            if(result.equals("END")){
                break;
            }
            System.out.println(result);


        }
        sortieClient.close();
        entreeServeur.close();
        s.close();



    }
}
