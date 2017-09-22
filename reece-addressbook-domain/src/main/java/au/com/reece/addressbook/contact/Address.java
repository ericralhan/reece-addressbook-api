package au.com.reece.addressbook.contact;

public class Address {

    private String country;

    private String line1;

    private String line2;

    private String suburb;

    private String state;

    private Integer postcode;

    private String internationalAddress;

    private AddressType type;

    private String label;

    public String getCountry() {

        return country;
    }

    public void setCountry(String value) {

        this.country = value;
    }

    public String getLine1() {

        return line1;
    }

    public void setLine1(String value) {

        this.line1 = value;
    }

    public String getLine2() {

        return line2;
    }

    public void setLine2(String value) {

        this.line2 = value;
    }

    public String getSuburb() {

        return suburb;
    }

    public void setSuburb(String value) {

        this.suburb = value;
    }

    public String getState() {

        return state;
    }

    public void setState(String value) {

        this.state = value;
    }

    public Integer getPostcode() {

        return postcode;
    }

    public void setPostcode(Integer value) {

        this.postcode = value;
    }

    public String getInternationalAddress() {

        return internationalAddress;
    }

    public void setInternationalAddress(String value) {

        this.internationalAddress = value;
    }

    public AddressType getType() {

        return type;
    }

    public void setType(AddressType type) {

        this.type = type;
    }

    public String getLabel() {

        return label;
    }

    public void setLabel(String label) {

        this.label = label;
    }
}
