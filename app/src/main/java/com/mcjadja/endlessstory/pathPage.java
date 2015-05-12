package com.mcjadja.endlessstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jadja on 5/12/2015.
 */
public class pathPage extends Activity {

    public static String path = "P";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pathpage);
    }

    public void doStart(View v) {
        path = "P";
        TextView tv = (TextView) findViewById(R.id.Text);
        tv.setText("Choose a path.");
        TextView tv1 = (TextView) findViewById(R.id.button1);
        tv1.setText("Choice 1");
        TextView tv2 = (TextView) findViewById(R.id.button2);
        tv2.setText("Choice 2");
    }
}
