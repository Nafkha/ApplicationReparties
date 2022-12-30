package RMI.Exercice;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class main {
    public static void main(String[] args) {
        try {
            IAjouterEmploye ajouterEmploye = new Serveur();
            IRechercherEmploye rechercherEmploye = new Serveur();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/ajouterEmploye",ajouterEmploye);
            Naming.rebind("rmi://localhost:1099/rechercherEmploye",rechercherEmploye);


        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
