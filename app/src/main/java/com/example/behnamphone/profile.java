package com.example.behnamphone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final EditText namep = findViewById(R.id.intername2);
        final EditText familyp = findViewById(R.id.interfamily2);
        final EditText agep = findViewById(R.id.interage2);
        final EditText emailp = findViewById(R.id.interemail2);
        Button ok = findViewById(R.id.ok);
        Button edit = findViewById(R.id.edit);
        Intent i = getIntent();
        String na = i.getStringExtra("name");
        String fa = i.getStringExtra("family");
        String ag = i.getStringExtra("age");
        String em = i.getStringExtra("email");
        namep.setText(na);
        familyp.setText(fa);
        agep.setText(ag);
        emailp.setText(em);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i = new Intent(profile.this , Edit.class);
                 startActivity(i);
            }


        }
        );
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("name",namep.getText());
                i.putExtra("family", familyp.getText());
                i.putExtra("age", agep.getText());
                i.putExtra("email", emailp.getText());
                setResult(Activity.RESULT_OK ,i);
                finish();

                            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("name",namep.getText());
                i.putExtra("family", familyp.getText());
                i.putExtra("age", agep.getText());
                i.putExtra("email", emailp.getText());
                PreferenceManager.getDefaultSharedPreferences(profile.this).edit().putString("name",namep.getText().toString()).apply();
                PreferenceManager.getDefaultSharedPreferences(profile.this).edit().putString("family",familyp.getText().toString()).apply();
                PreferenceManager.getDefaultSharedPreferences(profile.this).edit().putString("age",agep.getText().toString()).apply();
                PreferenceManager.getDefaultSharedPreferences(profile.this).edit().putString("email",emailp.getText().toString()).apply();
                setResult(7,i);
                finish();





            }
        });
    }
}
