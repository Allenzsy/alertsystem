package org.zsy.alertsystem.pojo;

import java.util.Date;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 9:58
 */
public class ExMessage {

    private Integer systemId;
    private String systemName;
    private Integer exId;
    private String exDescription;
    private Date exTime;

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Integer getExId() {
        return exId;
    }

    public void setExId(Integer exId) {
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
                "systemId=" + systemId +
                ", systemName='" + systemName + '\'' +
                ", exId=" + exId +
                ", exDescription='" + exDescription + '\'' +
                ", exTime=" + exTime +
                '}';
    }
}
