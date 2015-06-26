package com.mcjadja.endlessstory;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jadja on 5/12/2015.
 */

@TargetApi(Build.VERSION_CODES.GINGERBREAD)
@SuppressLint("NewApi")

public class informationRequest extends Activity {

    TextView tv1;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informationrequest);

        edt = (EditText) findViewById(R.id.username);
        tv1 = (TextView) findViewById(R.id.textViewCounter);
        tv1.setText("00:01:00");

        final CounterClass timer = new CounterClass(60000, 1000);

        timer.start();
        System.out.println("user is a poopy'mc-poopface in 1 minute");
    }



    public void startPath(View v) {
        EditText edt = (EditText) findViewById(R.id.username);
        String name = edt.getText().toString();
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), pathPage.class);
        nextScreen.putExtra("name", name);

        startActivity(nextScreen);

    }


    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")
    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @SuppressLint("NewApi")
        @TargetApi(Build.VERSION_CODES.GINGERBREAD)
        @Override
        public void onTick(long millisUntilFinished) {

            long millis = millisUntilFinished;
            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
            System.out.println(hms);
            tv1.setText(hms);
        }

        @Override
        public void onFinish() {
            edt.setText("Poopface");
            System.out.println("user is now a poopy'mc-poopface");
        }
    }
}