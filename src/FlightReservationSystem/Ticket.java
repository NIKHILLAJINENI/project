package FlightReservationSystem;

public class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private String seatno;
    private float price;
    private boolean cancelled;

    public Ticket(Flight flight) {
        this.flight = flight;
    }
    public String getPnr() {
        return pnr;
    }
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public String getDepartureDateTime() {
        return departureDateTime;
    }
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }
    public String getArrivalDatetime() {
        return arrivalDateTime;
    }
    public void setArrivalDatetime(String arrivalDatetime) {
        this.arrivalDateTime = arrivalDatetime;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public String getSeatno() {
        return seatno;
    }
    public void setSeatno(String seatno) {
        this.seatno = seatno;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public boolean isCancelled() {
        return cancelled;
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    public Ticket(Passenger passenger) {
        this.passenger = passenger;
    }

    public String checkStatus() {
        return null;
    }
    public int getFlightDuration() {
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
    public void cancel() {
        this.cancelled= true;
    }

}
