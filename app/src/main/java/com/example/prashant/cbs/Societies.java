package com.example.prashant.cbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Societies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_societies);

        final ImageView imageView;

        final ImageView i1 = (ImageView) findViewById(R.id.anthropos);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text1= "Anthropos";
                intent.putExtra("text", text1);
                startActivity(intent);

            }

            });

        final ImageView i2;
        i2 = (ImageView) findViewById(R.id.blitz);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i3 = (ImageView) findViewById(R.id.cbsmun);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i4 = (ImageView) findViewById(R.id.cdc);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i5 = (ImageView) findViewById(R.id.communique);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i6 = (ImageView) findViewById(R.id.darkroom);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);

            }
        });

        ImageView i7 = (ImageView) findViewById(R.id.dhwani);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i8 = (ImageView) findViewById(R.id.debating);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i9 = (ImageView) findViewById(R.id.ecovision);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);

            }
        });

        ImageView i10 = (ImageView) findViewById(R.id.enactus);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);

            }
        });

        ImageView i11 = (ImageView) findViewById(R.id.finx);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);

            }
        });

        ImageView i12 = (ImageView) findViewById(R.id.fourthwall);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i13 = (ImageView) findViewById(R.id.grandeur);
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i14 = (ImageView) findViewById(R.id.illuminati);
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i15 = (ImageView) findViewById(R.id.kartavya);
        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i16 = (ImageView) findViewById(R.id.kriti);
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i17 = (ImageView) findViewById(R.id.kronos);
        i17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);

            }
        });

        ImageView i18 = (ImageView) findViewById(R.id.lawrence);
        i18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i19 = (ImageView) findViewById(R.id.literary);
        i19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i20 = (ImageView) findViewById(R.id.markit);
        i20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i21 = (ImageView) findViewById(R.id.mic);
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i22 = (ImageView) findViewById(R.id.nucleus);
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i23 = (ImageView) findViewById(R.id.parishram);
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i24 = (ImageView) findViewById(R.id.synergy);
        i24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i25 = (ImageView) findViewById(R.id.verve);
        i25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        ImageView i26 = (ImageView) findViewById(R.id.yuva);
        i26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Societies.this, Society.class);
                String text= "BLITZ";
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });
    }
}
