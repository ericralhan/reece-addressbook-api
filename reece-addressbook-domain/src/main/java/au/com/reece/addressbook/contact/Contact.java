package au.com.reece.addressbook.contact;

import java.util.Date;
import java.util.List;

public class Contact {

    private Name name;

    private List<PhoneNumber> number;

    private List<Address> address;

    private List<EmailAddress> email;

    private Date birthDate;

    private Date anniversary;

    private String organization;

    private String designation;

    private String notes;

    public Name getName() {

        return name;
    }

    public void setName(Name name) {

        this.name = name;
    }

    public List<PhoneNumber> getNumber() {

        return number;
    }

    public void setNumber(List<PhoneNumber> number) {

        this.number = number;
    }

    public List<Address> getAddress() {

        return address;
    }

    public void setAddress(List<Address> address) {

        this.address = address;
    }

    public List<EmailAddress> getEmail() {

        return email;
    }

    public void setEmail(List<EmailAddress> email) {

        this.email = email;
    }

    public Date getBirthDate() {

        return birthDate;
    }

    public void setBirthDate(Date birthDate) {

        this.birthDate = birthDate;
    }

    public Date getAnniversary() {

        return anniversary;
    }

    public void setAnniversary(Date anniversary) {

        this.anniversary = anniversary;
    }

    public String getOrganization() {

        return organization;
    }

    public void setOrganization(String organization) {

        this.organization = organization;
    }

    public String getDesignation() {

        return designation;
    }

    public void setDesignation(String designation) {

        this.designation = designation;
    }

    public String getNotes() {

        return notes;
    }

    public void setNotes(String notes) {

        this.notes = notes;
    }
}
