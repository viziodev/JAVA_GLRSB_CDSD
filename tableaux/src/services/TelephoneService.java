package services;
import  entity.Telephone;

public class TelephoneService {
    private final int N=10;
    private Telephone[] telephones=new Telephone[N];
    private int nbreTelephone;

    public TelephoneService(){
        nbreTelephone=0;
    }

    public Telephone[] getTelephones(){
        return telephones;
    }
    public int getNbreTelephone(){
        return nbreTelephone;
    }

    public boolean addTelephone(Telephone telephone){
        if (nbreTelephone<N) {
            telephones[nbreTelephone]=telephone;
            nbreTelephone++;
            return true;
        }
        return false;
    }


}
