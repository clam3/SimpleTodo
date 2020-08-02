package com.example.simpletodo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // start home activity
        startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
        // close splash activity
        finish();
    }
}