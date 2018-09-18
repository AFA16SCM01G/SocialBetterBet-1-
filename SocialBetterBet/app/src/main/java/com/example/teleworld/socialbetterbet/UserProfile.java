package com.example.teleworld.socialbetterbet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.betterbet.betterbet.betterbet.R;

public class UserProfile extends AppCompatActivity {

    protected EditText name;
    protected EditText loc;
    protected EditText email;

    private TextView profilepic;
    private static final int GALLERY_INTENT = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);


        name = findViewById(R.id.Fname);
        loc = findViewById(R.id.location);


        ImageView Save = findViewById(R.id.imageView6);


        profilepic = findViewById(R.id.profilepiclink);

        profilepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilepicintent = new Intent(Intent.ACTION_PICK);
                profilepicintent.setType("image/*");
                startActivityForResult(profilepicintent, GALLERY_INTENT);
            }
        });

        ImageView imgvw = findViewById(R.id.imageView5);

        Intent myIntent = new Intent(UserProfile.this, mepage.class);
        startActivity(myIntent);


    }
}
