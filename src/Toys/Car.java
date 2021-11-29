package Toys;

public class Car {
    private final int serialNumber;
    
    public Car(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    
    public void pack(){
        System.out.printf("Packing Car '%d'\n", this.serialNumber);
    }
    
    public void label(){
        System.out.printf("Labelling Car '%d'\n", this.serialNumber);
    }
}
