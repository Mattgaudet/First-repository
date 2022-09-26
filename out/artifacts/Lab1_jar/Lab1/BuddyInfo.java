public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo() {
        this("Default name", "Default address", 1234567890);
    }
    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo friend = new BuddyInfo("Homer", "123 Street", 1234567899);
        System.out.println("Name: " + friend.getName());
    }
}
