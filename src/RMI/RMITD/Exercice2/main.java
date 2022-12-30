package RMI.RMITD.Exercice2;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class main {
    public static void main(String[] args) {
        try{
            IPalindrome pal = new Serveur();
            ICalculOccurence occu = new Serveur();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/palindrome",pal);
            Naming.rebind("rmi://localhost:1099/occurence",occu);

        }catch (Exception e){

        }
    }
}
