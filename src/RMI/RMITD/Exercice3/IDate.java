package RMI.RMITD.Exercice3;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface IDate extends Remote {
    Date DateActuelle() throws RemoteException;
}
