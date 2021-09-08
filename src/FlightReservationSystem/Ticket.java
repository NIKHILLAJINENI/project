package FlightReservationSystem;

public class Ticket {
    public String pnr;
    public String from;
    public String to;
    public Flight flight;
    public String departureDateTime;
    public String arrivalDatetime;
    public Passenger passenger;
    public String seatno;
    public float price;
    public boolean cancelled;
    public int getFlightDuration() {
        String arrivalDateTime = null;
        String[] splitArr = arrivalDateTime.split(":");
        String s1 = splitArr[0];
        String s2 = splitArr[1];
        String s3 = s1.concat(s2);
        int Arr = Integer.parseInt(s3);
        String[] splitArr1 = departureDateTime.split(":");
        String s4 = splitArr1[0];
        String s5 = splitArr1[1];
        String s6 = s4.concat(s5);
        int Dep = Integer.parseInt(s6);
        System.out.println(Arr);
        System.out.println(Dep);
        return Dep;
    }

}
