package com.example.nimishbongale.sickprofinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Button btnfirst=(Button)findViewById(R.id.taxi);
        Button btnsecond=(Button)findViewById(R.id.maid);
        Button btnthird=(Button)findViewById(R.id.famdoc);
        Button btnfourth=(Button)findViewById(R.id.chem);
        Button btnfifth=(Button)findViewById(R.id.pa);
        Button btnwow=(Button)findViewById(R.id.mq);

        btnfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "uber://?action=setPickup&pickup=my_location";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivity(intent);
            }
        });

        btnsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:919611000411"));
                startActivity(phoneIntent);
            }
        });

        btnthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:918050781487"));
                startActivity(phoneIntent);
            }
        });

        btnfourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:919611000411"));
                startActivity(phoneIntent);
            }
        });

        btnfifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:919611000411"));
                startActivity(phoneIntent);
            }
        });

        btnwow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent implicit=new Intent (Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScBD02liioN4gFNGO_c53BXvjDn7aGcENYb3IKdLE5HpfdT9w/viewform?usp=sf_link"));
                startActivity(implicit);
            }
        });

    }
}
