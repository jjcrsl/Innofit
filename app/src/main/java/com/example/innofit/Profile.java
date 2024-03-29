package com.example.innofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class Profile extends AppCompatActivity {
    EditText nameget, userget, emailget, passget;
    Button signout;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameget = findViewById(R.id.nameget);
        userget = findViewById(R.id.userget);
        emailget = findViewById(R.id.emailget);
        passget = findViewById(R.id.passget);
        signout = findViewById(R.id.signout_btn);

        String name = getIntent().getStringExtra("keyname");
        String user = getIntent().getStringExtra("keyuser");
        String email = getIntent().getStringExtra("keyemail");
        String password = getIntent().getStringExtra("keypassword");

        nameget.setText(name);
        userget.setText(user);
        emailget.setText(email);
        passget.setText(password);



/*        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signout_perform();

            }
        });


        ImageButton disc = (ImageButton) findViewById(R.id.discs);
        disc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trans (view);
            }

            private void trans(View view) {
                Intent intent = new Intent(Profile.this, Profile.class);
                startActivity(intent);
            }
        });

        ImageButton gallery = (ImageButton) findViewById(R.id.gallerys);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Gallery.class);
                startActivity(intent);
            }
        });
        ImageButton transac = (ImageButton) findViewById(R.id.transac);
        transac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Transaction.class);
                startActivity(intent);
            }
        });
        ImageButton other = (ImageButton) findViewById(R.id.others);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Others.class);
                startActivity(intent);
            }
        });
    }

    private void signout_perform() {
        Intent intent = new Intent(Profile.this, MainActivity.class);
        startActivity(intent);
    }*/

    }
}