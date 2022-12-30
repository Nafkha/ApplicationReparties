package RMI.RMITD.Exercice3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface INombrePremier extends Remote {
    boolean nombrePremier(int num) throws RemoteException;
}
