package com.example.behnamphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Edit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        final EditText name = findViewById(R.id.intername);
        final EditText family = findViewById(R.id.interfamily);
        final EditText age = findViewById(R.id.interage);
        final EditText email = findViewById(R.id.interemail);
        Button review = findViewById(R.id.review);
        String _name = PreferenceManager.getDefaultSharedPreferences(Edit.this).getString("name","");
        String _family = PreferenceManager.getDefaultSharedPreferences(Edit.this).getString("family","");
        String _age = PreferenceManager.getDefaultSharedPreferences(Edit.this).getString("age","");
        String _email = PreferenceManager.getDefaultSharedPreferences(Edit.this).getString("email","");
name.setText(_name);
family.setText(_family);
age.setText(_age);
email.setText(_email);

        review.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {

                  String Name = name.getText().toString();
                  String Family = family.getText().toString();
                  String Age = age.getText().toString();
                  String Email = email.getText().toString();
                Intent r = new Intent(Edit.this ,profile.class);
                r.putExtra("name", Name);
                r.putExtra("family" , Family);
                 r.putExtra("age" , Age);
                 r.putExtra("email" , Email);
                startActivity(r);

            }
        });
    }
}
