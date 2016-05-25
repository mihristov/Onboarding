package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class ReservationInfo {
    private String email;
    private String firstName;
    private String lastName;
    private String homePhone;
    private String workPhone;
    private String extension;
    private String faxPhone;
    private String companyName;
    private String creditCardType;
    private String creditCardNumber;
    private String creditCardIdentifier;
    private String creditCardExpirationMonth;
    private String creditCardExpirationYear;

    public ReservationInfo() {
    }

    public String getCompanyName() {
        return companyName;
    }

    @XmlElement
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    @XmlElement
    public void setCreditCardExpirationMonth(String creditCardExpirationMonth) {
        this.creditCardExpirationMonth = creditCardExpirationMonth;
    }

    public String getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    @XmlElement
    public void setCreditCardExpirationYear(String creditCardExpirationYear) {
        this.creditCardExpirationYear = creditCardExpirationYear;
    }

    public String getCreditCardIdentifier() {
        return creditCardIdentifier;
    }

    @XmlElement
    public void setCreditCardIdentifier(String creditCardIdentifier) {
        this.creditCardIdentifier = creditCardIdentifier;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @XmlElement
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    @XmlElement
    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
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
        return "ReservationInfo{" +
                "companyName='" + companyName + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", workPhone='" + workPhone + '\'' +
                ", extension='" + extension + '\'' +
                ", faxPhone='" + faxPhone + '\'' +
                ", creditCardType='" + creditCardType + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", creditCardIdentifier='" + creditCardIdentifier + '\'' +
                ", creditCardExpirationMonth='" + creditCardExpirationMonth + '\'' +
                ", creditCardExpirationYear='" + creditCardExpirationYear + '\'' +
                '}';
    }
}
