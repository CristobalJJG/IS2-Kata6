package ToyProduct.models;

import ComponentFactories.RegionalComponentFactories.AsianComponentsFactory;
import ToyProduct.components.*;

public class AsianCarToy implements ToyProduct.Toy{
    private final int serialNumber;
    final String type = "car";
    private Wheel[] wheels = new Wheel[4];
    private Engine engine;
    private final ComponentFactories.ComponentFactory factory;
   
    public AsianCarToy(int serialNumber){
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
        return "AsianCar{" + "S/N=" + serialNumber + '}';
    }
    
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        System.out.print("(Motor creado)");
        for (int i = 0; i < wheels.length; i++) { 
            this.wheels[i] = this.factory.createWheel(); 
        }
        System.out.println("-(Ruedas creadas)");
    }
    
}
