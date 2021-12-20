package Business;

import Factories.ToyFactory;
import ToyProduct.Toy;

public class ToyBusiness {
    
    private final ToyFactory ToyFactory;
    
    public ToyBusiness(ToyFactory tf){
        this.ToyFactory = tf;
    }
            
    public Toy produceToy(String type){
        return this.ToyFactory.produceToy(type);
    }
}
