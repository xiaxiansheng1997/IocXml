package com.ioc;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/22 19:13
 */
public class UserService {

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    private UserModel userModel;

    public void findUser() {
        System.out.println("----------user name:"+userModel.getName()+" id:"+userModel.getId());
    }

    public UserService(UserModel userModel) {
        this.userModel = userModel;
    }

}
