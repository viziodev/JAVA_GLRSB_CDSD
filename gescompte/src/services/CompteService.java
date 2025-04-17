package services;

import java.util.ArrayList;

import entity.Compte;

public class CompteService {
      private static ArrayList<Compte> comptes=new ArrayList<>();
      private CompteService(){

      }
      public static boolean addCompte(Compte compte){
          comptes.add(compte);
          return true;
      }

      public static ArrayList<Compte> getAllComptes(){
        return comptes;
    }

    public static Compte searchCompteByNum(String numero){
           for (Compte compte: comptes) {
              if (compte.getNumero().equals(numero)) {
                  return  compte;
              }
           }
           return null;
    }
}
