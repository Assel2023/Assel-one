public class Staff {
    private int staffId;
    private String staffName;
    private int departmentId;
    private double salary;

    public Staff(int staffId, String staffName, int departmentId, double salary) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String StaffDetails() {
        return "Staff ID: " + staffId + "\n" +
                "Staff Name: " + staffName + "\n" +
                "Department ID: " + departmentId + "\n" +
                "Salary: $" + salary;
    }

    public void PayFees() {
        // TODO: Implement this method to pay the fees of the staff.
    }

    public boolean IsPresent() {
        // TODO: Implement this method to check if the staff is present to the college on a particular date.
        return true;
    }
}