package Task3;

public class Preferences{
    private boolean WarmWeather;
    private double budget;

    public Preferences(boolean WarmWeather, double budget){
        this.WarmWeather = WarmWeather;
        this.budget = budget;
    }
    public double getBudget() {
        return budget;
    }
    public boolean isWarmWeather(){
        return WarmWeather;
    }
}