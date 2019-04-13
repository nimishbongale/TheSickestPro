package com.example.nimishbongale.sickprofinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NinthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        Button button=(Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int CAMERA_PIC_REQUEST = 1;
                Intent photo= new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(photo, CAMERA_PIC_REQUEST);
            }
        });
        Button btnl=(Button)findViewById(R.id.btnloc);
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uriText =
                        "mailto:nimishnb98@gmail.com" +
                                "?subject=" + Uri.encode("Prescription") +
                                "&body=" + Uri.encode("1. Dolo 650 1-1-1-1\n 2.Allercet 0-0-1(3)\n3.Azilide 0-0-1(5)\n Address:-\n Gokula, M S Ramaiah Nagar, Mathikere, Bengaluru, Karnataka 560054");

                Uri uri = Uri.parse(uriText);
                Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
                sendIntent.setData(uri);
                startActivity(Intent.createChooser(sendIntent, "Send email"));
            }
        });
        Button btne=(Button)findViewById(R.id.button7);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://m.p-y.tm";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
