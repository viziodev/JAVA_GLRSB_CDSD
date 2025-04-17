package view;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Transaction;
import entity.TypeTransaction;

public class TransactionVue {
    private static Scanner scanner=new Scanner(System.in);
    private static double saisieDouble(){
        double val;
        do {
            System.out.println("Entrer le solde");
            val=scanner.nextDouble();
          } while (val<=0);
        return val;
    }

    public static Transaction saisieTransaction(){
        TypeTransaction type =saisieTypeTransaction();
        double montant =saisieDouble();
       return new Transaction(type,montant);
    }

    private static TypeTransaction saisieTypeTransaction(){
        int choix;
        do {
             System.out.println("1-Depot");
             System.out.println("2-Retrait");
             choix=scanner.nextInt() ;
        } while (choix!=1 && choix!=2);
        return choix==1?TypeTransaction.Depot:TypeTransaction.Retrait;
    }


    public static void afficheTransaction(ArrayList<Transaction> transactions){
      for (Transaction trans : transactions) {
          System.out.println(trans);
      }
   }



}
