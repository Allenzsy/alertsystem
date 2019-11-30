package org.zsy.alertsystem.pojo;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 10:58
 */
public class Notice {

    private Integer system_id;
    private String admin_name;
    private String admin_mail;

    public Integer getSystem_id() {
        return system_id;
    }

    public void setSystem_id(Integer system_id) {
        this.system_id = system_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_mail() {
        return admin_mail;
    }

    public void setAdmin_mail(String admin_mail) {
        this.admin_mail = admin_mail;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "system_id=" + system_id +
                ", admin_name='" + admin_name + '\'' +
                ", admin_mail='" + admin_mail + '\'' +
                '}';
    }
}
