package com.example.mvp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvp.Model.Weather;
import com.example.mvp.Presenter.Presenter;
import com.example.mvp.R;

public class MainActivity extends AppCompatActivity implements IView {

    Presenter presenter = new Presenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter.getWeatherByCity("london");

    }

    @Override
    public void onWeatherByCity(Weather weather) {

    }

}