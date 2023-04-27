package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int team1score = 0;
    public int team2score = 0;


    public void team1Scoreplus3 (View view){
        TextView textView = (TextView) findViewById(R.id.team1score);
        team1score = team1score + 3 ;
        textView.setText("" + team1score);
    }

    public void team1ScorePlus2 (View view){
        TextView textView = (TextView) findViewById(R.id.team1score);
        team1score = team1score + 2 ;
        textView.setText("" + team1score);
    }

    public void  team1ScoreFreeThrow(View view) {
        TextView textView = (TextView) findViewById(R.id.team1score);
        team1score = team1score + 1 ;
        textView.setText("" + team1score);
    }


    public void team2Scoreplus3 (View view){
        TextView textView = (TextView) findViewById(R.id.team2score);
        team2score = team2score + 3 ;
        textView.setText("" + team2score);
    }

    public void team2ScorePlus2 (View view){
        TextView textView = (TextView) findViewById(R.id.team2score);
        team2score = team2score + 2 ;
        textView.setText("" + team2score);
    }

    public void  team2ScoreFreeThrow(View view) {
        TextView textView = (TextView) findViewById(R.id.team2score);
        team2score = team2score + 1 ;
        textView.setText("" + team2score);
    }

    public void reset (View view){
        TextView textView = (TextView) findViewById(R.id.team1score);
        team1score = 0;
        textView.setText("" + team1score);
        TextView textView1 = (TextView) findViewById(R.id.team2score);
        team2score = 0;
        textView1.setText("" + team2score);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}