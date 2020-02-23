package person;

import java.util.LinkedList;

public class Person {
    private String firstName;
    private String lastName;
    private LinkedList<String> contactNumber;
    private String emailID;

    public Person(String fn, String ln, LinkedList<String> cn, String e) {
        firstName = fn;
        lastName = ln;
        contactNumber = cn;
        emailID = e;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedList<String> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(LinkedList<String> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
}
