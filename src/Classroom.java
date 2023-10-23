public class Classroom {
    private int classId;
    private String section;
    private int departmentId;
     boolean isOccupied;


    public Classroom(int classId, String section, int departmentId) {
        this.classId = classId;
        this.section = section;
        this.departmentId = departmentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void classroomDetails() {
        System.out.println("Classroom ID: " + classId);
        System.out.println("Section: " + section);
        System.out.println("Department ID: " + departmentId);
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }
}