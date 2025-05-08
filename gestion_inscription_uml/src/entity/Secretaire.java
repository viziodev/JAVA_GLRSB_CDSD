package entity;

import java.util.ArrayList;

public class Secretaire extends Personne{
    private String telephone;
    private String login;
    private String password;

    private ArrayList<Inscription> inscriptions=new ArrayList<>();

     public void addInscription(Inscription inscription){
        inscriptions.add(inscription);
     }

     public ArrayList<Inscription> getInscriptions() {
        return inscriptions;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Secretaire [ "+ super.toString() +"  Telephone=" + telephone + ", Login=" + login + ", Password=" + password + "]";
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
        Secretaire other = (Secretaire) obj;
        if (telephone == null) {
            if (other.telephone != null)
                return false;
        } else if (!telephone.equals(other.telephone))
            return false;
        return true;
    }
}
