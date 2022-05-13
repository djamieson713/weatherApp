package com.jamieson.weatherfinal;

import android.app.Application;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Model implements API {

    private static Model sInstance = null;
    private final API mApi;
    private static MainActivity ma;

    public static Model getInstance(Application application) {
        if (sInstance == null) {
            sInstance = new Model(application);

        }
        return sInstance;
    }

    private final Application mApplication;

    private Model(Application application) {
        mApplication = application;
        mApi = new WeatherApi(mApplication);
    }

    public Application getApplication() {
        return mApplication;
    }


    @Override
    public void getWeatherDetails( EditText etCity, TextView tvResult, String url, String appid, DecimalFormat df, String units) {
            mApi.getWeatherDetails( etCity, tvResult, url, appid, df, units );
    }
}
