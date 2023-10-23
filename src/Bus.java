public class Bus {
    private int busId;
    private String busNumber;
    private String driverName;
    private String destination;
    private int totalSeats;
    private int availableSeats;

    public Bus(int busId, String busNumber, String driverName, String destination, int totalSeats) {
        this.busId = busId;
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String BusDetails() {
        return "Bus ID: " + busId + "\n" +
                "Bus Number: " + busNumber + "\n" +
                "Driver Name: " + driverName + "\n" +
                "Destination: " + destination + "\n" +
                "Total Seats: " + totalSeats + "\n" +
                "Available Seats: " + availableSeats;
    }

    public void SeatsAvailability() {
        System.out.println("The number of available seats in bus " + busNumber + " is " + availableSeats);
    }
}

