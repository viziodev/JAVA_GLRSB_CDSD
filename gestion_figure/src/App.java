import entity.Carre;
import entity.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
       Carre c1=new Carre();
       c1.setCote(10);
       System.out.println(c1.toString());
       Rectangle r1=new Rectangle(10, 8);
       System.out.println(r1.toString());

     
    }
}
