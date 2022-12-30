package Socket.Exercice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    final static int port = 1200;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket s = new ServerSocket(port);

        Socket socClient = s.accept();

        BufferedReader entreeClient = new BufferedReader(
                new InputStreamReader(socClient.getInputStream())
        );

        PrintWriter sortieServeur = new PrintWriter(
                new BufferedWriter(new OutputStreamWriter(socClient.getOutputStream())),
                true
        );
        String nom,prenom;
        double note1,note2;
        nom = entreeClient.readLine();
        prenom = entreeClient.readLine();
        note1 = Double.parseDouble(entreeClient.readLine());
        note2 = Double.parseDouble(entreeClient.readLine());
        Etudiant et = new Etudiant(nom,prenom,note1,note2);
        System.out.println(et.toString());

        ObjectInputStream is = new ObjectInputStream(socClient.getInputStream());

            Object o = is.readObject();
            Etudiant et2 = (Etudiant) o;
        System.out.println(et2.toString());
        sortieServeur.println(et2.calculMoy());



    }
}
