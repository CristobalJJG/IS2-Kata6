package kata6;

import Toys.Car;
import Toys.Helicopter;
import Toys.SerialNumberGenerator;
import Toys.ToyBusiness;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import javax.management.MBeanTrustPermission;

public class Kata6 {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        
        
        
        List<Car> cars = new ArrayList<>();
        List<Helicopter> helicopters = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            switch(line){
                case "car":
                    cars.add(business.createCar());
                    System.out.println(
                            "Built cars: " + cars.stream()
                                    .map(c -> c.getSerialNumber() + "")
                                    .collect(Collectors.joining(", ")));
                    break;
                    
                case "helicopter":
                    helicopters.add(business.createHelicopter());
                    System.out.println(
                            "Built cars: " + helicopters.stream()
                                    .map(c -> c.getSerialNumber() + "")
                                    .collect(Collectors.joining(", ")));
                    break;
                    
                case "exit":
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Command unknown!");
            }
        }        
    }
}
