import java.util.ArrayList;

public class App {
    /*
     * Realiser un application  qui gere(ajouter/Lister)
     * des professseurs et des etudiants
     * Un professeur(id,nom,grade,tauxHoraire,nbreHeure)
     *   toChaine()  //id,nom,grade,tauxHoraire,nbreHeure
     *   calculSalaire() ==> tauxHoraire*nbreHeure
     * Un etudiant(id,nom,dateNaiss,classe)
     *   toChaine()  //id,nom,dateNaiss,classe
     *   calculAge()
     * Un Salle (id,nom)
     *   toChaine()  //id,nom,
     * 
     * Constat
     *   professeur,etudiant et  Classe ont des methodes et attributs communs
     *   Eviter La Redondance Attributs ou de methodes on utilise Heritage
     * 
     * Regles pour appliquer
     *  1. Ensembles de classe de meme type(Est un) ayant des  methodes et attributs communs
     *    Heritage
     *      Un Professeur est une Personne  ==> Professeur herite  Personne
     *      Un etudiant  est une Personne  ==>  Etudiant herite  Personne
     *      La Classe Personne va factoriser les methodes et attributs communs de  Professeur et Etudiant
     *   Avant Heritage
     *    * Un professeur(id,nom,grade,tauxHoraire,nbreHeure)
     *       toChaine()  //id,nom,grade,tauxHoraire,nbreHeure
     *      calculSalaire() ==> tauxHoraire*nbreHeure
     *    * Un etudiant(id,nom,dateNaiss,classe)
     *      toChaine()  //id,nom,dateNaiss,classe
     *      calculAge()
     *   Apres  Heritage
     *      -Personne(id,nom,)
     *          toChaine() //id,nom
     *       -Professeur herite  Personne i.e le Professeur a tous les methodes et les attributs de Personne
     *            -(tauxHoraire,nbreHeure) 
     *            -toChaine()//id,nom,grade,tauxHoraire,nbreHeure
     *            -calculSalaire() ==> tauxHoraire*nbreHeure
     *       -Etudiant herite  Personne i.e le Etudiant a tous les methodes et les attributs de Personne
     *           -(dateNaiss,classe)
     *           -toChaine()  //id,nom,dateNaiss,classe
     *           -calculAge()
     *    Pas Heritage  
     *      Salle n'est pas une Personne   ==>  Salle n'herite  pas  Personne
     *      Personne est la classe qui Generalise Etudiant et Professeur 
     */
    public static void main(String[] args) throws Exception {
        Personne p=new Personne();
        Etudiant et=new Etudiant();

        //Conversion
           //Fille vers Mere
             //Convertit un etudiant en personne
               Personne p1=new Etudiant();
               
          //De Mere Vers Fille ==> (Fille)objetMere
             //Convertit une personne en etudiant
             Etudiant etu=(Etudiant)p1;
             //Convertit un professeur en personne
                        p1=new Professeur();
             Professeur prof=(Professeur) p1;
                //Convertit un personne en professeur 
            //Objet p1 peut contenir une instance de etudiant ou de professeur
    
              ArrayList<Professeur> professeurs =new ArrayList<>();
              ArrayList<Etudiant> etudiants =new ArrayList<>();

              ArrayList<Personne> personnes =new ArrayList<>();
              personnes.add(new Etudiant());
              personnes.add(new Professeur());
              personnes.add(new Personne());

             ((Etudiant)personnes.get(0)).getClasse();
             ((Professeur)personnes.get(1)).getNbreHeure();




       
        
    }
}
