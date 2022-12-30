package RMI.RMITD.Exercice3;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {

            IDate date = (IDate) Naming.lookup("rmi://localhost:1099/date");
            INombrePremier nombrePremier = (INombrePremier) Naming.lookup("rmi://localhost:1099/nombrePremier");

            boolean isPrime = nombrePremier.nombrePremier(5);
            System.out.println(isPrime);

            System.out.println("Date actuelle : "+date.DateActuelle());




        }catch (Exception e){

        }
    }
}
