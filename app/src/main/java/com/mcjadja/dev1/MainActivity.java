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

    int stepcount = 0;
    String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doStart(View v) {
        stepcount = 0;
        path = null;
        TextView tv = (TextView) findViewById(R.id.welcometext);
        tv.setText("Choose a path.");
        TextView tv1 = (TextView) findViewById(R.id.Choice_1);
        tv1.setText("Sunken ship");
        TextView tv2 = (TextView) findViewById(R.id.Choice_2);
        tv2.setText("Wandering path");
        TextView tv3 = (TextView) findViewById(R.id.welcomebutton);
        tv3.setText(" ");
    }
    public void Choose1(View v) {
        if(stepcount == 0) {
            path = "1";
            TextView tv = (TextView) findViewById(R.id.welcometext);
            tv.setText("YOU CHOSE THE RIGHT PATH! good job u win. Now for the important question. In what year was the famous pirate BlackBeard hanged?");
            TextView tv1 = (TextView) findViewById(R.id.Choice_1);
            tv1.setText("1728");
            TextView tv2 = (TextView) findViewById(R.id.Choice_2);
            tv2.setText("1718");
            stepcount++;
        }
        else if (stepcount == 1 && path == "2")  {
            doStart(v);
        }
        else if (stepcount == 1 && path == "1")  {
            TextView tv = (TextView) findViewById(R.id.welcometext);
            tv.setText("You were WRONG! ur ship sank and u are now dead. Click a random button to start over");
            TextView tv1 = (TextView) findViewById(R.id.Choice_1);
            tv1.setText(" ");
            TextView tv2 = (TextView) findViewById(R.id.Choice_2);
            tv2.setText(" ");
            stepcount++;
        }
        else if (stepcount == 2 && path == "2")    {
            doStart(v);
        }
        else if (stepcount == 2 && path == "1")    {
            doStart(v);
        }

    }
    public void Choose2(View v) {
        if(stepcount == 0) {
            path = "2";
            TextView tv = (TextView) findViewById(R.id.welcometext);
            tv.setText("You have chosen the WRONG path. This path leads to nothing but death and destruction! Choose wisely, and you might end up back on the right path.");
            TextView tv1 = (TextView) findViewById(R.id.Choice_1);
            tv1.setText("IM SO SORRY OMG NO PLS");
            TextView tv2 = (TextView) findViewById(R.id.Choice_2);
            tv2.setText("Wandering path FtW YoLo~");
            stepcount++;
        }
        else if (stepcount == 1 && path == "2")   {
            TextView tv = (TextView) findViewById(R.id.welcometext);
            tv.setText("You are dead. Click a random button to start over.");
            TextView tv1 = (TextView) findViewById(R.id.Choice_1);
            tv1.setText(" ");
            TextView tv2 = (TextView) findViewById(R.id.Choice_2);
            tv2.setText(" ");
            stepcount++;
        }
        else if (stepcount == 1 && path == "1")  {
            TextView tv = (TextView) findViewById(R.id.welcometext);
            tv.setText("You were RIGHT! ur ship killed all the other pirates and sank before you even set foot on it. You are now the best and only pirate in the whole wide world.");
            TextView tv1 = (TextView) findViewById(R.id.Choice_1);
            tv1.setText("End game");
            TextView tv2 = (TextView) findViewById(R.id.Choice_2);
            tv2.setText("Drink beer (end game)");
            stepcount++;
        }
        else if (stepcount == 2 && path == "2")    {
            doStart(v);
        }
        else if (stepcount == 2 && path == "1")    {
            doStart(v);
        }
    }

}
