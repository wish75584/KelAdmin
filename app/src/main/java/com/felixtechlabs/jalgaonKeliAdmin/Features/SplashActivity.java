package com.felixtechlabs.jalgaonKeliAdmin.Features;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.felixtechlabs.jalgaonKeliAdmin.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //defining firebase
        firebaseAuth = FirebaseAuth.getInstance();
        handleRedirection();

    }

    private void handleRedirection() {
        new Handler().postDelayed(() -> {
            /*
             * Logic to check whether user is already logged in or not
             * if logged in go to dashboard else show login activity
             */
            FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
            if (firebaseUser == null) {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            } else {
                Intent intent2 = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent2);
                finish();
            }
        }, 800);

    }
}



