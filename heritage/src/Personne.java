public class Personne {
    protected int id;
    protected String nom;
    public Personne() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

  
    public String toChaine() {
        return "Personne [id=" + id + ", nom=" + nom + "]";
    }


}
