package Business;

import ToyProduct.Toy;
import ToyProduct.models.AsianCarToy;
import ToyProduct.models.AsianHelicopterToy;

public class AsianToyBusiness1 extends ToyBusiness{

    @Override
    public Toy createToy(String type){
        switch(type){
            case "car":
                AsianCarToy car = new AsianCarToy(this.sn.next());
                car.pack(); car.label();
                return car;
                
            case "helicopter":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(this.sn.next());
                helicopter.pack(); helicopter.label();
                return helicopter;
                
            default:
                return null;
        }
    }    
}
