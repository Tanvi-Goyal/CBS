package com.example.prashant.cbs;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.prashant.cbs.R.id.calendertext;
import static com.example.prashant.cbs.R.id.coursestext;
import static com.example.prashant.cbs.R.id.placementstext;
import static com.example.prashant.cbs.R.id.questext;
import static com.example.prashant.cbs.R.id.tttext;

public class Stu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu);


        LinearLayout layout0 = (LinearLayout) findViewById(R.id.sublayout0);
        layout0.setVisibility(View.GONE);

        final TextView text0 = (TextView) findViewById(calendertext);
        text0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LinearLayout layout0 = (LinearLayout) findViewById(R.id.sublayout0);

                if(layout0.getVisibility()== View.GONE) {
                    layout0.setVisibility(View.VISIBLE);
                }
                else layout0.setVisibility(View.GONE);

            }
        });

        LinearLayout layout1 = (LinearLayout) findViewById(R.id.sublayout1);
        layout1.setVisibility(View.GONE);

        final TextView text1 = (TextView) findViewById(coursestext);
        text1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LinearLayout layout1 = (LinearLayout) findViewById(R.id.sublayout1);

                if(layout1.getVisibility()== View.GONE) {
                    layout1.setVisibility(View.VISIBLE);
                }
                else layout1.setVisibility(View.GONE);
            }
        });


        LinearLayout layout2 = (LinearLayout) findViewById(R.id.sublayout2);
        layout2.setVisibility(View.GONE);

        final TextView text2 = (TextView) findViewById(tttext);
        text2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LinearLayout layout2 = (LinearLayout) findViewById(R.id.sublayout2);
                layout2.setVisibility(View.VISIBLE);

            }
        });

        final LinearLayout layout22 = (LinearLayout) findViewById(R.id.tt);
        layout22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LinearLayout layout22 = (LinearLayout) findViewById(R.id.sublayout2);
                layout22.setVisibility(View.GONE);

            }
        });


        LinearLayout layout3 = (LinearLayout) findViewById(R.id.sublayout3);
        layout3.setVisibility(View.GONE);

        final TextView text3 = (TextView) findViewById(questext);
        text3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LinearLayout layout3 = (LinearLayout) findViewById(R.id.sublayout3);
                layout3.setVisibility(View.VISIBLE);

            }
        });

        final LinearLayout layout33 = (LinearLayout) findViewById(R.id.ques);
        layout33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LinearLayout layout33 = (LinearLayout) findViewById(R.id.sublayout3);
                layout33.setVisibility(View.GONE);
            }
        });


        LinearLayout layout4 = (LinearLayout) findViewById(R.id.sublayout4);
        layout4.setVisibility(View.GONE);

        final TextView text4 = (TextView) findViewById(placementstext);
        text4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LinearLayout layout4 = (LinearLayout) findViewById(R.id.sublayout4);
                layout4.setVisibility(View.VISIBLE);

            }
        });

        final LinearLayout layout44 = (LinearLayout) findViewById(R.id.placements);
        layout44.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LinearLayout layout44 = (LinearLayout) findViewById(R.id.sublayout4);
                layout44.setVisibility(View.GONE);
            }
        });


        final DownloadManager[] downloadManager = new DownloadManager[1];
        Button button2 = (Button) findViewById(R.id.b2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager[0] = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.du.ac.in/du/uploads/02112016_Holiday.PDF");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager[0].enqueue(request);
            }
        });

        Button button1 = (Button) findViewById(R.id.b1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager[0] = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.du.ac.in/du/uploads/02112016_Holiday.PDF");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager[0].enqueue(request);
            }
        });


        LinearLayout text7 = (LinearLayout) findViewById(R.id.sub_layout1_bbs_text_layout);
        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "http://sscbsweb.co.in/main/login.php";
                Intent intent= new Intent(Stu.this, Courses.class);
                intent.putExtra("web_add", text);
                startActivity(intent);

            }
        });

        LinearLayout text8 = (LinearLayout) findViewById(R.id.sub_layout1_bsc_text_layout);
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("BSC Clicked...");
                String text = "http://www.du.ac.in/du/uploads/02112016_Holiday.PDF";
                Intent intent= new Intent(Stu.this, Courses.class);
                intent.putExtra("web_add", text);
                startActivity(intent);

            }
        });

        LinearLayout text9 = (LinearLayout) findViewById(R.id.sub_layout1_bms_text_layout);
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("BMS Clicked...");
                Intent intent= new Intent(Stu.this, Courses.class);
                startActivity(intent);

            }
        });

        LinearLayout text10 = (LinearLayout) findViewById(R.id.sub_layout2_bbs_text_layout);
        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("BBS Clicked...");
                Intent intent= new Intent(Stu.this,Years.class);
                startActivity(intent);

            }
        });

        LinearLayout text11 = (LinearLayout) findViewById(R.id.sub_layout2_bsc_text_layout);
        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("BSC Clicked...");
                Intent intent= new Intent(Stu.this, Years.class);
                startActivity(intent);

            }
        });

        LinearLayout text12 = (LinearLayout) findViewById(R.id.sub_layout2_bms_text_layout);
        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("BMS Clicked...");
                Intent intent= new Intent(Stu.this, Years.class);
                startActivity(intent);

            }
        });


        LinearLayout text13 = (LinearLayout) findViewById(R.id.sub_layout3_bbs_text_layout);
        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("BBS Clicked...");
                Intent intent= new Intent(Stu.this, Semester.class);
                startActivity(intent);

            }
        });

        LinearLayout text14 = (LinearLayout) findViewById(R.id.sub_layout3_bsc_text_layout);
        text14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("BSC Clicked...");
                Intent intent= new Intent(Stu.this, Semester.class);
                startActivity(intent);

            }
        });

        LinearLayout text15 = (LinearLayout) findViewById(R.id.sub_layout3_bms_text_layout);
        text15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("BMS Clicked...");
                Intent intent= new Intent(Stu.this, Semester.class);
                startActivity(intent);

            }
        });

        TextView text16 = (TextView) findViewById(R.id.sub_layout4_placements_text);
        text16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Placements Record Clicked...");
                Intent intent= new Intent(Stu.this, Placements.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.society).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Placements Record Clicked...");
                Intent intent= new Intent(Stu.this, Societies.class);
                startActivity(intent);
            }
        });

    }

    }

