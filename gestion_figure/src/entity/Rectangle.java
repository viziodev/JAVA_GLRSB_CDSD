package entity;

public class Rectangle extends Figure {
     private double longeur; 
     private double largeur;

     
     public Rectangle( double longeur, double largeur) {
        super(TypeFigure.RECTANGLE);
        this.longeur = longeur;
        this.largeur = largeur;
        this.diagonale=Math.sqrt(Math.pow(longeur, 2)+Math.pow(largeur, 2));
    }


       public Rectangle() {
       }


       public double getLongeur() {
           return longeur;
       }


       public void setLongeur(double longeur) {
           this.longeur = longeur;
       }


       public double getLargeur() {
           return largeur;
       }


       public void setLargeur(double largeur) {
           this.largeur = largeur;
       }


       @Override
       public String toString() {
        return "Rectangle [longeur=" + longeur + ", diagonale=" + diagonale + ", largeur=" + largeur + "]";
       }


       @Override
       public double perimetre() {
            return 2*(longeur+largeur);
       }


       @Override
       public double surface() {
        return longeur*largeur;
       }
     
     
     
     

     
}