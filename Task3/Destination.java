package Task3;

public class Destination {
    private String name;
    private String country;

    public Destination(String name, String country){
        this.country = country;
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public String getName() {
        return name;
    }
}