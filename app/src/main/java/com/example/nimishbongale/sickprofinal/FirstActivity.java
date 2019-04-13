package com.example.nimishbongale.sickprofinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button b7=findViewById(R.id.button7);
        Button b1=findViewById(R.id.bu1);
        Button rev=findViewById(R.id.button10);

        SharedPreferences wmbPreference = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstRun = wmbPreference.getBoolean("FIRSTRUN", true);
        if (isFirstRun){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSe24tI8qLIs8W7uGuOdSCIwD2emiIEdHRIS0Z4LHvflGCoUcA/viewform?usp=sf_link"));
            startActivity(browserIntent);
            SharedPreferences.Editor editor = wmbPreference.edit();
            editor.putBoolean("FIRSTRUN", false);
            editor.commit();
        }
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicit=new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(explicit);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:108"));
                startActivity(intent);
            }
        });
        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eId1 = "teamsickpro@gmail.com";
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{eId1});
                email.putExtra(Intent.EXTRA_SUBJECT, "Feedback:");
                email.putExtra(Intent.EXTRA_TEXT, "Fill in the details:\n\nWhat do you like the most about our App? \n\n___\n\n Rate our App: \n\n___\n\nSuggestions/Queries: \n\n___");
                email.setType("message/rfc822");
                startActivity(email);
            }
        });
    }
}
