package entity;

import java.util.ArrayList;

public class Utilisateur {
    protected int id;
    //OneToMany
    private ArrayList<Commande>  commandes=new ArrayList<>();

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public void addCommande(Commande commande){
        commandes.add(commande);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Utilisateur [id=" + id + "]";
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
        Utilisateur other = (Utilisateur) obj;
        if (id != other.id)
            return false;
        return true;
    } 

    
}
