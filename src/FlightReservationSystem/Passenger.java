package FlightReservationSystem;

public class Passenger {
    public int id;
    public Address address;
    private Contact contact;

    public void setContact(Contact contact) {
                this.contact = contact;
    }
    public Contact getContact() {
        return contact;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
