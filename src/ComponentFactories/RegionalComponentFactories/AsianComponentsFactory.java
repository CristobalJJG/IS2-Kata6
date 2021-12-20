package ComponentFactories.RegionalComponentFactories;

import ToyProduct.components.Asian.*;
import ToyProduct.components.*;

public class AsianComponentsFactory extends ComponentFactories.ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        return new AsianEngine();
    }

    @Override
    public Rotorblade createRotorblade() {
        return new AsianRotorblade();
    }
    
}
