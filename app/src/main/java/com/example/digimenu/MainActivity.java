package com.example.digimenu;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    new Handler().postDelayed(new Runnable(){
        @Override
                public void run(){
            Intent intent = new Intent(packageContext: MainActivity.this,MainMenu.class);
            startActivity(intent);
            finish();



    }.delayMillis: 3000  );

    }
}