package net.bobbit.weather.bobbitweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jayle on 2017/1/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
