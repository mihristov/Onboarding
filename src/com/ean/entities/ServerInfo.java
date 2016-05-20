package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
public class ServerInfo {
    private String instance;
    private Long timestamp;
    private String serverTime;

    public ServerInfo() {
    }

    public String getInstance() {
        return instance;
    }

    @XmlAttribute
    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getServerTime() {
        return serverTime;
    }

    @XmlAttribute
    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @XmlAttribute
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ServerInfo{" +
                "instance='" + instance + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", serverTime='" + serverTime + '\'' +
                '}';
    }
}
//
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlType;
//
///**
// * <p>Java class for ServerInfo complex type.
// * <p/>
// * <p>The following schema fragment specifies the expected content contained within this class.
// * <p/>
// * <pre>
// * &lt;complexType name="ServerInfo">
// *   &lt;complexContent>
// *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
// *       &lt;all>
// *       &lt;/all>
// *       &lt;attribute name="instance" type="{http://www.w3.org/2001/XMLSchema}string" />
// *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}long" />
// *       &lt;attribute name="serverTime" type="{http://www.w3.org/2001/XMLSchema}string" />
// *     &lt;/restriction>
// *   &lt;/complexContent>
// * &lt;/complexType>
// * </pre>
// */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "ServerInfo", propOrder = {
//
//})
//public class ServerInfo {
//
//    @XmlAttribute(name = "instance")
//    protected String instance;
//    @XmlAttribute(name = "timestamp")
//    protected Long timestamp;
//    @XmlAttribute(name = "serverTime")
//    protected String serverTime;
//
//    /**
//     * Gets the value of the instance property.
//     *
//     * @return possible object is
//     * {@link String }
//     */
//    public String getInstance() {
//        return instance;
//    }
//
//    /**
//     * Sets the value of the instance property.
//     *
//     * @param value allowed object is
//     * {@link String }
//     */
//    public void setInstance(String value) {
//        this.instance = value;
//    }
//
//    /**
//     * Gets the value of the timestamp property.
//     *
//     * @return possible object is
//     * {@link Long }
//     */
//    public Long getTimestamp() {
//        return timestamp;
//    }
//
//    /**
//     * Sets the value of the timestamp property.
//     *
//     * @param value allowed object is
//     * {@link Long }
//     */
//    public void setTimestamp(Long value) {
//        this.timestamp = value;
//    }
//
//    /**
//     * Gets the value of the serverTime property.
//     *
//     * @return possible object is
//     * {@link String }
//     */
//    public String getServerTime() {
//        return serverTime;
//    }
//
//    /**
//     * Sets the value of the serverTime property.
//     *
//     * @param value allowed object is
//     * {@link String }
//     */
//    public void setServerTime(String value) {
//        this.serverTime = value;
//    }
//
//    @Override
//    public String toString() {
//        return "{\"ServerInfo\":{" +
//                "\"instance\":\"" + instance + "\"" +
//                ", \"timestamp\":\"" + timestamp + "\"" +
//                ", \"serverTime\":\"" + serverTime + "\"" +
//                "}}";
//    }
//}
