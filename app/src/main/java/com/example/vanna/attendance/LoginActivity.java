package com.example.vanna.attendance;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        getSupportActionBar().hide();

        TextView facebookButton = (TextView) findViewById(R.id.facebookButton);

        Typeface iconFont = Typeface.createFromAsset(getAssets(), "fonts/icomoon.ttf");
        facebookButton.setTypeface(iconFont);


    }
}
