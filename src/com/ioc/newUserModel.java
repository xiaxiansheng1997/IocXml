package com.ioc;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/22 22:09
 */
public class newUserModel extends AnonymousUserModel {
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    private String osName;
}
