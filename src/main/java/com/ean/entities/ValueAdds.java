package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class ValueAdds {
    /**
     * Attributes
     */
    private Integer size;

    private ValueAdd[] valueAdd;

    public ValueAdds() {
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    public ValueAdd[] getValueAdd() {
        return valueAdd;
    }

    @XmlElement(name = "ValueAdd")
    public void setValueAdd(ValueAdd[] valueAdd) {
        this.valueAdd = valueAdd;
    }

    @Override
    public String toString() {
        return "Value Adds: " + Arrays.toString(valueAdd);
    }
}
