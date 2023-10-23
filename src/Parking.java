public class Parking {
    private int slotId;
    private String vehicleNumber;
    private String vehicleOwnerName;

    public Parking(int slotId, String vehicleNumber, String vehicleOwnerName) {
        this.slotId = slotId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public void parkVehicle() {
        // TODO: Implement this method to store the details of the parked vehicle.
    }
}
