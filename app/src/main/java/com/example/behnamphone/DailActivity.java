package com.example.behnamphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Set;

public class DailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dail);
        final EditText phonenum = findViewById(R.id.phonenum);
        Button Dail = findViewById(R.id.dial1);
        Dail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" +phonenum.getText() .toString()));
                startActivity(i);
                Toast.makeText(DailActivity.this ,"call" ,Toast.LENGTH_LONG).show();

            }
        });

    }
}
