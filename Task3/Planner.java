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

        System.out.println("Do you prefer warm weather? ");
        boolean WarmWeather = inn.nextBoolean();
    }
}
