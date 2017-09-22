package au.com.reece.addressbook.contact;

import java.util.List;

public class AddressBook {

    private String label;

    private List<Contact> contacts;

    public String getLabel() {

        return label;
    }

    public void setLabel(String label) {

        this.label = label;
    }

    public List<Contact> getContacts() {

        return contacts;
    }

    public void setContacts(List<Contact> contacts) {

        this.contacts = contacts;
    }
}
