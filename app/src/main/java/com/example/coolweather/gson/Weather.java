package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.security.PublicKey;
import java.util.List;

/**
 * Created by Administrator on 2017/12/2.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
