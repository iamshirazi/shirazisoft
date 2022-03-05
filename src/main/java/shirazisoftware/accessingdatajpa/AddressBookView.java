package shirazisoftware.accessingdatajpa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddressBookView extends JFrame {

    JTextField buddyName = new JTextField(15);
    JLabel name = new JLabel("Buddy Name:");
    JTextField buddyPhone = new JTextField(10);
    JLabel phone = new JLabel("Buddy Phone Number:");
    JButton addBuddy = new JButton("Add Buddy");

    public AddressBookView() {

        //Layout of frame
        JPanel panel = new JPanel();
        this.setSize(600, 400);
        panel.setLayout(new GridLayout(5, 5));

        //Buttons and TextFields
        panel.add(name);
        panel.add(buddyName);
        panel.add(phone);
        panel.add(buddyPhone);
        panel.add(addBuddy);

        //Add to frame
        this.add(panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Address Book");
        this.pack();
        this.setVisible(true);
    }

    public String getBuddyName() {
        return buddyName.getText();
    }

    public String getBuddyPhone() {
        return buddyPhone.getText();
    }

    public void setBuddyName() {
        buddyName.setText("");
    }

    public void setBuddyPhone() {
        buddyPhone.setText("");
    }

    public void setSuccess() {
        JOptionPane.showMessageDialog(this, "SUCCESS!");
    }

    void addBuddyListener(ActionListener addButtonClicked) {
        addBuddy.addActionListener(addButtonClicked);
    }

    void displayError(String mes) {
        JOptionPane.showMessageDialog(this, mes);
    }

}
