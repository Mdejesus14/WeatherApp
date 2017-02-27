package com.example.android.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int now=45;
        int todayHi=56;
        int todayLo=40;
        int tmrwHi=70;
        int tmrwLo=40;
        int moreHi=45;
        int moreLo=42;

        TextView nowText = (TextView) findViewById(R.id.now_text_quantity);
        TextView todayHiText= (TextView) findViewById(R.id.today_high_text_quantity);
        TextView todayLoText= (TextView) findViewById(R.id.today_low_text_quantity);
        TextView tmrwHiText= (TextView) findViewById(R.id.tmrw_high_text_quantity);
        TextView tmrwLoText= (TextView) findViewById(R.id.tmrw_low_text_quantity);
        TextView moreHiText= (TextView) findViewById(R.id.more_high_text_quantity);
        TextView moreLoText= (TextView) findViewById(R.id.more_low_text_quantity);

        display(now, nowText);
        display(todayHi, todayHiText);
        display(todayLo, todayLoText);
        display(tmrwHi, tmrwHiText);
        display(tmrwLo, tmrwLoText);
        display(moreHi, moreHiText);
        display(moreLo, moreLoText);

    }

    private void display(int temp, TextView location)
    {
        location.setText(temp +"*");
    }
}
