package com.example.prashant.cbs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {

               Intent intent  = new Intent(Start.this,Home.class);
                finish();
                startActivity(intent);
            }
        }, 1000);
    }


}
