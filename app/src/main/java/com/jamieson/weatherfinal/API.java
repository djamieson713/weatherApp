package com.jamieson.weatherfinal;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public interface API {

     void getWeatherDetails(EditText etCity, TextView tvResult, String url, String appid, DecimalFormat df, String units);

}
