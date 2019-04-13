package com.example.nimishbongale.sickprofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        View easySplashScreenView = new EasySplashScreen(MainActivity.this)
                .withFullScreen()
                .withTargetActivity(FirstActivity.class)
                .withSplashTimeOut(4500)
                .withBackgroundResource(android.R.color.white)
                .withHeaderText(" ")
                .withFooterText("Copyright 2019")
                .withBeforeLogoText("SICKPRO")
                .withLogo(R.drawable.sickpro6)
                .withAfterLogoText("Sick just got real.")
                .create();

        setContentView(easySplashScreenView);
    }
}
