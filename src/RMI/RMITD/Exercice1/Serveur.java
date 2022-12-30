package RMI.RMITD.Exercice1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Serveur extends UnicastRemoteObject implements AdditionInterface, echoInterface {
    protected Serveur() throws RemoteException {
    }

    @Override
    public void addtion(int a, int b) throws RemoteException {
        int c = a+b;
        System.out.println(c);
    }

    @Override
    public void echo(String msg) throws RemoteException {
        System.out.println("Les message est : "+msg);

    }
}
