package com.ljw.webservice_jdk;

import com.ljw.webservice_jdk.service.impl.WeatherServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @Description 发布天气服务
 * @Author lijiewei
 * @Date 2019/4/8 17:20
 * @Version v1.0
 */
public class publish {

    /**
     * 一直提供服务
     * @author lijiewei
     * @param args :
     * @return
     **/
    public static void main(String[] args) {
        //服务发布地址,ip为本机，端口自己定义,访问wsdl需要加?wsdl
        String address = "http://172.25.14.37:9577/web_service/weather";
        //服务的实现类
        Object implementor = new WeatherServiceImpl();
        //发布服务
        Endpoint.publish(address,implementor);

        System.out.println("天气服务发布成功");
    }
}
