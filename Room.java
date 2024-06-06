public class Room {
    private int roomNumber;
    private RoomCategory category;
    private double price;
    private boolean availability;

    public Room(){

    }
    public Room(int roomNumber, RoomCategory category, double price, boolean availability){
        this.roomNumber = roomNumber;
        this.category = category;
        this.availability = availability;
        this.price = price;
    }
    public RoomCategory getCategory() {
        return category;
    }
    public boolean isAvailable(Date checkInDate, Date checkOutDate){
        return true;
    }
}