package ComponentFactories;

import ToyProduct.components.*;

public abstract class ComponentFactory {
    public abstract Wheel createWheel();
    public abstract Engine createEngine();
    public abstract Rotorblade createRotorblade();
}
