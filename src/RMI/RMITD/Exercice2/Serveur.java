package RMI.RMITD.Exercice2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Serveur extends UnicastRemoteObject implements IPalindrome,ICalculOccurence  {
    protected Serveur() throws RemoteException {
    }

    @Override
    public int calculOccurence(String str, char c) throws RemoteException {
        int occu = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                occu++;
            }
        }
        return occu;
    }

    @Override
    public boolean isPalindrome(String s) throws RemoteException {

        int debut = 0;
        int fin = s.length()-1;

        while (debut<fin){
            if(s.charAt(debut)==s.charAt(fin)){
                debut++;
                fin--;
            }else {
                return false;
            }
        }


        return true;
    }
}
