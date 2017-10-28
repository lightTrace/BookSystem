package cn.com.entity;

/**
 * ${DESCRIPTION}
 *
 * @author lightTrace
 * @create 2017-10-28 11:15
 **/
public class User {
    private String userName;    //用户名
    private String password;    //密码
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
