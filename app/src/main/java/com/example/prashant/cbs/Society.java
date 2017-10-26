package com.example.prashant.cbs;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class Society extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_society);
        TextView tv= (TextView) findViewById(R.id.textview1);
        Intent intent= getIntent();
        Bundle bd= intent.getExtras();
        if (bd!= null)
        {
            String getName= (String) bd.get("text");
            tv.setText(getName);

        }

        }
}
