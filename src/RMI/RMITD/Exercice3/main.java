package RMI.RMITD.Exercice3;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public class main {

    public static void main(String[] args) {
        try{

            IDate date = new Serveur();
            INombrePremier nombrePremier = new Serveur();

            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/date",date);
            Naming.rebind("rmi://localhost:1099/nombrePremier",nombrePremier);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
