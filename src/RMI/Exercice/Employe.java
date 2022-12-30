package RMI.Exercice;

import java.io.Serializable;

public class Employe implements Serializable {

    private int id;
    private String nom,prenom,poste;
    float salaire;

    public Employe(int id, String nom, String prenom, String poste, float salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", poste='" + poste + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
