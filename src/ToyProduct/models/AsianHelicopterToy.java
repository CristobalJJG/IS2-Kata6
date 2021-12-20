package ToyProduct.models;

import ComponentFactories.RegionalComponentFactories.AmericanComponentsFactory;
import ComponentFactories.RegionalComponentFactories.AsianComponentsFactory;
import ToyProduct.components.*;


public class AsianHelicopterToy implements ToyProduct.Toy{
    private final int serialNumber;
    final String type = "helicopter";
    private Engine engine;
    private Rotorblade Rotorblade;
    private final ComponentFactories.ComponentFactory factory;
   
    public AsianHelicopterToy(int serialNumber){
        this.serialNumber = serialNumber;
        this.factory = new AsianComponentsFactory();
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

    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        System.out.print("(Motor Creado)");
        this.Rotorblade = this.factory.createRotorblade();
        System.out.println("-(Rotor Creado)");
    }
}
