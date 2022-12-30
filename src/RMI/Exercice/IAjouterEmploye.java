package RMI.Exercice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IAjouterEmploye extends Remote {

    public static ArrayList<Employe> listEmploye = new ArrayList<Employe>();

    void ajouterEmploye(Employe e) throws RemoteException;


}
