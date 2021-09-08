package FlightReservationSystem;

    public class Source {

        public static void main(String[] args) {

            Flight flight= new Flight();
            flight.setBookedSeats(30);
            flight.setFlightNumber("123456789");
            flight.setAirLine("Air India");
            flight.setCapacity(50);
            flight.incrementBookingCounter();
            System.out.println(flight.getFlightDetails());
            System.out.println(flight.checkAvailability());

        }


    }