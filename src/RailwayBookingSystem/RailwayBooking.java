package RailwayBookingSystem;

import java.util.List;

public class RailwayBooking {


    public void bookticket(List<Passenger> passengers) throws TicketBookingException, TicketLimitExceededException, InvalidPassengerDetails {
        if(passengers.size() > 5) {
            throw new TicketLimitExceededException();
        }
        for(Passenger passenger : passengers) {
            if(passenger.name==null||passenger.name.isEmpty()) {
                throw new InvalidPassengerDetails("Passenger name cannot be null or empty");
            }
            if(passenger.age<0) {
                throw new InvalidPassengerDetails("Passenger age cannot be negative");
            }
        }
        System.out.println("Ticket booked successfully");
        for(Passenger passenger :passengers) {
            System.out.println("name:-----> " + passenger.name+ "age-----> "+ passenger.age+ "berthpreference ----> "+ passenger.berthPreference);
        }


    }
}
