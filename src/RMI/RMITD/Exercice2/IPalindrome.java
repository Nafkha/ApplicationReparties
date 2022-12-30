package RMI.RMITD.Exercice2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPalindrome extends Remote {
    boolean isPalindrome(String s) throws RemoteException;
}
