package com.example.nimishbongale.sickprofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EighthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        Button b1=(Button)findViewById(R.id.butt1);
        Button b2=(Button)findViewById(R.id.butt2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(EighthActivity.this,FourthActivity.class);
                startActivity(int1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(EighthActivity.this,FifthActivity.class);
                startActivity(int1);
            }
        });
    }
}
