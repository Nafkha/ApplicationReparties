package RMI.RMIExample;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Reverse extends UnicastRemoteObject implements ReverseInterface {
    protected Reverse() throws RemoteException {
    }

    @Override
    public String reverseString(String chaine) throws RemoteException {
        int longueur = chaine.length();
        StringBuffer temp = new StringBuffer();
        for (int i=longueur; i>0; i--){
            temp.append(chaine.substring(i-1,i));
        }
        return temp.toString();
    }
}
