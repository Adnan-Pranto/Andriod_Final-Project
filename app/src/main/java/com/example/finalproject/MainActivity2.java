package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void cancel(View view) {
        Intent myCancel = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(myCancel);
    }

    public void login(View view) {
        Intent logIn = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(logIn);
    }
}