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

    String path = "P_";
    String name;
    String Text = "T_";
    String C1 = "C1_";
    String C2 = "C2_";

    // Path page strings:

    //P
    String T_ = "test page 1 text";
    String C1_ = "test page 1 Choice 1";
    String C2_ = "test page 1 Choice 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pathpage);
        Intent i = getIntent();
        i.getStringExtra("name");
        name = i.getStringExtra("name");
    }

    public void Choose1(View V) {
        Text+= "0";
        C1+= "0";
        C2+= "0";
        TextView tv = (TextView) findViewById(R.id.Text);
        tv.setText(Text);
        TextView tv1 = (TextView) findViewById(R.id.button1);
        tv1.setText(C1);
        TextView tv2 = (TextView) findViewById(R.id.button2);
        tv2.setText(C2);
    }

    public void Choose2(View V) {
        path+= "1";
        String Text = "getResources().getString(R.string." + path + "_T1)";
        String Option1 = "getResources().getString(R.string." + path + "_C1)";
        String Option2 = "getResources().getString(R.string." + path + "_C2)";
        TextView tv = (TextView) findViewById(R.id.Text);
        tv.setText("Hello, " + name + ". You chose option 2");
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
