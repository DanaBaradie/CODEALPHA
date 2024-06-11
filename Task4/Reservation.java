package Task4;

public class Reservation {
    private String visitorName;
    private String visitorID;
    private String ReservationID;
    private Room room;

    public Reservation(String visitorName, String visitorID, String ReservationID){
        this.visitorName = visitorName;
        this.visitorID = visitorID;
        this.ReservationID = ReservationID;
        this.room = room;
    }
    public String getVisitorName() {
        return visitorName;
    }
    public String getVisitorID() {
        return visitorID;
    }
    public String getReservationID() {
        return ReservationID;
    }
    public String displayInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Visitor name: " + this.visitorName);
        stringBuilder.append("Visitor ID: " + this.visitorID);
        stringBuilder.append("Room Number: " + room.getRoomNum());
        stringBuilder.append("Room type: " + room.getRoomType());
        stringBuilder.append("Room price: " + room.getPrice());
        String finalstb = stringBuilder.toString();
        return finalstb;
    }
}