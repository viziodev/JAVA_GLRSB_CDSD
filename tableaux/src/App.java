import java.util.Scanner;

import entity.Telephone;
import services.TelephoneService;
import vues.TelephoneVue;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
         Scanner scanner ;//Reservation espace dans la zone de reference
         scanner=new Scanner(System.in); //Instanciation, creer la zone de valeurs
         TelephoneVue telephoneVue =new TelephoneVue();
         TelephoneService telephoneService =new TelephoneService();
          Telephone phone;
          phone=new Telephone();
         
         
        do {
            System.out.println("1-Ajouter un numero dans le Tableau");
            System.out.println("2-Lister les numeros du tableau");
            System.out.println("3-Trier les numeros du tableau");
            System.out.println("4-Quitter");
            choix=scanner.nextInt();
            switch (choix) {
                case 1:
                   //a-Saisie du Telephone  ==> saisie se trouve TelephoneVue
                     Telephone telephone=  telephoneVue.saisie();
                   //b-Ajouter le telephone dans le tableau
                    telephoneService.addTelephone(telephone);
                break;
                case 2:
                   telephoneVue.affiche(telephoneService.getTelephones(), telephoneService.getNbreTelephone());
                break;
                default:
                    break;
            }
           
        } while (choix!=4);
        
}
}
