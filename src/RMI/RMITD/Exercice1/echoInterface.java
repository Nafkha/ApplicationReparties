package RMI.RMITD.Exercice1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface echoInterface extends Remote {
    void echo(String msg) throws RemoteException;
}
