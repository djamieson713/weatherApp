package com.jamieson.weatherfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private final String url = "http://api.openweathermap.org/data/2.5/weather";
    //WeatherApi units = new WeatherApi(getApplication());


    private final String appid = "c89c82c6544a5543dca31c52dea0843a";
    DecimalFormat df = new DecimalFormat("#.##");
    String units = "imperial";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        EditText etCity = findViewById( R.id.etCity);
        TextView tvResult = findViewById( R.id.tvResult);
        Button getBtn  = findViewById(R.id.btnGet);

        getBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Model model = Model.getInstance(MainActivity.this.getApplication());
                model.getWeatherDetails( etCity, tvResult, url, appid, df, units);

            }
        } );

    }
}