package FlightReservationSystem;

public class Source {

    public static void main(String[] args) {

        Flight flight= new Flight();
        flight.setBookedSeats(30);
        flight.setFlightNumber("123456789");
        flight.setAirLine("Air India");
        flight.setCapacity(50);
        System.out.println(flight.getFlightDetails());
        System.out.println(flight.checkAvailability());

        String addressDetail="NK Colony hyd TG";
        String contactDetails="nikhil 9100056662 nikhil@gmail.com";
        Passenger passenger= new Passenger(1,"nikhil","9100056662","nikhil@gmail.com",contactDetails,"NK colony","hyd","TG",addressDetail);
        System.out.println(passenger.getContact());
        System.out.println(passenger.getAddress());
        String[] location= new String[5];
        location[0]= "hyd";
        RegularTicket regularTicket= new RegularTicket("Regular Ticket Pnr: 123","hyd", "mumbai", flight, "4:00", "5:00", passenger, "150", 1500, false, "drinks");
        TouristTicket touristTicket= new TouristTicket("Tourist Ticket Pnr: 123", "hyd","mum", flight,"4:00", "5:00", passenger, "15", 150 , false,"adfg", location);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
        System.out.println(regularTicket.getDepartureDateTime());
    }
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}