package com.ljw.webservice_jdk.service.impl;

import com.ljw.webservice_jdk.service.IWeatherService;
import org.apache.commons.lang3.StringUtils;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 天气服务
 * @Author lijiewei
 * @Date 2019/4/8 16:53
 * @Version v1.0
 */
@WebService(endpointInterface = "com.ljw.webservice_jdk.service.IWeatherService",
        serviceName = "WeatherServiceImpl",
        portName = "WeatherServicePort",
        targetNamespace = "http://webservice_jdk.ljw.com")
public class WeatherServiceImpl implements IWeatherService {

    private  Map<String,String> weather = new HashMap<>();

    @Override
    public String getWeather(String cityName){
        String temp = "请输入正确的城市名称";
        if(StringUtils.isNotBlank(cityName)){
            temp = weather.get(cityName);
            if(StringUtils.isBlank(temp)){
                temp = "没有该城市的信息";
            }
        }
        return temp;
    }

    public WeatherServiceImpl(){
        weather.put("cd","18/32");
        weather.put("cq","20/34");
        weather.put("hl","30/40");
    }

}
