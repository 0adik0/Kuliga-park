package com.app.park;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private long backPressedTime;

    AppCompatButton btnReg;
    TextView forgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnReg = findViewById(R.id.btnReg);
        btnReg.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_bottom);
            finish();
        });

        forgotPass = findViewById(R.id.forgotPass);
        forgotPass.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, ForgotPassword.class));
            overridePendingTransition(R.anim.slidein, R.anim.slideout);
            finish();
        });
    }

    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        }

        backPressedTime = System.currentTimeMillis();
    }
}