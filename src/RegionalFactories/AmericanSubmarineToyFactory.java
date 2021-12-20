package RegionalFactories;

import ToyProduct.models.AmericanSubmarineToy;

public class AmericanSubmarineToyFactory extends Factories.ToyFactory{

    @Override
    public ToyProduct.Toy createToy(Integer sn){
        return new AmericanSubmarineToy(sn);
    } 
}
