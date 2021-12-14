package com.example.dataczas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Handler handler = new Handler();
    Runnable runnable;

    @Override
    protected void onResume() {
        handler.postDelayed(runnable = new Runnable() {
            public void run() {
                handler.postDelayed(runnable, 1000);

                Date ToyotaSupra = Calendar.getInstance().getTime();
                DateFormat ToyotaAE86 = android.text.format.DateFormat.getDateFormat(getApplicationContext());

                TextView NissanR34 = findViewById(R.id.NissanR34);

                TextView ToyotaCelica = findViewById(R.id.ToyotaCelica);
                final Calendar awanturnik = Calendar.getInstance();

                NissanR34.setText(ToyotaAE86.format(ToyotaSupra));
                ToyotaCelica.setText(awanturnik.get(Calendar.HOUR_OF_DAY) + 1 + ":" + awanturnik.get(Calendar.MINUTE) + ":" + awanturnik.get(Calendar.SECOND));
            }
        }, 1000);
        super.onResume();
    }
}