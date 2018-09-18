package com.example.teleworld.socialbetterbet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.betterbet.betterbet.betterbet.R;


public class Loginscreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);


        final ImageView sigin = (ImageView)findViewById(R.id.signinlogo);


        sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signin1 = new Intent(Loginscreen.this, eventpage.class);
                Loginscreen.this.startActivity(signin1);

            }
        });

        EditText signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Loginscreen.this, Signup.class));
            }
        });


    }
}
