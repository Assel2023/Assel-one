import java.util.List;

public class TeachingStaff extends Staff{
    List<Library>library ;
    public TeachingStaff(int staffId, String staffName, int departmentId, double salary) {
        super(staffId, staffName, departmentId, salary);
    }
}
