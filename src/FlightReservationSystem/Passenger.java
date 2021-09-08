package FlightReservationSystem;

public class Passenger {
    private int id;
    private static int idCounter;
    private Address address;
    public Passenger(int id,String name, String phone, String email, String contactDetails,String street, String city, String state, String addressDetail) {
        this(id);
        Contact contact= new Contact(name,phone,email,contactDetails);
        Address address =new Address(street,city,state,addressDetail);
        this.contact=contact;
        this.address=address;
    }
    public Passenger(int id) {
        this.idCounter = id;
        idCounter=idCounter +1;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPassengerCount(){
        return idCounter;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Passenger(Address address, Contact contact) {
        this.address = address;
        this.contact = contact;
    }
    private Contact contact;

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    public Contact getContact() {
        return contact;
    }

    private static class Contact {
        private String name;
        private String phone;
        private String email;

        public String toString() {
            return "Contact [name=" + name + ", phone=" + phone + ", email=" + email + ", contactDetails=" + contactDetails
                    + "]";
        }
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
        public Contact(String name, String phone, String email, String contactDetails) {
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.contactDetails = contactDetails;
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
        private String contactDetails;

        public String getContactDetails() {
            if(contactDetails==null) {
                String contactDetails=this.name+" "+ this.phone + " "+ this.email;
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
    private static class Address {
        private String street;
        private String city;
        private String state;


        public Address(String street, String city, String state, String addressDetail) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.addressDetail = addressDetail;

        }


        public String toString() {
            return "Address [street=" + street + ", city=" + city + ", state=" + state + ", addressDetail="
                    + addressDetail + "]";
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
        private String addressDetail;
        public String getAddressDetail() {
            return addressDetail;
        }

        public void setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
        }

        public String getAddressDetails() {
            if(addressDetail==null) {
                String addressDetail=street+" "+city+" "+state;
                return addressDetail;
            }
            else {
                System.out.println(this.addressDetail);
                return this.addressDetail;}
        }

        public void updateAddressDetails(String addressDetail) {
            this.addressDetail= addressDetail;
        }

    }
}