package com.rtu.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button hi = (Button)findViewById(R.id.hi);
        Button en = (Button)findViewById(R.id.en);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "GoodUnicornRegular-Rxev.ttf");
        en.setTypeface(custom_font);

        Typeface custom_font_hi = Typeface.createFromAsset(getAssets(), "Devnew.ttf");
        hi.setTypeface(custom_font_hi);
        hi.setText("हिन्दी");

    }
    public void openHindiCourse(View v){

        Intent i = new Intent(MainActivity.this, DetailActivity.class);
        i.putExtra("Type","H");
        startActivity(i);
    }
    public void openEnglishCourse(View v){

        Intent i = new Intent(MainActivity.this, DetailActivity.class);
        i.putExtra("Type","E");
        startActivity(i);
    }
}