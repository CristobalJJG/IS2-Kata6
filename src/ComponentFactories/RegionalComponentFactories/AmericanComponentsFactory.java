package ComponentFactories.RegionalComponentFactories;

import ToyProduct.components.American.*;
import ToyProduct.components.*;

public class AmericanComponentsFactory extends ComponentFactories.ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        return new AmericanEngine();
    }

    @Override
    public Rotorblade createRotorblade() {
        return new AmericanRotorblade();
    }
    
}
