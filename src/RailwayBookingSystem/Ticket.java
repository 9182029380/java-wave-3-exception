package RailwayBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    public static void main(String[] args) {
        System.out.println("Welcome to Railway Booking System");
        RailwayBooking railwayBookingSystem = new RailwayBooking();
        List<Passenger> passengerList = new ArrayList<>();
        passengerList.add(new Passenger("John", 30,  "A1"));
        passengerList.add(new Passenger("Jane", 25, "B2"));
        passengerList.add(new Passenger("Bob", 35, "C3"));
        passengerList.add(new Passenger("Alice", 40, "D4"));
        passengerList.add(new Passenger("Mike", 34, "E5"));

        try{
            railwayBookingSystem.bookticket(passengerList);
        }catch (TicketBookingException | TicketLimitExceededException | InvalidPassengerDetails e){
            System.out.println("Error booking tickets: " + e.getMessage());
        }

    }

}
