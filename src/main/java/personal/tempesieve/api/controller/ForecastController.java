package personal.tempesieve.api.controller;

import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * $Author: ecortez
 * $Date: 1/11/2017
 */

@RestController
@RequestMapping(value = "/forecast")
public class ForecastController {

	//Endpoint for getting forecast
	// "/api/72347b0b78ed72b4/forecast/q/IL/Chicago.json"

	@RequestMapping(value = "/")
	public String getForecast(){
		RestTemplate rest = new RestTemplate();
		

		HttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
		HttpMessageConverter stringHttpMessageConverternew = new StringHttpMessageConverter();
		rest.setMessageConverters(new HttpMessageConverter[]{formHttpMessageConverter, stringHttpMessageConverternew});

		return postForObject(getRestTemplate(), getDomain(), location);
	}
}
