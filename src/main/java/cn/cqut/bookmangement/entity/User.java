package cn.cqut.bookmangement.entity;

public class User {
    private String userId;

    private String userName;

    private String password;

    private String email;

    private Integer max;

    private Integer time;

    private Integer lendedNum;

    private String phone;

    private String major;

    private String departments;

    public User(String userId, String userName, String password, String email, Integer max, Integer time, Integer lendedNum, String phone, String major, String departments) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.max = max;
        this.time = time;
        this.lendedNum = lendedNum;
        this.phone = phone;
        this.major = major;
        this.departments = departments;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getLendedNum() {
        return lendedNum;
    }

    public void setLendedNum(Integer lendedNum) {
        this.lendedNum = lendedNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments == null ? null : departments.trim();
    }
}