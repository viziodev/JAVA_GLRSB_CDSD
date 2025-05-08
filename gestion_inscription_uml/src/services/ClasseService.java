package services;

import java.util.ArrayList;

import entity.Classe;

public class ClasseService {
  private ArrayList<Classe>   classes=new ArrayList<>();

  public ClasseService() {
    classes.add(new Classe("GLRS","L2 GLRS A"));
    classes.add(new Classe("GLRS","L2 GLRS B"));
    classes.add(new Classe("CDSB","L2 CDSB"));
    classes.add(new Classe("MAE", "L2 MAE"));
  }

  public Classe getClasseById (int id){
     for (int index = 0; index < classes.size(); index++) {
          if (classes.get(index).getId()==id) {
               return  classes.get(index);
          }
     }
     return null;
  }

  public ArrayList<Classe> getAllClasse (){
      return classes;
  }
  


}
