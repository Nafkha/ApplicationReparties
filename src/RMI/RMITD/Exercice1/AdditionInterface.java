package RMI.RMITD.Exercice1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AdditionInterface extends Remote {
    void addtion(int a, int b) throws RemoteException;
}
