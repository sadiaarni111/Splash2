package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class MainActivity extends AppCompatActivity implements Runnable {



    public Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        handler.postDelayed(this, 5000);
    }
    @Override
    public void run(){

        Intent intent = new Intent(MainActivity.this, Secondscreen_Activity.class);
        startActivity(intent);
        finish();
        }
    @Override
     public void onBackPressed(){
        super.onBackPressed();
        handler.removeCallbacks(this);
    }
    }


