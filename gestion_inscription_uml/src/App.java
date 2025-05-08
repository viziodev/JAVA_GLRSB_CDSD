import java.util.Scanner;

import entity.Classe;
import entity.Filiere;
import services.InscriptionService;
import views.InscriptionView;

public class App {
     private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choix;
        InscriptionView inscriptionView =new InscriptionView();
        InscriptionService inscriptionService =new InscriptionService();
          do {
                choix=menu();

                switch (choix) {
                    case 1:

                        
                    break;
                    case 2: 
                    inscriptionView.listerInscrits(inscriptionService.getAllInscriptions());
                    break;

                    case 3:
                    System.out.println("Entrer le libelle de la Filiere");
                    String nomFiliere=scanner.nextLine();
                    Filiere filiere=new Filiere(nomFiliere);
                    inscriptionView.listerInscrits(inscriptionService.getAllInscriptions(filiere));
                    break;
                    case 4:  
                    
                    System.out.println("Entrer le libelle de la Classe");
                      String nomClasse=scanner.nextLine();
                      Classe classe= new Classe(nomClasse);
                      inscriptionView.listerInscrits(inscriptionService.getAllInscriptions(classe));
                    break;
                    
                
                    default:
                        break;
                }
          } while (choix!=5);
    }


public static int menu(){
     System.out.println("1-Inscrire un Etudiant");
     System.out.println("2-Lister tous les inscrits");
     System.out.println("3-Lister  les inscrits Par Filiere");
     System.out.println("4-Lister les inscrits par classe");
     System.out.println("5-Quitter");
     return scanner.nextInt();
  }
}
