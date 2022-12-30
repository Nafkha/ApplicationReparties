package Socket.SocketTD.Exercice1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static int port = 1200;
    static String server = "127.0.0.1";

    public static void main(String[] args) throws Exception {
        System.out.println("Demande de connexion");

        Socket s = new Socket(server,port);
        System.out.println("Connexion établie");

        BufferedReader entreeServeur = new BufferedReader(
                new InputStreamReader(s.getInputStream())
        );
        PrintWriter sortieClient = new PrintWriter(
                new BufferedWriter(new OutputStreamWriter(
                        s.getOutputStream()
                )),true
        );
        Scanner sc = new Scanner(System.in);
        String str="";
        String strMaj="";
        int i =0;
        while(i<9){

            str=sc.nextLine();
            sortieClient.println(str);
            strMaj = entreeServeur.readLine();
            System.out.println(str + " en majuscule : "+strMaj);
            i++;
        }
        sortieClient.println("END");
        entreeServeur.close();
        sortieClient.close();
        s.close();


    }
}
