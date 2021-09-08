package FlightReservationSystem;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    public TouristTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatno, float price, boolean cancelled,String hotelAddress,String[] selectedTouristLocation) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatno, price, cancelled);
        this.selectedTouristLocation = selectedTouristLocation;
        this.hotelAddress = hotelAddress;
    }
    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }
    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    private String[] selectedTouristLocation;
    private String touristLocation;

    String getHotelAddress() {
        return this.hotelAddress;
    }
    public String[] getTouristLocation() {
        return this.selectedTouristLocation;
    }
    public void removeTouristLocations(String location) {
        this.touristLocation=location;
    }
    public void addTouristLocation(String location) {
        this.touristLocation= location;
    }
}