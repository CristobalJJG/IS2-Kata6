package Factories;

import ToyProduct.Toy;

public abstract class ToyFactory {
    
    public Toy produceToy(Integer sn){
        Toy toy = this.createToy(sn);
        toy.prepare();
        toy.pack(); 
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(Integer sn);
}
