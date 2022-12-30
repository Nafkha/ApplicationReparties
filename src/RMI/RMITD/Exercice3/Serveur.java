package RMI.RMITD.Exercice3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class Serveur extends UnicastRemoteObject implements IDate, INombrePremier {
    public Serveur() throws RemoteException {
    }

    @Override
    public Date DateActuelle() throws RemoteException {
        return new Date();

    }

    @Override
    public boolean nombrePremier(int num) throws RemoteException {
        for(int i=1;i<num/2;i++){
            if(num%i!=0){
                return false;
            }
        }

        return true;
    }
}
