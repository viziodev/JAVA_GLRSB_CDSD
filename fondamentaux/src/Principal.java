import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
         Scanner scanner ;
         scanner=new Scanner(System.in);
         System.out.println("Entrer un entier");
         int x=scanner.nextInt();
         System.out.println("Entrer un reel");
         double y=scanner.nextDouble();
         double somme=x+y;
         System.out.println("La somme est "+ somme);
        
        scanner.close();

       
    }
}
