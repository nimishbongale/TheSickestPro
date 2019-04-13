package com.example.nimishbongale.sickprofinal;

import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        Button b1 = findViewById(R.id.reminder);
        Button b2 = findViewById(R.id.alarm);
        Button b3 = findViewById(R.id.notes);
        final Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://calendar.google.com/calendar/r"));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(implicit);
            }
        });
        //final Intent implicit1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kukuklok.com/"));
        final Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
        final Intent implicit2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://keep.google.com/"));
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(implicit2);
            }
        });
    }
}
