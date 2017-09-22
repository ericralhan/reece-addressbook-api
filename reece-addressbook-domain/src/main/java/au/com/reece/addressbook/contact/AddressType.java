package au.com.reece.addressbook.contact;

public enum AddressType {

    INTERNATIONAL("International"),
    NATIONAL("National");

    private String displayName;

    private AddressType(String value) {

        this.displayName = value;
    }

    public String getDisplayName() {

        return this.displayName;
    }

}
