package Business;

import ToyProduct.Toy;
import ToyProduct.models.AmericanCarToy;
import ToyProduct.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type){
        switch(type){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.sn.next());
                car.pack(); car.label();
                return car;
                
            case "helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.sn.next());
                helicopter.pack(); helicopter.label();
                return helicopter;
                
            default:
                return null;
        }
    }    
}
