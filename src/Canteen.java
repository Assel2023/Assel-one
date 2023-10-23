import java.util.List;

public class Canteen {
    private int inchargeId;
    private List<String> itemsList;
    private List<String> availableList;

    public Canteen(int inchargeId, List<String> itemsList, List<String> availableList) {
        this.inchargeId = inchargeId;
        this.itemsList = itemsList;
        this.availableList = availableList;
    }

    public int getInchargeId() {
        return inchargeId;
    }

    public void setInchargeId(int inchargeId) {
        this.inchargeId = inchargeId;
    }

    public List<String> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<String> itemsList) {
        this.itemsList = itemsList;
    }

    public List<String> getAvailableList() {
        return availableList;
    }

    public void setAvailableList(List<String> availableList) {
        this.availableList = availableList;
    }

    public void showItems() {
        System.out.println("Items available in the cafeteria:");
        for (String item : availableList) {
            System.out.println(item);
        }
    }

    public void buy(String itemName) {
        if (availableList.contains(itemName)) {
            System.out.println("Item purchased successfully!");
            availableList.remove(itemName);
        } else {
            System.out.println("Item not available.");
        }
    }
}

