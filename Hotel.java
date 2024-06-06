import java.util.ArrayList;
import java.util.Date;

public class Hotel {
    private String name;
    private String address;
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Hotel(){

    }
    public Hotel(String name, String address, ArrayList<Room> rooms, ArrayList<Reservation> reservations){
        this.name = name;
        this.address = address;
        this.reservations = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }
    public ArrayList<Room> searchRooms(Date checkInDate, Date checkOutDate, RoomCategory category){
        ArrayList<Room> availableRoom = new ArrayList<>();
        for (Room room : rooms) {
           if(category == null || category == room.getCategory()){
            if(room.isAvailable(checkInDate, checkOutDate)){
                availableRooms.add(room);
            }
           } 
        }
        return availableRoom;
    }
}