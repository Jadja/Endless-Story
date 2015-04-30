package com.mcjadja.dev1;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View v) {
        TextView tv = (TextView) findViewById(R.id.welcometext);
        tv.setText("Kies een pad.");
        TextView tv1 = (TextView) findViewById(R.id.Choice_1);
        tv1.setText("Sunken Ship");
        TextView tv2 = (TextView) findViewById(R.id.Choice_2);
        tv2.setText("Wandering path");
        TextView tv3 = (TextView) findViewById(R.id.welcomebutton);
        tv2.setText("");
    }
}
