package Toys;

public class ToyBusiness {
    private final SerialNumberGenerator sn = new SerialNumberGenerator();
    
    public ToyBusiness(){
        
    }
    
    public Car createCar(){
        Car car = new Car(this.sn.next());
        car.pack(); car.label();
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicopter = new Helicopter(this.sn.next());
        helicopter.pack(); helicopter.label();
        return helicopter;
    }
}
