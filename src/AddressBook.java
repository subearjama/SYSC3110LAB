import java.util.ArrayList;

//AddressBook Class
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

    //my method checks if the buddylist is empty or not
    public void checkBuddy(){
        if (buddyObject != null){
            System.out.println("there are BuddyIfo objects in the list");
        }
        else{
            System.out.println("No BuddyIfo objects are in the list");
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
