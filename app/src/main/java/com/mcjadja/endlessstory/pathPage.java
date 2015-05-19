package com.mcjadja.endlessstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

/**
 * Created by Jadja on 5/12/2015.
 */
public class pathPage extends Activity {

    String path = "P_";
    String name;
    String Text;
    String C1;
    String C2;

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
    public void Restart(View v) {
        path = "P_";
    }

    //Choose which string goes in the buttons and the text at the current path code:
    public void Choose(View V) {
        if (path.equals("P_000")) {
            path = "P_1";
        }

        if (path.equals("P_0010"))   {
            //play "dick in a box" music
            path = "P_0010";
        }

        if (path.equals("P_0011"))   {
            //play "eat it" music
            path = "P_0010";
        }

        if(path == "P_111")    {
            Restart(V);
        }
        else {
            final String packageName = getPackageName();

            int resId_T = getResources().getIdentifier(path + "_T", "string", packageName);
            Text = getResources().getString(resId_T);

            int resId_C1 = getResources().getIdentifier(path + "_C1", "string", packageName);
            C1 = getResources().getString(resId_C1);

            int resId_C2 = getResources().getIdentifier(path + "_C2", "string", packageName);
            C2 = getResources().getString(resId_C2);
        }
        TextView tv = (TextView) findViewById(R.id.Text);
        tv.setText(Text);
        TextView tv1 = (TextView) findViewById(R.id.button1);
        tv1.setText(C1);
        TextView tv2 = (TextView) findViewById(R.id.button2);
        tv2.setText(C2);
    }
}
