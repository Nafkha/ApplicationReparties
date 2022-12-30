package RMI.RMIExample;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ReverseServer {

    public static void main(String[] args) {
        try {
            System.out.println("Serveur : Construction de l'implémentation");
            Reverse rev = new Reverse();
            System.out.println("Objet Reserve lié dans le RMI registry");
            LocateRegistry.createRegistry(1099);

            Naming.rebind("rmi://127.0.0.1:1099/MyReverse",rev);
            System.out.println("Attente des invocation des clients ...");


        }catch (Exception e){

        }
    }
}
