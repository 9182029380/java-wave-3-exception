package RailwayBookingSystem;

public class TicketLimitExceededException extends Exception {
    public TicketLimitExceededException() {
        super("cannot book more than 5 ticket at a time");
    }
}
