package org.zsy.alertsystem.util;

import com.alibaba.fastjson.JSONObject;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 18:02
 */
public class SendMailUtil {

    public static void sendMail(JSONObject mailConfig, String content) throws Exception {

        // 创建Properties 类用于记录邮箱的一些属性
        Properties props = new Properties();
        // 表示SMTP发送邮件，必须进行身份验证
        props.put("mail.smtp.auth", "true");
        //此处填写SMTP服务器
        props.put("mail.smtp.host", mailConfig.getString("mail.smtp.host"));
        //端口号，QQ邮箱给出了两个端口，但是另一个我一直使用不了，所以就给出这一个587
        props.put("mail.smtp.port", mailConfig.getString("mail.smtp.port"));
        // 此处填写你的账号
        props.put("mail.user", mailConfig.getString("mail.user"));
        // 此处的密码就是前面说的16位STMP口令
        props.put("mail.password", mailConfig.getString("mail.password"));


        // 使用环境属性和授权信息，创建邮件会话
        Session session = Session.getDefaultInstance(props);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(session);
        // 设置发件人
        InternetAddress form = new InternetAddress(props.getProperty("mail.user"));
        message.setFrom(form);
        // 设置收件人的邮箱
        InternetAddress to = new InternetAddress("986847686@qq.com");
        message.setRecipient(Message.RecipientType.TO, to);
        // 设置邮件标题
        message.setSubject("测试邮件");
        // 设置发送时间
        message.setSentDate(new Date());
        // 设置纯文本内容为邮件正文
        message.setText(content);
        // 保存并生成最终的邮件内容
        message.saveChanges();

        // 获得Transport实例对象
        Transport transport = session.getTransport("smtp");
        // 打开连接  // 构建授权信息，用于进行SMTP进行身份验证
        transport.connect(props.getProperty("mail.user"), props.getProperty("mail.password"));
        // 将message对象传递给transport对象，将邮件发送出去
        transport.sendMessage(message, message.getAllRecipients());
        // 关闭连接
        transport.close();


    }

}
