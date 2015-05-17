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

    String Text;
    String C1;
    String C2;

    // Path page strings:

    //P0
    String T_0 = "test page choice 1";
    String C1_0 = "test page choice 1 page, Choice 1";
    String C2_0 = "test page choice 1 page, Choice 2";

    //P1
    String T_1 = "test page choice 2";
    String C1_1 = "test page choice 2 page, 1 Choice 1";
    String C2_1 = "test page choice 2 page, 1 Choice 2";

    //P10
    String T_10 = "test page choice 2";
    String C1_10 = "test page choice 2 page, 1 Choice 1";
    String C2_10 = "test page choice 2 page, 1 Choice 2";

    //P11
    String T_11 = "test page choice 2";
    String C1_11 = "test page choice 2 page, 1 Choice 1";
    String C2_11 = "test page choice 2 page, 1 Choice 2";

    //P00
    String T_00 = "test page choice 2";
    String C1_00 = "test page choice 2 page, 1 Choice 1";
    String C2_00 = "test page choice 2 page, 1 Choice 2";

    //P01
    String T_01 = "test page choice 2";
    String C1_01 = "test page choice 2 page, 1 Choice 1";
    String C2_01 = "test page choice 2 page, 1 Choice 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pathpage);
        Intent i = getIntent();
        i.getStringExtra("name");
        name = i.getStringExtra("name");
    }

    //Choices:
    public void Choose1(View v) {
        path+= "0";
        Choose(v);
    }
    public void Choose2(View v) {
        path+= "1";
        Choose(v);
    }

    //Choose which string goes in the buttons and the text at the current path code:
    public void Choose(View V) {
        if(path == "P_0") {
            T_0 = Text;
            C1_0 = C1;
            C2_0 = C2;
        }
        else if(path == "P_1") {
            Text = T_1;
            C1 = C1_1;
            C2 = C2_1;
        }
        else if(path == "P_10") {
            Text = T_10;
            C1 = C1_10;
            C2 = C2_10;
        }
        else if(path == "P_11") {
            Text = T_11;
            C1 = C1_11;
            C2 = C2_11;
        }
        else if(path == "P_00") {
            Text = T_00;
            C1 = C1_00;
            C2 = C2_00;
        }
        else if(path == "P_1") {
            Text = T_01;
            C1 = C1_01;
            C2 = C2_01;
        }
        else    {
            Text = path;
            C1 = "Error";
            C2 = "Error";
        }

        TextView tv = (TextView) findViewById(R.id.Text);
        tv.setText(Text);
        TextView tv1 = (TextView) findViewById(R.id.button1);
        tv1.setText(C1);
        TextView tv2 = (TextView) findViewById(R.id.button2);
        tv2.setText(C2);
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
