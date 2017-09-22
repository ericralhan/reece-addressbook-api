package au.com.reece.addressbook.contact.manage.contact.print;

import au.com.reece.addressbook.contact.AddressBook;

public interface PrintContactService {

    public void printAddressbookContacts(AddressBook addressBook);

    public void printUniqueContacts(String userName);
}
