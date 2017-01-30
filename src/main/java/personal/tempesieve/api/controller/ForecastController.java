package personal.tempesieve.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import personal.tempesieve.configs.WeatherConfigurations;
import personal.tempesieve.entity.Forecast;
import personal.tempesieve.rest.dao.ForecastRestDao;

/**
 * $Author: ecortez
 * $Date: 1/11/2017
 */

@Controller
@RequestMapping(value = "/forecast")
public class ForecastController {

	@Autowired
	WeatherConfigurations weatherConfigurations;

	@Autowired
	ForecastRestDao forecastRestDao;

	@RequestMapping(value = "/")
	public String getForecast(){
		String url = getFormatedApiUrl();
		String urlWithQuery = getQueryFormatedUrl(url);
		Forecast forecast = forecastRestDao.getWeatherForecast(url,
																weatherConfigurations.getLocation(),
																weatherConfigurations.getFormat());
		return forecast.toString();
	}

	private String getFormatedApiUrl(){
		return getQueryFormatedUrl(weatherConfigurations.getUrl().concat(weatherConfigurations.getId()));
	}

	private String getQueryFormatedUrl(String url){
		return url.concat(weatherConfigurations.getQuery());
	}
}
