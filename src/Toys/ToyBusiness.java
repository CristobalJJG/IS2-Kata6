package Toys;

import ToyProduct.Toy;
import ToyProduct.models.CarToy;
import ToyProduct.models.HelicopterToy;

public class ToyBusiness {
    private final SerialNumberGenerator sn = new SerialNumberGenerator();
    
    public ToyBusiness(){
        
    }
    
    public Toy createToy(String type){
        switch(type){
            case "car":
                CarToy car = new CarToy(this.sn.next());
                car.pack(); car.label();
                return car;
                
            case "helicopter":
                HelicopterToy helicopter = new HelicopterToy(this.sn.next());
                helicopter.pack(); helicopter.label();
                return helicopter;
                
            default:
                return null;
        }
    }
}
