package FlightReservationSystem;

public class Address {
    private String street;
    private String city;
    private String state;
    private String addressDetail;

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