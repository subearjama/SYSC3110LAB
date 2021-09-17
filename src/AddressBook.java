import java.util.ArrayList;

public class AddressBook {
    //contains a collection of BuddyInfo objects
    ArrayList<BuddyInfo> buddyObject = new ArrayList<BuddyInfo>();

    //Provide an addBuddy() and a removeBuddy() method.
    public void addBuddy(BuddyInfo newBuddy){
        this.buddyObject.add(newBuddy);
    }

    public void removeBuddy(BuddyInfo oldBuddy){
        this.buddyObject.remove(oldBuddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
