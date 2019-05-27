package cn.cqut.bookmangement.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookAdminCenterDTO {
    private String adpassword;

    private String adphone;

    private String ademail;

    private String adnPassword;

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

    public String getAdnPassword() {
        return adnPassword;
    }

    public void setAdnPassword(String adnPassword) {
        this.adnPassword = adnPassword;
    }

    public String getAdcpassword() {
        return adcpassword;
    }

    public void setAdcpassword(String adcpassword) {
        this.adcpassword = adcpassword;
    }
}
