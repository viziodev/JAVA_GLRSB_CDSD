package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compte {
    private int id;//0
    private String numero;//null
    private LocalDate dateCreation;
    private double solde;//0.0
    private static int compteur;

    private ArrayList<Transaction> transactions=new ArrayList<>();
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public EtatTransaction addTransaction(Transaction transaction){
        if (transaction.getType()==TypeTransaction.Retrait) {
              if (transaction.getMontant()<=solde) {
                  solde -=transaction.getMontant();
                  transactions.add(transaction);
                  return EtatTransaction.Success_Retrait;
              }else{
                 return EtatTransaction.Error_Retrait;
              }
        }
          solde +=transaction.getMontant();
          transactions.add(transaction);
          return EtatTransaction.Success_Depot;
    }

    public Compte() {
    }
    public Compte(int id, String numero, LocalDate dateCreation, double solde) {
        this.id = id;
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }
    public Compte( String numero, double solde) {
        this.id = ++compteur;
        this.numero = numero;
        this.solde = solde;
        this.dateCreation=LocalDate.now();
    }

    @Override
    public String toString() {
        return "Compte [id=" + id + ", numero=" + numero + ", dateCreation=" + dateCreation + ", solde=" + solde + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public LocalDate getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    


}
