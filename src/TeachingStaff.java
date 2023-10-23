import java.util.List;

public class TeachingStaff extends Staff{
    List<Library> T_libraries;
    public TeachingStaff(int staffId, String staffName, int departmentId, double salary) {
        super(staffId, staffName, departmentId, salary);
    }
}
