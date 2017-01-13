package net.bobbit.weather.bobbitweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jayle on 2017/1/13.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
