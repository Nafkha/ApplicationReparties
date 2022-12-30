package RMI.RMIExample;

import java.rmi.Naming;
import java.util.Scanner;

public class ReverseClient {
    public static void main(String[] args) {
        try {

            ReverseInterface rev = (ReverseInterface) Naming.lookup("rmi://127.0.0.1:1099/MyReverse");
            Scanner sc = new Scanner(System.in);
            System.out.println("Donner une chaine");
            String s = sc.nextLine();
            String result = rev.reverseString(s);
            System.out.println("l'inverse de "+s+" est "+result);

        }catch (Exception e){
            System.out.println("Erreur");

        }
    }
}
