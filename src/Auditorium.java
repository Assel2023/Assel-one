import jdk.jfr.Event;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Auditorium {
    private String auditoriumName;
    private List<String> eventsList;
    private Date date;
    private Time time;
    private int totalSeats;
    private int departmentId;
     boolean isAvailable;

    public Auditorium(String auditoriumName, List<String> eventsList, Date date, Time time, int totalSeats, int departmentId) {
        this.auditoriumName = auditoriumName;
        this.eventsList = eventsList;
        this.date = date;
        this.time = time;
        this.totalSeats = totalSeats;
        this.departmentId = departmentId;
        this.isAvailable = true;
    }

    public String getAuditoriumName() {
        return auditoriumName;
    }

    public void setAuditoriumName(String auditoriumName) {
        this.auditoriumName = auditoriumName;
    }

    public List<String> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<String> eventsList) {
        this.eventsList = eventsList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void bookEvent(String event, Date startDate, Date endDate) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The auditorium has been booked for the event '" + event + "' from " + startDate + " to " + endDate);
        } else {
            System.out.println("The auditorium is not available for the requested dates.");
        }    }
}