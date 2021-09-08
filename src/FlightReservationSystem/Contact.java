package FlightReservationSystem;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private String contactDetails;
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getPhone() {

        return phone;
    }
    public void setPhone(String phone) {

        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {

        this.email = email;
    }
    public void setContactDetails(String contactDetails) {

        this.contactDetails = contactDetails;
    }

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
