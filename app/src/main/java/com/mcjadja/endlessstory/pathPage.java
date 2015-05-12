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

    String path = "P";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pathpage);
        Intent i = getIntent();
        i.getStringExtra("name");
        String name = i.getStringExtra("name");
    }

    public void Choose1(View V) {
        path+= "0";
        String Text = "getResources().getString(R.string." + path + "_T1)";
        String Option1 = "getResources().getString(R.string." + path + "_C1)";
        String Option2 = "getResources().getString(R.string." + path + "_C2)";
        TextView tv = (TextView) findViewById(R.id.Text);
        tv.setText(Text);
        TextView tv1 = (TextView) findViewById(R.id.button1);
        tv1.setText(Option1);
        TextView tv2 = (TextView) findViewById(R.id.button2);
        tv2.setText(Option2);
    }

    public void Choose2(View V) {
        path+= "1";
        String Text = "getResources().getString(R.string." + path + "_T1)";
        String Option1 = "getResources().getString(R.string." + path + "_C1)";
        String Option2 = "getResources().getString(R.string." + path + "_C2)";
        TextView tv = (TextView) findViewById(R.id.Text);
        tv.setText(Text);
        TextView tv1 = (TextView) findViewById(R.id.button1);
        tv1.setText(Option1);
        TextView tv2 = (TextView) findViewById(R.id.button2);
        tv2.setText(Option2);
    }

    public void doStart(View v) {
        String Text = "getResources().getString(R.string." + path + "_T1)";
        String Option1 = "getResources().getString(R.string." + path + "_C1)";
        String Option2 = "getResources().getString(R.string." + path + "_C2)";
        TextView tv = (TextView) findViewById(R.id.Text);
        tv.setText(Text);
        TextView tv1 = (TextView) findViewById(R.id.button1);
        tv1.setText(Option1);
        TextView tv2 = (TextView) findViewById(R.id.button2);
        tv2.setText(Option2);
    }
}
