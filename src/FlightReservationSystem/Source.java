package FlightReservationSystem;

public class Source {

    public static void main(String[] args) {

        Flight flight= new Flight();
        flight.setBookedSeats(40);
        flight.setFlightNumber("Flight Number:1234");
        flight.setAirLine("AirLine: Air India");
        flight.setCapacity(50);
        System.out.println(flight.getFlightDetails());
        System.out.println(flight.checkAvailability());

        String addressDetail="NK Colony hyd TG";
        String contactDetails="nikhil 9100056662 nikhillajineni1@gmail.com";
        Passenger passenger= new Passenger(1,"nikhil","9100056662","nikhillajineni1@gmail.com",contactDetails,"NK colony","hyd","TG",addressDetail);
        System.out.println(passenger.getContact());
        System.out.println(passenger.getAddress());
        String[] location= new String[5];
        location[0]= "hyd";
        RegularTicket regularTicket= new RegularTicket("123","hyd", "mumbai", flight, "Departure Time: 4:00 and Departure Date :08/09/2021", "Arrival Time 5:00 and Arrival Date :08/09/2021", passenger, "150", 1500, false, "Special Services: drinks");
        TouristTicket touristTicket= new TouristTicket("123", "hyd","mumbai", flight,"Depatrture Time: 4:00 and Departure Date :08/09/2021", "Arrival Time:5:00 and Arrival Date :08/09/2021", passenger, "15", 150 , false,"Hotel Address: plot 4,Bk colony,Hyderabad", location);
        System.out.println(regularTicket.getDepartureDateTime());
        System.out.println(regularTicket.getSpecialServices());
        System.out.println(touristTicket.getHotelAddress());

    }


}