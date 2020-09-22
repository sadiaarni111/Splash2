package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Secondscreen_Activity extends AppCompatActivity implements View.OnClickListener {
    TextView menu1;
    Button Button_exit;
    Button Button_3d;
    Button Button_scan;
    Button Button_sound;
    Button Button_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondscreen_);
        menu1 = (TextView) findViewById(R.id.menu1);

        Button_3d = (Button) findViewById(R.id.Button_3d);

        Button_scan = (Button) findViewById(R.id.Button_scan);

        Button_sound = (Button) findViewById(R.id.Button_sound);

        Button_about = (Button) findViewById(R.id.Button_about);
        menu1.setOnClickListener(this);
        Button_3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWatch3d_Activity();
            }
        });
        Button_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScan_ctivity();
            }
        });
        Button_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWatch3d_Activity();
            }
        });
        Button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout_Activity();
            }
        });



        Button_exit = (Button)findViewById(R.id.Button_exit);
        Button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }
    private void openWatch3d_Activity() {
        Intent intent = new Intent(this,Watch3d_Activity.class);
        startActivity(intent);
    }
    private void openScan_ctivity() {
        Intent intent = new Intent(this,Scan_Activity.class);
        startActivity(intent);
    }
    private void openSound_ctivity() {
        Intent intent = new Intent(this,Sound_Activity.class);
        startActivity(intent);
    }
    private void openAbout_Activity() {
        Intent intent = new Intent(this,About_Activity.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {

    }
}