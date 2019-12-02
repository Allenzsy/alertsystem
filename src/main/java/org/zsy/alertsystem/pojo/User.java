package org.zsy.alertsystem.pojo;

import java.util.Objects;

public class User {
    private Integer id;

    private String userName;

    private String mail;

    private String qq;

    private String phone;

    private Boolean admin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Boolean getIsAdmin() {
        return admin;
    }

    public void setIsAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", mail='" + mail + '\'' +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", admin=" + admin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                userName.equals(user.userName) &&
                mail.equals(user.mail) &&
                qq.equals(user.qq) &&
                phone.equals(user.phone) &&
                admin.equals(user.admin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, mail, qq, phone, admin);
    }
}