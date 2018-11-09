package io.gobo.yahooweatherapi.scheduledtasks;



import io.gobo.yahooweatherapi.domain.WeatherReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class ScheduledTasks
{



    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);



    @Scheduled(fixedRate = 1000)
    public void updateWeather()
    {
        RestTemplate restTemplate = new RestTemplate();

        WeatherReport weatherReport = restTemplate.getForObject("https://query.yahooapis.com/v1/public/yql?q=select item.condition.text from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"wilmington, de\")&format=json&env=store://datatables.org/alltableswithkeys", WeatherReport.class);
        log.info(weatherReport.toString());
    }



}
