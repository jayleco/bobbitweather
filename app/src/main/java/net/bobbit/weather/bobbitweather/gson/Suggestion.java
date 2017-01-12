package net.bobbit.weather.bobbitweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jayle on 2017/1/13.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CardWash cardWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CardWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
