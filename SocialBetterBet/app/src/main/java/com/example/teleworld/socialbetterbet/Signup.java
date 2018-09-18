package com.example.teleworld.socialbetterbet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.betterbet.betterbet.betterbet.R;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ImageView btn1 = findViewById(R.id.singinicon);

        Intent myIntent = new Intent(Signup.this, UserProfile.class);



    }
}
