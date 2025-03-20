package entity;
public class Telephone {
    //Attributs
      private String valeur;
      //Constructeur 
      public Telephone(){

      }
     //Getters
      public String getValeur(){
          return valeur;
      }
      //Setters
      public void setValeur(String val){
        valeur=val;
      }

      //Metiers
      public void copy(Telephone telephone){
          valeur=telephone.getValeur();
      }
      public boolean egal(Telephone telephone){
         return telephone.getValeur().equals(valeur);
      }

      public String toChaine(){
        return " Telephone: " + valeur;
      }
      public  ErreurTelephone isValid(){
        //0,1,2,3==> Code Erreur
         if (valeur.length()!=9) return ErreurTelephone.ErreurNbreChiffre;
         if(!valeur.substring(0,2).equals("77") && !valeur.substring(0,2).equals("78"))return ErreurTelephone.ErreurIndex;
          char [] caracteres=valeur.toCharArray();
          ErreurTelephone isValid=ErreurTelephone.Succes;
          for (int index = 0; index < caracteres.length; index++) {
              if (caracteres[index]<'0' || caracteres[index]>'9') {
               return ErreurTelephone.ErreurChiffre;
              }
          }
          return isValid;
      }



}
