package services;

import java.util.ArrayList;

import entity.Etudiant;
import entity.Personne;

public class PersonneService {
    private ArrayList<Personne> personnes=new ArrayList<>();

    public void addEtudiant(Etudiant etudiant){
        personnes.add(etudiant);
    }

}
