public class Hostel {
        private int studentId;
        private int blockNumber;
        private int roomNumber;

        public Hostel(int studentId, int blockNumber, int roomNumber) {
            this.studentId = studentId;
            this.blockNumber = blockNumber;
            this.roomNumber = roomNumber;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public int getBlockNumber() {
            return blockNumber;
        }

        public void setBlockNumber(int blockNumber) {
            this.blockNumber = blockNumber;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
        }

        public void hostelDetails() {
            System.out.println("Hostel Details:");
            System.out.println("Student Id: " + studentId);
            System.out.println("Block Number: " + blockNumber);
            System.out.println("Room Number: " + roomNumber);
        }

        public void checkIn() {
            System.out.println("Student is present at the hostel.");
        }

        public void checkOut() {
            System.out.println("Student is checked out from the hostel.");
        }
    }
