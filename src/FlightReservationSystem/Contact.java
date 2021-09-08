package FlightReservationSystem;

public class Contact {
    public String name;
    public String phone;
    public String email;
    public String contactDetails;

    public String getContactDetails() {
        if(contactDetails==null) {
            String contactDetails=name+" "+ phone + " "+ email;
            return contactDetails;
        }
        else {
            System.out.println(this.contactDetails);
            return this.contactDetails;}
    }
    public void updateContactDetails(String contactDetails) {
        this.contactDetails=contactDetails;
    }

}