package FlightReservationSystem;

public class Flight {
    private String flightNumber;
    private String airLine;
    private int capacity;
    private int bookedSeats;
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getAirLine() {
        return airLine;
    }
    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
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
            System.out.println("Seats are booked");
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
