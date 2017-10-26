package com.example.prashant.cbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sscbs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sscbs);

        findViewById(R.id.about).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Sscbs.this, About_us.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.lifeCbs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Sscbs.this, LifeAtCbs.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.facilities).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Sscbs.this, Facilities.class);
                startActivity(intent);
            }
        });

}
}