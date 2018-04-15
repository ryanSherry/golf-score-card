package com.rsherry.golfscorecard;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    Button hole1Minus;
    Button hole1Plus;
    TextView hole1Label;
    int hole1Swings = 0;

    Button hole2Minus;
    Button hole2Plus;
    TextView hole2Label;
    int hole2Swings = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the Views from the layout to the corresponding variables

        hole1Minus = findViewById(R.id.hole1Minus);
        hole1Plus = findViewById(R.id.hole1Plus);
        hole1Label = findViewById(R.id.hole1Label);

        hole2Minus = findViewById(R.id.hole2Minus);
        hole2Plus = findViewById(R.id.hole2Plus);
        hole2Label = findViewById(R.id.hole2Label);

        //call the onClick method on buttons
        hole1Minus.setOnClickListener(this);
        hole1Plus.setOnClickListener(this);
        hole2Minus.setOnClickListener(this);
        hole2Plus.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

                    case R.id.hole1Minus:
                        if(hole1Swings != 0) hole1Swings--;
                        hole1Label.setText(String.valueOf(hole1Swings));
                        break;

                    case R.id.hole1Plus:
                        hole1Swings++;
                        hole1Label.setText(String.valueOf(hole1Swings));
                        break;

                    case R.id.hole2Minus:
                        if(hole2Swings != 0) hole2Swings--;
                        hole2Label.setText(String.valueOf(hole2Swings));
                        break;

                    case R.id.hole2Plus:
                        hole2Swings++;
                        hole2Label.setText(String.valueOf(hole2Swings));
                        break;

                    default:
                        break;


        }

    }
}
