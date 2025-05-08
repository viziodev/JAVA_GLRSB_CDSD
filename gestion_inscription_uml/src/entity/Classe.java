package entity;

import java.util.ArrayList;

public class Classe {
    private static int nbreClasse;
    private int id;
    
    private ArrayList<Inscription> inscriptions=new ArrayList<>();
    private Filiere filiere;

     public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

     public void addInscription(Inscription inscription){
        inscriptions.add(inscription);
     }

     public ArrayList<Inscription> getInscriptions() {
        return inscriptions;
    }
    private String libelle; 


    public Classe(String libelle) {
        this.libelle = libelle;
    }

    public Classe(String nomfiliere, String nomClasse) {
        id=++nbreClasse;
        this.filiere = new Filiere(nomfiliere) ;
        this.libelle = nomClasse;
    }

    public int getId() {
        return id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public Classe() {
        id=++nbreClasse;
    }

    @Override
    public String toString() {
        return "Classe [id=" + id +  ", libelle=" + libelle + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Classe other = (Classe) obj;
        if (libelle == null) {
            if (other.libelle != null)
                return false;
        } else if (!libelle.equals(other.libelle))
            return false;
        return true;
    }

    
}
