package net.bobbit.weather.bobbitweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jayle on 2017/1/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }


}
