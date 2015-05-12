package com.mcjadja.endlessstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Jadja on 5/12/2015.
 */
public class informationRequest extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informationrequest);
    }

    public void doMenu(View v) {
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(nextScreen);
    }
    public void startPath(View v) {
        EditText edt = (EditText)findViewById(R.id.username);
        String name = edt.getText().toString();
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), pathPage.class);
        nextScreen.putExtra("name", name);

        startActivity(nextScreen);

    }

}
