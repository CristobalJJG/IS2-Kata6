package RegionalFactories;

import ToyProduct.models.AsianCarToy;
import ToyProduct.models.AsianHelicopterToy;

public class AsianToyFactory extends Factories.ToyFactory{

    @Override
    public ToyProduct.Toy createToy(String type){
        switch(type){
            case "car":
                return new AsianCarToy(this.sn.next());
                
            case "helicopter":
                return new AsianHelicopterToy(this.sn.next());
                
            default:
                return null;
        }
    }
}
