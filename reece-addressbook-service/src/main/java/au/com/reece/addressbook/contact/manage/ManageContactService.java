package au.com.reece.addressbook.contact.manage;

import au.com.reece.addressbook.contact.Contact;

public interface ManageContactService {

    public void addContact(String username, String addressBookLabel, Contact contact);

    public void removeContact(String username, String addressBookLabel, String contactName);
}
