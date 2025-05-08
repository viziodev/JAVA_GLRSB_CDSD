package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Inscription;


public class InscriptionView {
    private Scanner scanner=new Scanner(System.in);
   

    public void inscrireEtudiant(){
          
    }

    public void listerInscrits(ArrayList<Inscription> inscriptions){
       for (int index = 0; index < inscriptions.size(); index++) {
           System.out.println(inscriptions.get(index));
       }
    }
}
