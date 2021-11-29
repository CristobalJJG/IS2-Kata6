package Business;

import ToyProduct.Toy;
import Toys.SerialNumberGenerator;

public abstract class ToyBusiness {
    protected final SerialNumberGenerator sn = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
}
