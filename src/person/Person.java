package person;

import java.util.LinkedList;

public class Person {
    private String firstName;
    private String lastName;
    private LinkedList<String> contacts;
    private String email;

    public Person(String fn, String ln, LinkedList<String> cn, String e) {
        firstName = fn;
        lastName = ln;
        contacts = cn;
        email = e;
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

    public LinkedList<String> getContacts() {
        return contacts;
    }

    public void setContacts(LinkedList<String> contactNumber) {
        this.contacts = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailID) {
        this.email = emailID;
    }
}
