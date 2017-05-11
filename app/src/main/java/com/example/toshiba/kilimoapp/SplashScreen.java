package com.example.toshiba.kilimoapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by TOSHIBA on 5/9/2017.
 */

public class SplashScreen extends AppCompatActivity {


    // Splash screen timer
    private static int SPLASH_TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            /**
             * Showing splash screen with a timer.  For app logo
             */
            @Override
            public void run() {
                // method to be executed after timer is over
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
