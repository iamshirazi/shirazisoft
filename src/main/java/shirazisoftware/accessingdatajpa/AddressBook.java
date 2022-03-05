package shirazisoftware.accessingdatajpa;

import java.util.HashSet;
import java.util.Set;

public class AddressBook {

    public Set<BuddyInfo> buddies;

    public AddressBook() {
        super();
        buddies = new HashSet();
    }

    public Set<BuddyInfo> getBuddies() {
        return buddies;
    }

    public void addBuddies(BuddyInfo buddy) {
        buddies.add(buddy);
        //printBuddies();
    }

    public void removeBuddies(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public void printBuddies() {
        System.out.println("AddressBook Buddies List: ");
        System.out.println(getBuddies());
    }
}
