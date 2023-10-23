public class Department {

        private int departmentId;
        private String departmentName;
        private String HODName;
        private int totalStaffs;
        private int totalStudents;

        public Department(int departmentId, String departmentName, String HODName, int totalStaffs, int totalStudents) {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
            this.HODName = HODName;
            this.totalStaffs = totalStaffs;
            this.totalStudents = totalStudents;
        }

        public int getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(int departmentId) {
            this.departmentId = departmentId;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public String getHODName() {
            return HODName;
        }

        public void setHODName(String HODName) {
            this.HODName = HODName;
        }

        public int getTotalStaffs() {
            return totalStaffs;
        }

        public void setTotalStaffs(int totalStaffs) {
            this.totalStaffs = totalStaffs;
        }

        public int getTotalStudents() {
            return totalStudents;
        }

        public void setTotalStudents(int totalStudents) {
            this.totalStudents = totalStudents;
        }

        public String DepartmentDetails() {
            return "Department Name: " + departmentName + "\n" +
                    "Head of the Department: " + HODName + "\n" +
                    "Total Staffs: " + totalStaffs + "\n" +
                    "Total Students: " + totalStudents;
        }

        public void ShowEvents() {
            // TODO: Implement this method to show any events in a particular department.
        }
    }


