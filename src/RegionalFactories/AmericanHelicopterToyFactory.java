package RegionalFactories;

import ToyProduct.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends Factories.ToyFactory{

    @Override
    public ToyProduct.Toy createToy(Integer sn){
        return new AmericanHelicopterToy(sn);
    } 
}
