package main.java.com.six.ejb.bean;

import javax.faces.bean.ManagedBean;

/**
 * Created by liuze on 2017/2/25.
 */
@ManagedBean
public class RegistrationBean {

    private String firstName, lastName, emailAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * 指令控制方法  注册
     * @return  注册成功 注册失败 页面
     */
    public String doRegistration() {
        if (firstName.isEmpty()||lastName.isEmpty()||emailAddress.isEmpty()) {
            return("registration-error");
        } else {
            return("registration-success");
        }
    }

}
