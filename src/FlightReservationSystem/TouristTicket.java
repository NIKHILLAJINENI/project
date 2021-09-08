package FlightReservationSystem;

public class TouristTicket {
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }
    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    private String touristLocation;

    private String getHotelAddress() {
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