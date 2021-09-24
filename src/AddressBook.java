import java.util.ArrayList;

public class AddressBook {
    //contains a collection of BuddyInfo objects
    ArrayList<BuddyInfo> buddyObject = new ArrayList<BuddyInfo>();

    //Provide an addBuddy() and a removeBuddy() method.
    public void addBuddy(BuddyInfo newBuddy){
        if(newBuddy != null){
            this.buddyObject.add(newBuddy);
        }
    }

    public void removeBuddy(BuddyInfo oldBuddy){
        this.buddyObject.remove(oldBuddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
