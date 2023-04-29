package com.peanut.utils;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailUtils {
    public static  void  sendAuthCodeEmail(String email,String authCode){
        try{
            SimpleEmail mail = new SimpleEmail();
            mail.setHostName("smtp.qq.com");//发送邮件的服务器
            mail.setAuthentication("916825758@qq.com","hwhmkvxbhrqhbdhb");
            mail.setFrom("916825758@qq.com","haha");//发送邮件的邮箱和发件人
            mail.setSSLOnConnect(false); //使用安全链接
            mail.addTo(email);//接收的邮箱
            mail.setSubject("验证码");//设置邮件的主题
            mail.setMsg("尊敬的用户:你好!\n 登陆验证码为:" + authCode+"\n"+"     (有效期为一分钟)");//设置邮件的内容
            mail.send();//发送
            mail.setSmtpPort(456);
            mail.setSSLOnConnect(true);
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
