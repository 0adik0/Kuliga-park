package com.app.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ForgotPassword extends AppCompatActivity {

    ImageView imageView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(view -> {
            Intent intent = new Intent(ForgotPassword.this, LoginActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2);
            finish();
        });
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Intent intent = new Intent(ForgotPassword.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slidein1, R.anim.slideout2);
        finish();
    }
}