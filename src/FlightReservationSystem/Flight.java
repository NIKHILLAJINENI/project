package FlightReservationSystem;

public class Flight {
    public String flightNumber;
    public String airLine;
    public int capacity;
    private int bookedSeats;
    public String getFlightDetails() {
        if(getBookedSeats()>=capacity) {
            return null;
        }
        else {
            this.flightNumber= flightNumber;
            this.airLine= airLine;
            return flightNumber+ " " + airLine;
        }
    }
    public boolean checkAvailability() {
        if(getBookedSeats()>=capacity) {
            System.out.println("Seats are full");
            return false;}
        else {
            return true;}
    }
    public void incrementBookingCounter() {
        if(bookedSeats<50) {
            setBookedSeats(getBookedSeats() + 1);
        }
    }
    public int getBookedSeats() {

        return bookedSeats;
    }
    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
