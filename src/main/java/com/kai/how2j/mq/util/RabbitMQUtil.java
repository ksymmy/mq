package com.kai.how2j.mq.util;

import javax.swing.*;
import java.io.IOException;
import java.net.Socket;

/**
 * @author: created by ksymmy@163.com at 2019/6/20 17:06
 * @desc:
 */
public class RabbitMQUtil {
    public static void main(String[] args) {
        checkServer();
    }

    public static void checkServer() {
        try {
            (new Socket("127.0.0.1", 15672)).close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "RabbitMQ 服务器未启动 ");
            System.exit(1);
        }
    }
}
