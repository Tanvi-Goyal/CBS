package com.example.prashant.cbs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class Home extends AppCompatActivity {

    Animation fade_in;
    Animation fade_out;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        viewFlipper= (ViewFlipper) this.findViewById(R.id.flipper);
        fade_in= AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        fade_out= AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(1500);
        viewFlipper.startFlipping();


        findViewById(R.id.btnHome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Home Clicked...");
                Intent intent= new Intent(Home.this, Start.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnSscbs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("SSCBS Clicked...");
                Intent intent= new Intent(Home.this, Sscbs.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "http://sscbsweb.co.in/main/login.php";
                Intent intent= new Intent(Home.this, Portal.class);
                intent.putExtra("web_add", text);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnStudent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Students Clicked...");
                Intent intent= new Intent(Home.this, Stu.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.faculty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, Faculty.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnVictory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Contact_us.class);
                startActivity(intent);
            }
        });

    }
}
