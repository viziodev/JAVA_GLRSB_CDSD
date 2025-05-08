package entity;

import java.time.LocalDate;

public class Inscription {
    private LocalDate date=LocalDate.now();
    private double frais;
    
    //Navigabilite
    private Etudiant etudiant;
    private Classe classe;
    private Secretaire secretaire;

    
    public Secretaire getSecretaire() {
        return secretaire;
    }
    public void setSecretaire(Secretaire secretaire) {
        this.secretaire = secretaire;
    }
    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public Etudiant getEtudiant() {
        return etudiant;
    }
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
   

    public LocalDate getDate() {
        return date;
    }
    public double getFrais() {
        return frais;
    }
    public void setFrais(double frais) {
        this.frais = frais;
    }
    @Override
    public String toString() {
        return "Inscription [date=" + date + ", frais=" + frais + "]";
    }


    
}
