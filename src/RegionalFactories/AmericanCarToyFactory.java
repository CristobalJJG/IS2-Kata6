package RegionalFactories;

import ToyProduct.models.AmericanCarToy;

public class AmericanCarToyFactory extends Factories.ToyFactory{

    @Override
    public ToyProduct.Toy createToy(Integer sn){
        return new AmericanCarToy(sn);
    } 
}
