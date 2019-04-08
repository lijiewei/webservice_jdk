package com.ljw.webservice_jdk.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @Description
 * @Author lijiewei
 * @Date 2019/4/8 18:04
 * @Version v1.0
 */
@WebService(name = "IWeatherService",targetNamespace = "http://webservice_jdk.ljw.com")
public interface IWeatherService {

    @WebResult(name="weather")
    String getWeather(@WebParam(name="cityName") String cityName);
}
