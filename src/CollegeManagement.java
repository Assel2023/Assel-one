import java.util.ArrayList;
import java.util.List;

public class CollegeManagement {
    private String collegeName ;
    private String city;
    private String contactNumber;
    private boolean isOpen;
    List<Department> departments;
     List<Classroom> classrooms;
    private  Hostel hostel;
    private List<Parking> parkings;
    private List<Hostel> hostels;
    private Auditorium auditorium;

    public CollegeManagement() {
        this.hostels = new ArrayList<>();
    }

    public void addHostel(Hostel hostel) {
        this.hostels.add(hostel);
    }

    public List<Hostel> getHostels() {
        return hostels;
    }

    public void setHostels(List<Hostel> hostels) {
        this.hostels = hostels;
    }

    public void manageHostels() {
        // TODO: Implement this method to manage the hostels of the college.
    }


    public void addParking(Parking parking) {
        this.parkings.add(parking);
    }

    public List<Parking> getParkings() {
        return parkings;
    }

    public void setParkings(List<Parking> parkings) {
        this.parkings = parkings;
    }

    public void manageParking() {
        // TODO: Implement this method to manage the parking area of the college.
    }
    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public void manageAuditorium() {
        // TODO: Implement this method to manage the auditorium of the college.
    }
    public CollegeManagement(String collegeName , String city, String contactNumber, Hostel hostel) {
        this.collegeName  = collegeName ;
        this.city = city;
        this.contactNumber = contactNumber;
        this.isOpen = true;
        this.departments = new ArrayList<>();
        this.classrooms = new ArrayList<>();
        this.hostel = hostel;
        this.auditorium = null;
    }

    public String getName() {
        return collegeName ;
    }

    public void setName(String name) {
        this.collegeName  = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void collegeDetails() {
        System.out.println("College Details:");
        System.out.println("College Name: " + collegeName);
        System.out.println("City: " + city);
        System.out.println("Contact Number: " + contactNumber);
        hostel.hostelDetails();
    }

    public void Open() {
        isOpen = true;
    }

    public void Close() {
        isOpen = false;
    }
}

