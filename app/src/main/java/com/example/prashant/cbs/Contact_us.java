package com.example.prashant.cbs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Contact_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        findViewById(R.id.call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String p = "tel:01122154581\n";
                i.setData(Uri.parse(p));
                 startActivity(i);
            }
        });


        findViewById(R.id.email).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "Get-Lost";
                String body = "Body";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:pk021998@gmail.com" + "?subject=" + sub + "&body=" + body);
                intent.setData(data);
                startActivity(intent);
            }
        });

        findViewById(R.id.web).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "http://sscbs.du.ac.in/";
                Intent intent = new Intent(Contact_us.this, Portal.class);
                intent.putExtra("web_add", text);
                startActivity(intent);
            }
        });

        findViewById(R.id.address).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(Contact_us.this,Maps.class);
                startActivity(i);
            }
        });

    }

}
