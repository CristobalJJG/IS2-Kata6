package Business;

import Factories.SerialNumberGenerator;
import Factories.ToyFactory;
import ToyProduct.Toy;
import java.util.HashMap;
import java.util.Map;

public class ToyBusiness {
    private final SerialNumberGenerator sn = new SerialNumberGenerator();
    private final Map<String, ToyFactory> ToyFactories = new HashMap<>();
            
    public void add(String type, ToyFactory toyFactory){
        ToyFactories.put(type, toyFactory);
    }
    
    
    public Toy produceToy(String type){
        return ToyFactories.get(type).produceToy(this.sn.next());
    }
}
