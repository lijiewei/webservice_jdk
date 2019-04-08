import com.ljw.webservice_jdk.IWeatherService;
import com.ljw.webservice_jdk.WeatherServiceImpl;
import org.junit.Test;

/**
 * @Description: 调用webservice
 * @Author: Administrator
 * @CreateDate: 2019/4/8 21:51
 */
public class Call {

    @Test
    public void Test() {
        //wsimport反向生成相应类
        //进入要生成文件的目录：wsimport -s . http://192.168.0.108:9277/web_service/weather?wsdl
        IWeatherService weatherService = new WeatherServiceImpl().getWeatherServicePort();
        String data = weatherService.getWeather("cd");
        System.out.println(data);
    }
}
