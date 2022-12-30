package RMI.RMITD.Exercice2;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            ICalculOccurence calculOccurence = (ICalculOccurence) Naming.lookup("rmi://localhost:1099/occurence");
            IPalindrome palindrome = (IPalindrome) Naming.lookup("rmi://localhost:1099/palindrome");
            System.out.println("Donner Une Chaine");
            Scanner sc1= new Scanner(System.in);
            String str1 = sc1.nextLine();
            System.out.println(str1 + " Est palindrome (True/False) "+ palindrome.isPalindrome(str1));
            System.out.println("Donner une nouvelle chaine");
            str1 = sc1.nextLine();
            System.out.println("Donner un charactére");
            Scanner sc2 = new Scanner(System.in);
            char c = sc2.next().charAt(0);
            System.out.println("le nombre d'occurence de "+c+" dans "+str1+ " est " + calculOccurence.calculOccurence(str1,c) );

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
