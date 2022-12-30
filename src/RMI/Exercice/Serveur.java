package RMI.Exercice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Serveur extends UnicastRemoteObject implements IAjouterEmploye,IRechercherEmploye {
    protected Serveur() throws RemoteException {
    }

    @Override
    public void ajouterEmploye(Employe e) throws RemoteException {
        IAjouterEmploye.listEmploye.add(e);
        System.out.println(listEmploye.size());

    }

    @Override
    public Employe rechercherEmploye(int id) throws RemoteException {

        boolean found = false;
        int i =0;
        while (i<IAjouterEmploye.listEmploye.size() && !found){
            if(IAjouterEmploye.listEmploye.get(i).getId() == id){
                found = true;
                return IAjouterEmploye.listEmploye.get(i);
            }else{
                i++;
            }
        }

        return null;
    }
}
