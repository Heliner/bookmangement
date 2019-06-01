package cn.cqut.bookmangement.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class BookAdminCenterDTO {
    private String adpassword;

    private String adphone;

    private String ademail;

    private String adnpassword;

    private String adcpassword;

    public String getAdpassword() {
        return adpassword;
    }

    public void setAdpassword(String adpassword) {
        this.adpassword = adpassword;
    }

    public String getAdphone() {
        return adphone;
    }

    public void setAdphone(String adphone) {
        this.adphone = adphone;
    }

    public String getAdemail() {
        return ademail;
    }

    public void setAdemail(String ademail) {
        this.ademail = ademail;
    }

    public String getAdnpassword() {
        return adnpassword;
    }

    public void setAdnpassword(String adnpassword) {
        this.adnpassword = adnpassword;
    }

    public String getAdcpassword() {
        return adcpassword;
    }

    public void setAdcpassword(String adcpassword) {
        this.adcpassword = adcpassword;
    }
}
