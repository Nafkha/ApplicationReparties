package Socket.Exercice;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    final static int port = 1200;
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",port);

        BufferedReader entreeServeur = new BufferedReader(
          new InputStreamReader(s.getInputStream())
        );

        PrintWriter sortieClient = new PrintWriter(
                new BufferedWriter(new OutputStreamWriter(s.getOutputStream())),
                true
        );

        sortieClient.println("Nafkha");
        sortieClient.println("Youssef");
        sortieClient.println(17);
        sortieClient.println(18);

        Etudiant et = new Etudiant("Youssef","Nafkha",15,16);
        Scanner sc = new Scanner(System.in);

        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        {
            oos.writeObject(et);
        }

        System.out.println(entreeServeur.readLine());



    }
}
