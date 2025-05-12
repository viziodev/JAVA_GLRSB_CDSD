package entity;
//public class Figure  extend Object
public abstract  class Figure {
      protected double diagonale;
      public abstract double perimetre();
      public abstract double surface();

      //ManyTOne
      protected TypeFigure type;


      public Figure(TypeFigure type) {
        this.type = type;
    }
      public TypeFigure getType() {
        return type;
    }
      public void setType(TypeFigure type) {
          this.type = type;
      }
      protected Figure(double diagonale) {
        this.diagonale = diagonale;
      }

      protected Figure() {
      }

      public   double getDiagonale() {
          return diagonale;
      }

      public void setDiagonale(double diagonale) {
          this.diagonale = diagonale;
      }

      @Override
      public String toString() {
        return "Figure [diagonale=" + diagonale + "]";
      }
      
}
