package Task3;

import java.util.ArrayList;
public class Path {
    private ArrayList<Destination> destinations;
    private ArrayList<String> dates;

    public Path(){
        this.destinations = new ArrayList<>();
        this.dates = new ArrayList<>();
    }
    public void addDestination(Destination destination, String date){
        destinations.add(destination);
        dates.add(date);
    }
    public ArrayList<String> getDates() {
        return dates;
    }
    public ArrayList<Destination> getDestinations() {
        return destinations;
    }
    public void displayPath(){
        for (int i = 0; i < destinations.size(); i++) {
            System.out.println(dates.get(i) + " - " + destinations.get(i).getName() + ", " + destinations.get(i).getCountry());
        }
    }
}