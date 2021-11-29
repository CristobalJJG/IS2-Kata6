package Toys;

public class SerialNumberGenerator {
    private int number = 0;
    
    public int next(){
        return this.number++;
    }
}
