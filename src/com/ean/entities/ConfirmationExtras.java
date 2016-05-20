package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class ConfirmationExtras {
    /**
     * Attributes
     */
    private Integer size;

    private ConfirmationExtra[] confirmationExtra;


    public ConfirmationExtras() {
    }

    public ConfirmationExtra[] getConfirmationExtra() {
        return confirmationExtra;
    }

    @XmlElement(name = "ConfirmationExtra")
    public void setConfirmationExtra(ConfirmationExtra[] confirmationExtra) {
        this.confirmationExtra = confirmationExtra;
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ConfirmationExtras{" +
                "confirmationExtra=" + Arrays.toString(confirmationExtra) +
                ", size=" + size +
                '}';
    }
}
