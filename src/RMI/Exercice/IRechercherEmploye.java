package RMI.Exercice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRechercherEmploye extends Remote {

    Employe rechercherEmploye(int id) throws RemoteException;

}
