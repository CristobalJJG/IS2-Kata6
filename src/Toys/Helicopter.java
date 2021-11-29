package Toys;

public class Helicopter {
    private final int serialNumber;
    final String type = "helicopter";
   
    public Helicopter(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    
    public String getType() {
        return type;
    }
    
    public void pack(){
        System.out.printf("Packing %s %d\n", this.type, this.serialNumber);
    }
    
    public void label(){
        System.out.printf("Labelling %s %d\n", this.type, this.serialNumber);
    }
}
