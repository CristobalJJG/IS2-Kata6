package ToyProduct.models;


public class AsianHelicopterToy implements ToyProduct.Toy{
    private final int serialNumber;
    final String type = "helicopter";
   
    public AsianHelicopterToy(int serialNumber){
        this.serialNumber = serialNumber;
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }    
    
    public String getType() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing %s %d\n", this.type, this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling %s %d\n", this.type, this.serialNumber);
    }
    
    @Override
    public String toString() {
        return "AsianHel{" + "S/N=" + serialNumber + '}';
    }
}
