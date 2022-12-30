package RMI.Exercice;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            IAjouterEmploye ajouterEmploye = (IAjouterEmploye) Naming.lookup("rmi://localhost:1099/ajouterEmploye");
            IRechercherEmploye rechercherEmploye = (IRechercherEmploye)  Naming.lookup("rmi://localhost:1099/rechercherEmploye");

            ajouterEmploye.ajouterEmploye(new Employe(1,"Nafkha","Mohamed Youssef","owner",1500));
            ajouterEmploye.ajouterEmploye(new Employe(2,"Mohamed Youssef","Nafkha","founder",1300));
            ajouterEmploye.ajouterEmploye(new Employe(3,"Youssef","Nafkha","ceo",1200));

            Employe e = rechercherEmploye.rechercherEmploye(2);
            System.out.println(e.toString());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
