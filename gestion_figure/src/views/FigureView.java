package views;

import java.util.Scanner;

import entity.Carre;
import entity.Figure;
import entity.Rectangle;

public class FigureView {
    private static Scanner scanner=new Scanner(System.in);

    public static  Figure saisieFigure(){
        Figure figure;

        
        int type;
        do {
              System.out.println("0-RECTANGLE");
              System.out.println("1-CARRE");
              System.out.println("Veuillez choisir le type de Figure");
              type=scanner.nextInt();
        } while (type!=0 && type!=1);

        if (type==1) {
            System.out.println("Entrer le cote du Carre");
            figure=new Carre(scanner.nextDouble());
        } else {
            System.out.println("Entrer la longeur");
            double longueur=scanner.nextDouble();

            System.out.println("Entrer la longeur");
            double largeur=scanner.nextDouble();

            figure=new Rectangle(longueur,largeur);
        }
        return figure;

    }
}
