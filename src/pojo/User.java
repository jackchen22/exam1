package pojo;

public class User {
Integer id;
String userName;
String loginName;
String password;
String right;
String userStatus;
String userEndTime;
String userDesc;
String className;
String userEmail;
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
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    public String getUserEndTime() {
        return userEndTime;
    }

    public void setUserEndTime(String userEndTime) {
        this.userEndTime = userEndTime;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", right='" + right + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", userEndTime='" + userEndTime + '\'' +
                ", userDesc='" + userDesc + '\'' +
                ", className='" + className + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
