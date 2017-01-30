package personal.tempesieve.rest.dao;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import personal.tempesieve.entity.Forecast;
import personal.tempesieve.util.ForecastFormatter;

/**
 * $Author: ecortez
 * $Date: 1/30/2017
 */

@RestController
@Component
public class ForecastRestDao {

    RestTemplate restTemplate = new RestTemplate();

    public Forecast getWeatherForecast(String url, String location, String format){
        String apiUrl = url.concat(location);
        String finalUrl = apiUrl.concat(format);

        return ForecastFormatter.formatForecast(restTemplate.getForObject(finalUrl, String.class));
    }
}
