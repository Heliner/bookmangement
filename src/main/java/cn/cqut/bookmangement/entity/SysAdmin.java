package cn.cqut.bookmangement.entity;

public class SysAdmin {
    private String adminid;

    private String adminname;

    private String adminpassword;

    private String adminphone;

    private String adminemail;

    public SysAdmin(String adminid, String adminname, String adminpassword, String adminphone, String adminemail) {
        this.adminid = adminid;
        this.adminname = adminname;
        this.adminpassword = adminpassword;
        this.adminphone = adminphone;
        this.adminemail = adminemail;
    }

    public SysAdmin() {
        super();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public String getAdminphone() {
        return adminphone;
    }

    public void setAdminphone(String adminphone) {
        this.adminphone = adminphone == null ? null : adminphone.trim();
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail == null ? null : adminemail.trim();
    }
}