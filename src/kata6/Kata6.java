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
        
        AmericanToyFactory USAFactory = new AmericanToyFactory();
        AsianToyFactory AsianFactory = new AsianToyFactory();
        
        ToyBusiness toyBusiness = new ToyBusiness(AsianFactory);
       
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            switch(line){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.produceToy(line));
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
