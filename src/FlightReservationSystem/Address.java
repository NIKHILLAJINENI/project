package FlightReservationSystem;

public class Address {
        public String street;
        public String city;
        public String state;
        public String addressDetail;
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
