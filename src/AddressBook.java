import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> infoList;

    public AddressBook() {
        infoList = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo info) {
        infoList.add(info);
    }
    public void removeBuddy(BuddyInfo info) {
        infoList.remove(info);
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
