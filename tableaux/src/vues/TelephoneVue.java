package vues;
import java.util.Scanner;
import entity.ErreurTelephone;
import entity.Telephone;
public class TelephoneVue {
     
    public Telephone saisie(){
        Telephone telephone = new Telephone();
        ErreurTelephone erreurTelephone ;
        do {
            telephone.setValeur(saisieChaine("Entrer un Telephone")); 
            erreurTelephone = telephone.isValid();
            switch (erreurTelephone) {
                case ErreurNbreChiffre:
                    System.out.println("Le telephone doit contenir 9 chiffre");
                    break;
                case ErreurIndex:
                    System.out.println("Le telephone ne commence pas par 77 ou 78");
                    break;
                case ErreurChiffre:
                    System.out.println("Le telephone ne  doit contenir que des chiffres");
                    break;
                default:
                    break;
            }
        } while (erreurTelephone!=ErreurTelephone.Succes);
        return telephone;
    
    } 

    private String saisieChaine(String message){
         Scanner scanner ;//Reservation espace dans la zone de reference
         scanner=new Scanner(System.in); //Instanciation, creer la zone de valeurs
         String ch;
            do {
                 System.out.println(message); 
                 ch = scanner.nextLine();
            } while (ch.isEmpty()); 
        return ch;  
    }

    public  void affiche(Telephone[] telephones,int nbreTelephone){
       for (int index = 0; index < nbreTelephone; index++) {
          System.out.println(telephones[index].toChaine());
       }
    }
}
