package entity;
//Suite de constantes 
public enum TypeTransaction {

    Retrait(2),Depot(1);

    private TypeTransaction(int value) {
        this.value = value;
    }

    private final int value;
    
}
