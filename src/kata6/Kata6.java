package kata6;

import ToyProduct.Toy;
import Business.ToyBusiness;
import RegionalFactories.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kata6 {
   
    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();
        
        ToyBusiness toyBusiness = new ToyBusiness();
        
        toyBusiness.add("car", new AmericanCarToyFactory());
        toyBusiness.add("helicopter", new AsianHelicopterToyFactory());
        toyBusiness.add("submarine", new AmericanSubmarineToyFactory());
       
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            switch(line.toLowerCase()){
                case "car":
                case "submarine":
                case "helicopter":
                    toys.add(toyBusiness.produceToy(line.toLowerCase()));
                    System.out.println(
                    "Built toys: " + toys.stream()
                           .map(c -> c.toString())
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
