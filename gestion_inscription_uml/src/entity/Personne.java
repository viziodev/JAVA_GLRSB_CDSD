package entity;
public class Personne{
    private static int nbrePersonne;
    protected int id;
    protected String nomComplet;

    
    public Personne() {
        id=++nbrePersonne;
    }
    public int getId() {
        return id;
    }

    public static int getNbrePersonne() {
        return nbrePersonne;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    @Override
    public String toString() {
        return " Id=" + id + ", Nom et Prenom=" + nomComplet ;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        Personne other = (Personne) obj;
        if (id != other.id)
            return false;
        return true;
    }


}