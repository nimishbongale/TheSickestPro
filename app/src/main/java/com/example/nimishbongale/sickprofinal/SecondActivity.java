package com.example.nimishbongale.sickprofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button b2 = findViewById(R.id.button3);
        Button b3 = findViewById(R.id.button4);
        Button b4 = findViewById(R.id.button5);
        Button b5 = findViewById(R.id.button6);


        final Intent explicit2= new Intent(SecondActivity.this,EighthActivity.class);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(explicit2);
            }
        });
        final Intent explicit3= new Intent(SecondActivity.this,SeventhActivity.class);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(explicit3);
            }
        });
        final Intent explicit4= new Intent(SecondActivity.this,TenthActivity.class);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(explicit4);
            }
        });
        final Intent explicit5= new Intent(SecondActivity.this,ThirdActivity.class);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(explicit5);
            }
        });
    }
}
