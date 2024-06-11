package Task4;

public class Room {
    private String roomType;
    private int roomNum;
    private int price;
    private boolean RoomAvailability;

    public Room(String roomType, int roomNum, int price){
        this.roomType = roomType;
        this.roomNum = roomNum;
        this.price = price;
        this.RoomAvailability = true;
    }
    public int getPrice() {
        return price;
    }
    public int getRoomNum() {
        return roomNum;
    }
    public String getRoomType() {
        return roomType;
    }
    public boolean RoomAvailability(){
        return RoomAvailability;
    }
    public void setRoomAvailability(boolean roomAvailability) {
        RoomAvailability = roomAvailability;
    }
}