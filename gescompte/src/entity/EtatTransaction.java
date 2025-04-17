package entity;

public enum EtatTransaction {
    Success_Retrait("Retait effectue avec sucees"),
    Error_Retrait("Le Solde insufisant") ,
    Success_Depot("Depot effectue avec sucees");

    private EtatTransaction(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private final String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }
   

}
