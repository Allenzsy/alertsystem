package org.zsy.alertsystem.pojo;

import java.util.Objects;

public class System {
    private Long id;

    private String systemName;

    private String systemDescription;

    private Integer userId;

    private String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName == null ? null : systemName.trim();
    }

    public String getSystemDescription() {
        return systemDescription;
    }

    public void setSystemDescription(String systemDescription) {
        this.systemDescription = systemDescription == null ? null : systemDescription.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    @Override
    public String toString() {
        return "System{" +
                "id=" + id +
                ", systemName='" + systemName + '\'' +
                ", systemDescription='" + systemDescription + '\'' +
                ", userId=" + userId +
                ", token='" + token + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof System)) {
            return false;
        }
        System system = (System) o;
        return id.equals(system.id) &&
                systemName.equals(system.systemName) &&
                systemDescription.equals(system.systemDescription) &&
                userId.equals(system.userId) &&
                token.equals(system.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, systemName, systemDescription, userId, token);
    }
}