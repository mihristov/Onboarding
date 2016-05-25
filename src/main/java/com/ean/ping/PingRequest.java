package com.ean.ping;

import com.ean.common.CommonRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Milen on 5/16/2016.
 */
@XmlRootElement(name = "PingRequest")
public class PingRequest extends CommonRequest {
    private String echo;

    public PingRequest() {
    }

    public String getEcho() {
        return echo;
    }

    @XmlElement
    public void setEcho(String echo) {
        this.echo = echo;
    }

    @Override
    public String toString() {
        return "PingRequest{" +
                "echo='" + echo + '\'' +
                '}';
    }
}
