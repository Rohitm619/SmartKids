package com.rtu.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    String textarray[];
    String textdescvals[];
    int images[];

    String type;
    int count = 0;
    TextView msg, textdesc;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_detail);
        type = getIntent().getExtras().getString("Type");
        msg = (TextView)findViewById(R.id.text);
        textdesc = (TextView)findViewById(R.id.textdesc);
        img = (ImageView)findViewById(R.id.img);
        Typeface custom_font;
        if(type.equals("E")){
            custom_font = Typeface.createFromAsset(getAssets(), "GoodUnicornRegular-Rxev.ttf");
            textarray = new String[]{"Aa","Bb","Cc","Dd","Ee","Ff","Gg","Hh","Ii","Jj","Kk","Ll","Mm","Nn","Oo",
                    "Pp","Qq","Rr","Ss","Tt","Uu","Ww","Xx","Yy","Zz" };
            textdescvals = new String[]{"Apple","Banana","Cc","Dd","Ee","Ff","Gg","Hh","Ii","Jj","Kk","Ll","Mm","Nn","Oo",
                    "Pp","Qq","Rr","Ss","Tt","Uu","Ww","Xx","Yy","Zz" };
            images = new int[]{R.drawable.a,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,
                    R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,
                    R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,
                    R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,
                    R.drawable.b,R.drawable.b,R.drawable.b};
        }
        else {
            textarray = new String[]{ "अ","आ","इ","ई","उ","ऊ","ए","ऐ","ऒ","औ","ऋ","अं","अः","क","ख","ग","घ",
                    "ङ","च","छ","ज","झ","ञ","ट","ठ","ड","ढ","ण","त","थ","द","ध","न","प","फ","ब","भ","म","य",
                    "र","ल","व","श","ष","स","ह" };
            textdescvals = new String[]{ "अ","आ","इ","ई","उ","ऊ","ए","ऐ","ऒ","औ","ऋ","अं","अः","क","ख","ग","घ",
                    "ङ","च","छ","ज","झ","ञ","ट","ठ","ड","ढ","ण","त","थ","द","ध","न","प","फ","ब","भ","म","य",
                    "र","ल","व","श","ष","स","ह" };
            custom_font = Typeface.createFromAsset(getAssets(), "Devnew.ttf");
            images = new int[]{R.drawable.a,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,
                    R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,
                    R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,
                    R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,
                    R.drawable.b,R.drawable.b,R.drawable.b};
        }
        msg.setTypeface(custom_font);
        msg.setText(textarray[count]);
        textdesc.setTypeface(custom_font);
        textdesc.setText(textdescvals[count]);
        img.setImageResource(images[count]);
    }
    public void prevClick(View v){
        if(count>0) {
            count--;
            msg.setText(textarray[count]);
            textdesc.setText(textdescvals[count]);
            img.setImageResource(images[count]);
        }
    }
    public void nextClick(View v){
        if(count < textarray.length-1) {
            count++;
            msg.setText(textarray[count]);
            textdesc.setText(textdescvals[count]);
            img.setImageResource(images[count]);
        }
    }

}