package FlightReservationSystem;

public class TouristTicket {
    public String hotelAddress;

    public String[] selectedTouristLocation;
    public String getHotelAddress() {

        return hotelAddress;
    }
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return this.selectedTouristLocation;
    }
    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
}
