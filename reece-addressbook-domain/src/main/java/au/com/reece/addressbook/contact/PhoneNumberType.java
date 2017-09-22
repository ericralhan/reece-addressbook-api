package au.com.reece.addressbook.contact;

public enum PhoneNumberType {

    LANDLINE("Landline"),
    MOBILE("Mobile"),
    SPECIAL("Special"); // for toll-free and 3-digit and 1300* numbers

    private String displayName;

    private PhoneNumberType(String value) {

        this.displayName = value;
    }

    public String getDisplayName() {

        return this.displayName;
    }

}
