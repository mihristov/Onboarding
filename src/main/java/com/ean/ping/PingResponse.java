package com.ean.ping;

import com.ean.common.CommonResponse;
import com.ean.entities.ServerInfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Milen on 5/16/2016.
 */
@XmlRootElement(name = "PingResponse")
public class PingResponse extends CommonResponse {
    private String echo;
    private ServerInfo serverInfo;

    public PingResponse() {
    }

    public String getEcho() {
        return echo;
    }

    @XmlElement
    public void setEcho(String echo) {
        this.echo = echo;
    }

    public ServerInfo getServerInfo() {
        return serverInfo;
    }

    @XmlElement(name = "ServerInfo")
    public void setServerInfo(ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    @Override
    public String toString() {
        return "PingResponse{" +
                "echo='" + echo + '\'' +
                ", serverInfo=" + serverInfo +
                '}';
    }
}
