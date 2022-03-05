package shirazisoftware.accessingdatajpa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressBookController {

    private AddressBook model;
    private AddressBookView view;

    public AddressBookController() {

        this.model = new AddressBook();
        this.view = new AddressBookView();

        this.view.addBuddyListener(new BuddyListener());
    }

    /*
    public AddressBookController(AddressBook model, AddressBookView view) {

        this.model = model;
        this.view = view;

        this.view.addBuddyListener(new BuddyListener());

    }
    */

    class BuddyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String buddyName, buddyPhone = "";

            try {
                buddyName = view.getBuddyName();
                buddyPhone = view.getBuddyPhone();

                BuddyInfo buddy = new BuddyInfo();
                buddy.setName(buddyName);
                buddy.setPhone(buddyPhone);
                model.addBuddies(buddy);

                view.setBuddyName(); //reset textfield to blank
                view.setBuddyPhone(); //reset textfield to blank
                view.setSuccess(); //display SUCCESS!
            }
            catch(NullPointerException nex) {
                view.displayError("Enter a name AND phone number please!");
            }
        }
    }

}
