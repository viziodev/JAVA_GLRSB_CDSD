package entity;

public class Client extends Utilisateur {
   private String telephone;

   public String getTelephone() {
    return telephone;
   }

   public void setTelephone(String telephone) {
    this.telephone = telephone;
   }

   @Override
   public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
    Client other = (Client) obj;
    if (telephone == null) {
        if (other.telephone != null)
            return false;
    } else if (!telephone.equals(other.telephone))
        return false;
    return true;
   }

   @Override
   public String toString() {
    return "Client [id=" + id + ", telephone=" + telephone + "]";
   }  
}
