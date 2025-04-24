import java.time.LocalDate;

public class Etudiant extends Personne {
    private LocalDate dateNaiss;
    private String classe;
    public LocalDate getDateNaiss() {
        return dateNaiss;
    }
    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public  Etudiant(){
       
    }
}
