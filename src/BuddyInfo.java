public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber; //since 10 digit integers cant be stored in int, made it String so its easier

    //Default Constructor
    public BuddyInfo() {
        this.name = "Bob";
        this.address = "22 Fake Street";
        this.phoneNumber = "(613)-123-4567";
    }

    //Constructor for all parameters
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //Constructor for just the name, the rest is set to default
    public BuddyInfo(String name) {
        this.name = name;
        this.address = "22 Fake Street";
        this.phoneNumber = "(613)-123-4567";
    }

    //getter method for the name
    public String getName() {
        return name;
    }


    public static void main(String[] args) {

        BuddyInfo testObject = new BuddyInfo("Homer");
        System.out.println("Hello " + testObject.getName());
    }
}
