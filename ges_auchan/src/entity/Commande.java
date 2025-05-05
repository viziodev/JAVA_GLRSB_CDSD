package entity;

public class Commande {
    private int id;

    //Attributs Navigables
    //ManyToOne
    private Client client;
    private Vendeur vendeur;

    public Vendeur getVendeur() {
        return vendeur;
    }

    public void setVendeur(Vendeur vendeur) {
        this.vendeur = vendeur;
    }

    public int getId() {
        return id;
    }

   public Client getClient() {
    return client;
   }

public void setClient(Client client) {
    this.client = client;
}

 public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Commande [id=" + id + "]";
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
        Commande other = (Commande) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}
