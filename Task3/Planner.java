package Task3;

import java.util.Scanner;

public class Planner {
    public static void main(String[] args) {
     Scanner inn = new Scanner(System.in);
     Path path1 = new Path();
     WeatherInfo weatherInfo = new WeatherInfo();
     Map map = new Map();
     BuddgetCalculator buddgetCalculator = new BuddgetCalculator();
     
     System.out.println("Enter your budget: ");
     double budget = inn.nextDouble();

     System.out.println();

     System.out.println("You prefer warm weather, right? (Answer either true or false)");
     boolean WarmWeathern= inn.nextBoolean();

     Preferences preferences = new Preferences(WarmWeathern, budget);

     while(true){
        System.out.println("Enter done to finish this program.");
        System.out.println("Enter destination name: ");
        String destinationName = inn.next();
        if(destinationName.equalsIgnoreCase("done")){
            break;
        }
        System.out.println("Enter the country you wantto arrive to: ");
        String countryName = inn.next();
        System.out.println("Enter date for " + destinationName );
        String date = inn.next();
        Destination destination = new Destination(destinationName, countryName);
        path1.addDestination(destination, date);

        System.out.println("Your travel Path: ");
        path1.displayPath();
     }
        for (Destination destination : path1.getDestinations()) {
            String weather = weatherInfo.getWeather(destination.getName());
            String mapInfo = map.getMap(destination.getName());
            System.out.println(destination.getName() + " weather: " + weather);
            System.out.println(destination.getName() + " map: " + mapInfo);
        }

        double calculations = buddgetCalculator.calculateBudget(path1);
        System.out.println("Budget: " + calculations + "$");
        if(calculations > budget){
            System.out.println("The calculated budget is greater than your initial balance.");
        }else{
            System.out.println("You travel plan suits your budget>");
        }
    
    }
}