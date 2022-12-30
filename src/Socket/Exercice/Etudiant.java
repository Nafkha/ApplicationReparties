package Socket.Exercice;

import java.io.Serializable;

public class Etudiant implements Serializable { //Lazem implémentation lel Serializable besh najmou nab3thou Objet :)

    private String nom,prenom;
    private double note1,note2;

    public Etudiant(String nom, String prenom, double note1, double note2) {
        this.nom = nom;
        this.prenom = prenom;
        this.note1 = note1;
        this.note2 = note2;
    }
    public double getNote1() {
        return note1;
    }

    public double getNote2() {
        return note2;
    }

    public double calculMoy(){
        return (note1+note2)/2;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", note1=" + note1 +
                ", note2=" + note2 +
                '}';
    }
}
