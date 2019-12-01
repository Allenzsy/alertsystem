package org.zsy.alertsystem.pojo;

import java.util.Date;

public class ExMessage {
    private Integer id;

    private Long systemId;

    private String token;

    private Integer rankId;

    private Integer userId;

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

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        return "ExMessage{" +
                "id=" + id +
                ", systemId=" + systemId +
                ", token='" + token + '\'' +
                ", rankId=" + rankId +
                ", userId=" + userId +
                ", exDescription='" + exDescription + '\'' +
                ", exOccurtime=" + exOccurtime +
                ", exCreatetime=" + exCreatetime +
                '}';
    }
}