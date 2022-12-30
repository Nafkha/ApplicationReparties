package RMI.RMITD.Exercice1;

import RMI.RMIExample.ReverseInterface;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            echoInterface echo = (echoInterface) Naming.lookup("rmi://localhost:1099/echo");
            AdditionInterface additionInterface = (AdditionInterface) Naming.lookup("rmi://localhost:1099/addition");
            Scanner sc = new Scanner(System.in);
            System.out.println("Donner une chaine");
            String s = sc.nextLine();
            echo.echo(s);
            Scanner sci = new Scanner(System.in);
            System.out.println("donner a ");
            int a = sci.nextInt();
            System.out.println("donner b ");
            int b = sci.nextInt();
            additionInterface.addtion(a,b);

            //System.out.println("l'inverse de "+s+" est "+result);

        }catch (Exception e){

        }
    }
}
