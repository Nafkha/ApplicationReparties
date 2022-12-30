package RMI.RMITD.Exercice2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculOccurence extends Remote {
    int calculOccurence(String str, char c ) throws RemoteException;
}
