package entity;

public class Carre extends Figure {
    /*
     *  1-Classe Fille devient abstract
     *  2-Redefinir les methodes abstractes en des methodes concretes
     * 
     * 
     */
    private double cote;
    public Carre( double cote) {
        super(TypeFigure.CARRE); //Figure(diagonale)
        this.cote = cote;
    }
    public Carre() {
        super(); //Figure()
        
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
        this.diagonale=Math.sqrt(Math.pow(cote, 2)+Math.pow(cote, 2));
    }

    @Override
    public String toString() {
        return "Carre [cote=" + this.cote + ", diagonale=" + super.diagonale + "]";
    }

    @Override
    public double perimetre() {
       
        return cote*4;
    }

    @Override
    public double surface() {
        return cote*cote;
    }
}
