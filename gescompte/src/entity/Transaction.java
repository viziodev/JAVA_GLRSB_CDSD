package entity;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private TypeTransaction type;
    private double montant;
    private LocalDate date;
    private static int compteur;

    public Transaction(TypeTransaction type, double montant) {
         id=++compteur;
        this.type = type;
        this.montant = montant;
         date=LocalDate.now();
    }
    public Transaction(int id, TypeTransaction type, double montant, LocalDate date) {
        this.id = id;
        this.type = type;
        this.montant = montant;
        this.date = date;
    }
    public Transaction() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public TypeTransaction getType() {
        return type;
    }
    public void setType(TypeTransaction type) {
        this.type = type;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public static int getCompteur() {
        return compteur;
    }
    public static void setCompteur(int compteur) {
        Transaction.compteur = compteur;
    }
    @Override
    public String toString() {
        return "Transaction [id=" + id + ", type=" + type + ", montant=" + montant + ", date=" + date + "]";
    }

    

    
  
}
