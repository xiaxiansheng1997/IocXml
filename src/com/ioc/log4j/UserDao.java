package com.ioc.log4j;

import org.apache.log4j.Logger;

public class UserDao {
    static Logger logger = Logger.getLogger(UserDao.class);

    public void runUser(){
        logger.info("方法开始");
        System.out.println("日志输出");
        try {
            String str = null;
            str.charAt(0);
        } catch (Exception e){
            logger.error("空指针:"+e.toString());
        }
        logger.info("方法结束");
    }
}
