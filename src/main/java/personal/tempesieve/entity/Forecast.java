package personal.tempesieve.entity;

/**
 * $Author: ecortez
 * $Date: 1/11/2017
 */

public class Forecast {
    private String stationId;
    private String observationTime;
    private String weather;
    private String tempF;
    private String tempC;
    private String humidity;
    private String windDir;
    private String windSpeedMph;
    private String windSpeedKph;
    private String feelsLikeF;
    private String feelsLikeC;
    private String icon;
    private String iconUrl;

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTempF() {
        return tempF;
    }

    public void setTempF(String tempF) {
        this.tempF = tempF;
    }

    public String getTempC() {
        return tempC;
    }

    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public String getWindSpeedMph() {
        return windSpeedMph;
    }

    public void setWindSpeedMph(String windSpeedMph) {
        this.windSpeedMph = windSpeedMph;
    }

    public String getWindSpeedKph() {
        return windSpeedKph;
    }

    public void setWindSpeedKph(String windSpeedKph) {
        this.windSpeedKph = windSpeedKph;
    }

    public String getFeelsLikeF() {
        return feelsLikeF;
    }

    public void setFeelsLikeF(String feelsLikeF) {
        this.feelsLikeF = feelsLikeF;
    }

    public String getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(String feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
