package net.bobbit.weather.bobbitweather.gson;

/**
 * Created by jayle on 2017/1/13.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
