package RegionalFactories;

import ToyProduct.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends Factories.ToyFactory{

    @Override
    public ToyProduct.Toy createToy(Integer sn){
        return new AsianHelicopterToy(sn);
    } 
}
