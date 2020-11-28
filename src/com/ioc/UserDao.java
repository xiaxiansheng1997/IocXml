package com.ioc;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/22 22:10
 */
public class UserDao {
    private newUserModel newUserModel;

    public com.ioc.newUserModel getNewUserModel() {
        return newUserModel;
    }

    public void setNewUserModel(com.ioc.newUserModel newUserModel) {
        this.newUserModel = newUserModel;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public boolean isPhone() {
        return isPhone;
    }

    public void setPhone(boolean phone) {
        isPhone = phone;
    }

    private boolean isMan;
    private String ageType;
    private boolean isPhone;

    public void show(){
        System.out.println("isMna:"+isMan);
        System.out.println("ageType:"+ageType);
        System.out.println("isPhone:"+isPhone);
        System.out.println("id:"+newUserModel.getId());
        System.out.println("name:"+newUserModel.getName());
        System.out.println("age:"+newUserModel.getAge());
        System.out.println("osName:"+newUserModel.getOsName());
    }
}
