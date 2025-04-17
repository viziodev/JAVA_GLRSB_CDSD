import java.util.Scanner;
import entity.Compte;
import entity.EtatTransaction;
import entity.Transaction;
import entity.TypeTransaction;
import services.CompteService;
import view.CompteVue;
import view.MenuEnum;
import view.TransactionVue;



public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        MenuEnum choix;
         do {
              choix=menu();
              switch (choix) {
                case Add_Compte:
                    Compte cp =CompteVue.saisiCompte();
                    if(CompteService.addCompte(cp)){
                        double montant=cp.getSolde();
                        cp.setSolde(0);
                        cp.addTransaction(new Transaction(TypeTransaction.Depot,montant));
                        System.out.println("Compte ajoute avec success");
                    }
                    break;
              
               case Show_Compte:
                   CompteVue.afficheCompte(CompteService.getAllComptes());
                    break;
                case Add_Transaction_Compte:
                    cp= CompteVue.verifNumCompte();
                    if (cp!=null) {
                        Transaction trans =TransactionVue.saisieTransaction();
                         EtatTransaction etatTransaction= cp.addTransaction(trans);
                         System.out.println(etatTransaction.getErrorMessage());
                    }else{
                         System.out.println("Aucun Compte correspond a ce numero");
                    }
                    break;
                case Show_Transaction_Compte:
                cp= CompteVue.verifNumCompte();
                if (cp!=null) {
                         TransactionVue.afficheTransaction(cp.getTransactions());
                }else{
                    System.out.println("Aucun Compte correspond a ce numero");
                }
                     break;
                default:
                    break;
              }
         } while (choix!=MenuEnum.Quitter);
    }

    public static  MenuEnum menu(){
        System.out.println("1-Ajouter  un  compte dans un Liste\n" + //
                        "2-Afficher les comptes du Liste\n" + //
                        "3-Ajouter  une Transaction à un compte\n" + //
                        "4-Lister les transactions d’un compte\n" + //
                        "5-Quitter\n" + //
                        "");
        System.out.println("Faites votre choix");
        return MenuEnum.getEnum(scanner.nextInt()) ;
        
    }
}
