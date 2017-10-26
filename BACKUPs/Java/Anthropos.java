package com.example.prashant.cbs;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.string.ok;

public class Anthropos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anthropos);
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
