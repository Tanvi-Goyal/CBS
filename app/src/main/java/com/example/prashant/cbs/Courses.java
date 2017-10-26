package com.example.prashant.cbs;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        String add = null;
        if (bd != null) {
            add = (String) bd.get("web_add");
        }

        final DownloadManager[] downloadManager = new DownloadManager[1];
        Button abtCourse = (Button) findViewById(R.id.abtCourse);
        abtCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager[0] = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.du.ac.in/du/uploads/02112016_Holiday.PDF");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager[0].enqueue(request);
            }
        });


        Button syllabus = (Button) findViewById(R.id.syllabus);
        final String finalAdd = add;
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager[0] = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse(finalAdd);
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager[0].enqueue(request);
            }
        });

        Button fee1 = (Button) findViewById(R.id.fee_1);
        final String finalAdd1 = add;
        fee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager[0] = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse(finalAdd1);
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager[0].enqueue(request);
            }
        });


        Button fee2 = (Button) findViewById(R.id.fee_2);
        fee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager[0] = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.du.ac.in/du/uploads/02112016_Holiday.PDF");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager[0].enqueue(request);
            }
        });

        Button fee3 = (Button) findViewById(R.id.fee_3);
        fee3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager[0] = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.du.ac.in/du/uploads/02112016_Holiday.PDF");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager[0].enqueue(request);
            }
        });


    }

}
