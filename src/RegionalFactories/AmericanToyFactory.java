package RegionalFactories;

import ToyProduct.models.AmericanCarToy;
import ToyProduct.models.AmericanHelicopterToy;

public class AmericanToyFactory extends Factories.ToyFactory{

    @Override
    public ToyProduct.Toy createToy(String type){
        switch(type){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.sn.next());
                return car;
                
            case "helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.sn.next());
                return helicopter;
                
            default:
                return null;
        }
    } 
    
}
