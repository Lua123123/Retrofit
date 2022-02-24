package com.example.mvp.Presenter;

import android.util.Log;

import com.example.mvp.Model.Weather;
import com.example.mvp.View.IView;
import com.google.gson.Gson;

public class Presenter implements IPresenter {
    private IView iView;

    public Presenter(IView iView) {
        this.iView = iView;
    }

    @Override
    public void getWeatherByCity(String city) {

        Weather weather = new Weather("London", "warehouse", 1);

        Gson gson = new Gson();
        String strJson = gson.toJson(weather);
        Log.d("iii", strJson);
    }
}
