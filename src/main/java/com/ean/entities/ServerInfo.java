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