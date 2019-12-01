package org.zsy.alertsystem.pojo;

import java.util.Date;

public class ExMessage {
    private Integer id;

    private Long systemId;

    private String token;

    private String exDescription;

    private Date exOccurtime;

    private Date exCreatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getSystemId() {
        return systemId;
    }

    public void setSystemId(Long systemId) {
        this.systemId = systemId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getExDescription() {
        return exDescription;
    }

    public void setExDescription(String exDescription) {
        this.exDescription = exDescription == null ? null : exDescription.trim();
    }

    public Date getExOccurtime() {
        return exOccurtime;
    }

    public void setExOccurtime(Date exOccurtime) {
        this.exOccurtime = exOccurtime;
    }

    public Date getExCreatetime() {
        return exCreatetime;
    }

    public void setExCreatetime(Date exCreatetime) {
        this.exCreatetime = exCreatetime;
    }
}