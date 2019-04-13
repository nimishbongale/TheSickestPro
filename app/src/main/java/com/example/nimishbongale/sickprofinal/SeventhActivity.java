package com.example.nimishbongale.sickprofinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        Button onl=findViewById(R.id.Onli);
        Button offl=findViewById(R.id.Offl);
        final Intent implicit=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.netmeds.com"));

        onl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(implicit);
            }
        });
        offl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent explicit=new Intent(SeventhActivity.this,NinthActivity.class);
                startActivity(explicit);
            }
        });
    }
}