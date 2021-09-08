package FlightReservationSystem;

    public class Source {

        public static void main(String[] args) {
            Address address = new Address();
            address.city = "hyd";
            address.state = "TG";
            address.street = "NK colony";
            String addressDetail = address.street + " " + address.city + " " + address.state;
            System.out.println("Before address update");
            System.out.println(address.getAddressDetails());
            address.street = "N colony";
            //address.updateAddressDetails(addressDetail);
            System.out.println("After address update");
            System.out.println(address.getAddressDetails());

            Contact contact = new Contact();
            contact.name = "Nikhil";
            contact.phone = "9100056662";
            contact.email = "nikhil@gmail.com";
            String contactDetails = contact.name + "" + contact.phone + " " + contact.email;
            System.out.println("Before Contact Details");
            System.out.println(contact.getContactDetails());
            contact.name = "Nikhil";
            contact.phone = "9849123455";
            contact.email = "nikhil12345@gmail.com";
//address updateContactsDetails(addressDetail);
            System.out.println("After contact Details update");
            System.out.println(contact.getContactDetails());

            Flight flight = new Flight();
            flight.flightNumber = "123456789";
            flight.airLine = "Air India";
            flight.capacity = 50;
            flight.setBookedSeats(51);
            System.out.println(flight.getFlightDetails());
            System.out.println(flight.checkAvailability());

        }

    }
