package services;

import java.util.ArrayList;

import entity.Classe;
import entity.Etudiant;
import entity.Filiere;
import entity.Inscription;

public class InscriptionService {
    private ArrayList<Inscription> inscriptions=new ArrayList<>();
     public void addInscription(double frais,Classe classe, Etudiant etudiant){
        Inscription inscription=new Inscription();

        inscription.setFrais(frais);
        //Inscription vers Etudiant
          inscription.setEtudiant(etudiant);
        //Etudiant vers  Inscription 
          etudiant.addInscription(inscription);

        //Inscription vers Classe
        inscription.setClasse(classe);
       //Classe vers Inscription  
        classe.addInscription(inscription);

        inscriptions.add(inscription);


     }

     public ArrayList<Inscription> getAllInscriptions() {
        return inscriptions;
     }

     public ArrayList<Inscription> getAllInscriptions(Filiere filiere) {
        ArrayList<Inscription> inscriptionsDelaFiliere=new ArrayList<>();
        for (int index = 0; index < inscriptions.size(); index++) {
                 Inscription inscription=inscriptions.get(index);
                 if (inscription.getClasse().getFiliere().equals(filiere)) {
                    inscriptionsDelaFiliere.add(inscription);
                 }
        }
        return inscriptionsDelaFiliere;
     }

     public ArrayList<Inscription> getAllInscriptions(Classe classe) {
        ArrayList<Inscription> inscriptionsDelaClasse=new ArrayList<>();
        for (int index = 0; index < inscriptions.size(); index++) {
                 Inscription inscription=inscriptions.get(index);
                 if (inscription.getClasse().equals(classe)) {
                    inscriptionsDelaClasse.add(inscription);
                 }
        }
        return inscriptionsDelaClasse;
     }
}
