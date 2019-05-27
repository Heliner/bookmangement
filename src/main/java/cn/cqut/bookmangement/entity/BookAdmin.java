package cn.cqut.bookmangement.entity;

public class BookAdmin {
    private String adid;

    private String adname;

    private String adpassword;

    private String adphone;

    private String ademail;

    public BookAdmin(String adid, String adname, String adpassword, String adphone, String ademail) {
        this.adid = adid;
        this.adname = adname;
        this.adpassword = adpassword;
        this.adphone = adphone;
        this.ademail = ademail;
    }

    public BookAdmin() {
        super();
    }

    public String getAdid() {
        return adid;
    }

    public void setAdid(String adid) {
        this.adid = adid == null ? null : adid.trim();
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname == null ? null : adname.trim();
    }

    public String getAdpassword() {
        return adpassword;
    }

    public void setAdpassword(String adpassword) {
        this.adpassword = adpassword == null ? null : adpassword.trim();
    }

    public String getAdphone() {
        return adphone;
    }

    public void setAdphone(String adphone) {
        this.adphone = adphone == null ? null : adphone.trim();
    }

    public String getAdemail() {
        return ademail;
    }

    public void setAdemail(String ademail) {
        this.ademail = ademail == null ? null : ademail.trim();
    }
}