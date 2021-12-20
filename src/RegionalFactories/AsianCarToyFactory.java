package RegionalFactories;

import ToyProduct.models.AsianCarToy;

public class AsianCarToyFactory extends Factories.ToyFactory{

    @Override
    public ToyProduct.Toy createToy(Integer sn){
        return new AsianCarToy(sn);
    } 
}
