package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(propOrder = {
        "email",
        "firstName",
        "lastName",
        "homePhone",
        "workPhone",
        "extension",
        "faxPhone",
        "customerAddresses"
})
public class Customer {
    private String email;
    private String firstName;
    private String lastName;
    private String homePhone;
    private String workPhone;
    private String extension;
    private String faxPhone;
    private CustomerAddresses customerAddresses;

    public Customer() {
    }

    public CustomerAddresses getCustomerAddresses() {
        return customerAddresses;
    }

    @XmlElement(name = "CustomerAddresses")
    public void setCustomerAddresses(CustomerAddresses customerAddresses) {
        this.customerAddresses = customerAddresses;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public String getExtension() {
        return extension;
    }

    @XmlElement
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFaxPhone() {
        return faxPhone;
    }

    @XmlElement
    public void setFaxPhone(String faxPhone) {
        this.faxPhone = faxPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    @XmlElement
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    @XmlElement
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    @Override
    public String toString() {
        return "Email: " + email + "\nFirstName: " + firstName + "\nLastName: " + lastName + "\nHomePhone='" + homePhone + "\nAddress: "
                + customerAddresses.getAddress1() + "\n";
    }
}
