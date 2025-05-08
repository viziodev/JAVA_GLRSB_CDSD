package entity;

import java.util.ArrayList;

public class Filiere {
     private static int nbreFiliere;
     private int id;
     private String libelle; 

    public Filiere() {
        id=++nbreFiliere;
    }
    private ArrayList<Classe> classes=new ArrayList<>();

     public Filiere(String libelle) {
        id=++nbreFiliere;
        this.libelle = libelle;
    }

     public void addClasse(Classe classe){
        classes.add(classe);
     }

     public ArrayList<Classe> getClasses() {
        return classes;
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

    @Override
    public String toString() {
        return "Filiere [id=" + id + ", libelle=" + libelle + ", classes=" + classes + "]";
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
        Filiere other = (Filiere) obj;
        if (libelle == null) {
            if (other.libelle != null)
                return false;
        } else if (!libelle.equals(other.libelle))
            return false;
        return true;
    }


    
}
