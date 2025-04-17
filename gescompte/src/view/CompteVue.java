package view;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Compte;
import services.CompteService;

public class CompteVue {
    
    private static Scanner scanner=new Scanner(System.in);
    private static double saisieDouble(){
        double val;
        do {
            System.out.println("Entrer le solde");
            val=scanner.nextDouble();
          } while (val<=0);
        return val;
       }
    private  CompteVue(){

    }
    private static String num;
   public static  Compte saisiCompte(){
     Compte cpt;
     do {
        cpt= verifNumCompte();
     } while (cpt!=null);
      double solde=saisieDouble();
      return  new Compte(num,solde);
   }

   public static Compte verifNumCompte(){
           System.out.println("Entrer le numero");
           num=scanner.next();
     return CompteService.searchCompteByNum(num);
   }

   public static void afficheCompte(ArrayList<Compte> comptes){
      for (Compte cp : comptes) {
          System.out.println(cp);
      }
   }
}
