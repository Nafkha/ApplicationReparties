package RMI.RMITD.Exercice1;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class main {
    public static void main(String[] args) {
        try{
            System.out.println("Construction de l'implementation");
            echoInterface echo = new Serveur();
            AdditionInterface addition = new Serveur();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/echo",echo);
            Naming.rebind("rmi://localhost:1099/addition",addition);
            System.out.println("Attente Invocation");

        }catch (Exception e){

        }
    }
}
