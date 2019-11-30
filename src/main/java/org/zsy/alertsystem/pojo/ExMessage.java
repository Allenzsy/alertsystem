package org.zsy.alertsystem.pojo;

import java.util.Date;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 9:58
 */
public class ExMessage {

    private Long id;
    private Long systemId;
    private String systemName;
    private Long exId;
    private String exDescription;
    private Date exTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSystemId() {
        return systemId;
    }

    public void setSystemId(Long systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Long getExId() {
        return exId;
    }

    public void setExId(Long exId) {
        this.exId = exId;
    }

    public String getExDescription() {
        return exDescription;
    }

    public void setExDescription(String exDescription) {
        this.exDescription = exDescription;
    }

    public Date getExTime() {
        return exTime;
    }

    public void setExTime(Date exTime) {
        this.exTime = exTime;
    }

    @Override
    public String toString() {
        return "ExMessage{" +
                "id=" + id +
                ", systemId=" + systemId +
                ", systemName='" + systemName + '\'' +
                ", exId=" + exId +
                ", exDescription='" + exDescription + '\'' +
                ", exTime=" + exTime +
                '}';
    }
}
