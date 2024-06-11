package Task4;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
       Scanner inn = new Scanner(System.in);
       Hotel hotel = new Hotel();
       Room room1 = new Room("Single", 27, 150);
       Room room2 = new Room("Double", 30, 200);
       Room room3 = new Room("VIP", 100, 350);
       hotel.addRoom(room1);
       hotel.addRoom(room2);
       hotel.addRoom(room3);

       while(true){
        System.out.println("1.List Available Rooms: ");
        System.out.println("2.Add Room");
        System.out.println("3.Make reservation");
        System.out.println("4.Cancel Reservation");
        System.out.println("5.View reservation details");
        System.out.println("6.Exist");
        
        System.out.print("Choose an option: ");
        int choice = inn.nextInt();

        if(choice == 1){
            listAvailableRooms(hotel);
        }else if(choice == 2){
            addRoom(inn, hotel);
        }else if(choice == 3){
            makeReservation(inn, hotel);
        }else if(choice == 4){
            cancelReservation(inn, hotel);
        }else if(choice == 5){
            viewReservationDetails(inn, hotel);
        }else if(choice == 6){
            System.out.println("You are welcome! ");
            System.exit(0);
        }else{
            System.out.println("Invalid choice. Try again");
        }
       }
    }
    private static void listAvailableRooms(Hotel hotel){
        System.out.println("Available rooms: ");
        for (Room room : hotel.AvailableRoom()) {
            System.out.println("Room Number: " + room.getRoomNum() + ", Type: " + room.getRoomType() + ", Price: " + room.getPrice()+"$");
        }
    }
    private static void addRoom(Scanner inn, Hotel hotel){
        System.out.print("Enter room type(Single,Double,VIP): ");
        String type = inn.next();
        System.out.print("Enter room number: ");
        int Num = inn.nextInt();
        System.out.print("Enter the room price: " );
        int price = inn.nextInt();
        System.out.println();

        Room room = new Room(type, Num, price);
        hotel.addRoom(room);
    }
    private static void makeReservation(Scanner inn, Hotel hotel){
        System.out.print("Enter visitor name: ");
        String Name = inn.next();
        System.out.print("Enter visitor ID: ");
        String ID = inn.next();
        System.out.print("Enter room number you want to reserve: ");
        int Num = inn.nextInt();
        System.out.println();
        Room room = hotel.getRoom(Num);

        if(room != null && room.RoomAvailability()){
            System.out.println("Enter reservation ID: ");
            String reservationID = inn.next();

            PaymentProcess paymentProcess = new PaymentProcess(room.getPrice(),getCardNum(inn) , getCVV(inn));
            if(paymentProcess.validateCardNumber(paymentProcess.getCardNumber()) && paymentProcess.validateCVV(paymentProcess.getCVV())){
                System.out.println("Your payment process goes all right.");
                room.setRoomAvailability(false);
                Reservation reservation = new Reservation(Name, ID, reservationID);
                hotel.addReservation(reservation);
                System.out.println("The reservation for " + Name + " is done.");
            }else{
                System.out.println("Invalid CVV or Card Number. Check them please.");
            }
        }else{
            System.out.println("Room is not available>Choose another");
        }
    }
    private static String getCardNum(Scanner inn){
        System.out.println("Enter card number : ");
        String cardNum = inn.nextLine();
        return cardNum;
    }
    private static String getCVV(Scanner inn){
        System.out.println("Enter CVV : ");
        String CVVNum = inn.nextLine();
        return CVVNum;
    }
    private static void cancelReservation(Scanner inn, Hotel hotel){
        System.out.println("Enter the visitor ID you want to cancel for: ");
        String vistorID = inn.nextLine();
        hotel.cancelReservation(vistorID);
        System.out.println("Done.");
    }
    private static void viewReservationDetails(Scanner inn , Hotel hotel){
        System.out.println("Enter your reservation ID: ");
        String reservationID = inn.nextLine();
        Reservation reservation = hotel.getDetails(reservationID);
        if(reservation!=null){
            System.out.println(reservation.displayInfo());
        }else{
            System.out.println("Not found.");
        }
    }
}