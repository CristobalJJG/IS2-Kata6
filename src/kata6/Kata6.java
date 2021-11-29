package kata6;

import Toys.Car;
import Toys.Helicoptero;
import Toys.SerialNumberGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator sn = new SerialNumberGenerator();
        
        List<Car> cars = new ArrayList<>();
        List<Helicoptero> helicopters = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            switch(line){
                case "car":
                    Car car = new Car(sn.next());
                    car.pack(); car.label();
                    cars.add(car);
                    System.out.println(
                            "Built cars: " + cars.stream()
                                    .map(c -> c.getSerialNumber() + "")
                                    .collect(Collectors.joining(", ")));
                    break;
                    
                case "helicopter":
                    Helicoptero helicopter = new Helicoptero(sn.next());
                    helicopter.pack(); helicopter.label();
                    helicopters.add(helicopter);
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
