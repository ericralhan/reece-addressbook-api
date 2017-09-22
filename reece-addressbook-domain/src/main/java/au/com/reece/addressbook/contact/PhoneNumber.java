package au.com.reece.addressbook.contact;

public class PhoneNumber {

    private String countryCode;

    private String areaCode;

    private String number;

    private PhoneNumberType type;

    private String label;

    public String getCountryCode() {

        return countryCode;
    }

    public void setCountryCode(String countryCode) {

        this.countryCode = countryCode;
    }

    public String getAreaCode() {

        return areaCode;
    }

    public void setAreaCode(String areaCode) {

        this.areaCode = areaCode;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {

        this.number = number;
    }

    public PhoneNumberType getType() {

        return type;
    }

    public void setType(PhoneNumberType type) {

        this.type = type;
    }

    public String getLabel() {

        return label;
    }

    public void setLabel(String label) {

        this.label = label;
    }

}
