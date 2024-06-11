package Task4;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Hotel(){
        this.reservations = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }
    public void removeRoom(int roomNum){
        for (Room room : rooms) {
            if(room.getRoomNum() == roomNum){
                rooms.remove(room);
                break;
            }
        }
    }
    public void cancelReservation(String visitorID){
        for (Reservation reservation : reservations) {
            if(reservation.getVisitorID().equalsIgnoreCase(visitorID)){
                reservations.remove(reservation);
                break;
            }
        }
    }
    public  Room getRoom(int roomNum){
        for (Room room : rooms) {
            if(room.getRoomNum() == roomNum){
                return room;
            }
        }
        return null;
    }
    public Reservation getDetails(String ReservationID){
        for (Reservation reservation : reservations) {
            if(reservation.getReservationID() == ReservationID){
                return reservation;
            }
        }
        return null;
    }
    public ArrayList<Room> AvailableRoom(){
        ArrayList<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if(room.RoomAvailability()){
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
    public ArrayList<Reservation> CurrentReservations(){
        return new ArrayList<>(reservations);
    }
    public void Payment(String ReservationID, PaymentProcess paymentProcess){
        String CVV = paymentProcess.getCVV();
        String card = paymentProcess.getCardNumber();
        if(paymentProcess.validateCVV(CVV)&&paymentProcess.validateCardNumber(card)){
            System.out.println("Paying $"+paymentProcess.getAmount()+" with card Number: " + card + " and a CVV: " + CVV);
        }else{
            System.out.println("Invalid CVV or cardNumber, try again.");
        }
    }
}