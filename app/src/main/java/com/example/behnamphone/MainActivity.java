package com.example.behnamphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
        final Button profile =findViewById(R.id.pro);
        final Button dai = findViewById(R.id.dial);
        Button menu = findViewById(R.id.btnmainmenu);

     menu.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
             drawerLayout.openDrawer(Gravity.LEFT);

         }
     });
     dai.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent y = new Intent(MainActivity.this , DailActivity.class );
             startActivity(y);

         }
     });
     profile.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent x = new Intent(MainActivity.this , Edit.class);
             startActivity(x);

         }


     });






    }

}
