package Socket.SocketTD.Exercice2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    final static int port = 1200;

    public static Boolean isPalyndrome(String s){
        int deb = 0;
        int end = s.length()-1;
        while (deb<end){
            if(s.charAt(deb) == s.charAt(end)){
                deb++;
                end --;
            }else {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(1200);
        System.out.println("Attente de connexion");
        Socket socCLient = s.accept();

        BufferedReader entreeClient = new BufferedReader(
                new InputStreamReader(socCLient.getInputStream())
        );
        PrintWriter sortieServeur = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(socCLient.getOutputStream())
                ),
                true
        );

        String inputClient = "";
        while (true){
            inputClient = entreeClient.readLine();
            if (inputClient.toUpperCase().equals("END")){
                break;
            }
            Boolean isP = isPalyndrome(inputClient);
            if(isP){
                sortieServeur.println(inputClient + " est palindrome");
            }else{
                sortieServeur.println(inputClient + " n'est pas palindrome");
            }
        }
        sortieServeur.println("END");
        entreeClient.close();
        sortieServeur.close();
        socCLient.close();
        s.close();


    }
}
