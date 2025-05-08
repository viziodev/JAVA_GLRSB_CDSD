package entity;

import java.util.ArrayList;

public class Etudiant extends Personne {
     private String matricule;
     private ArrayList<Inscription> inscriptions=new ArrayList<>();

     public void addInscription(Inscription inscription){
        inscriptions.add(inscription);
     }

     public ArrayList<Inscription> getInscriptions() {
        return inscriptions;
    }

     public String getMatricule() {
        return matricule;
    }

     public Etudiant() {
        matricule="MAT_"+Personne.getNbrePersonne();
     }

     @Override
     public String toString() {
        return "Etudiant [ "+ super.toString() +" Matricule=" + matricule + "]";
     }

     @Override
     public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
        return result;
     }

     @Override
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Etudiant other = (Etudiant) obj;
        if (matricule == null) {
            if (other.matricule != null)
                return false;
        } else if (!matricule.equals(other.matricule))
            return false;
        return true;
     }


}
