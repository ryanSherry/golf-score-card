package com.rsherry.golfscorecard;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button hole1Minus;
    Button hole1Plus;
    TextView hole1Label;
    int hole1Swings = 0;

    Button hole2Minus;
    Button hole2Plus;
    TextView hole2Label;
    int hole2Swings = 0;

    Button hole3Minus;
    Button hole3Plus;
    TextView hole3Label;
    int hole3Swings = 0;

    Button hole4Minus;
    Button hole4Plus;
    TextView hole4Label;
    int hole4Swings = 0;

    Button hole5Minus;
    Button hole5Plus;
    TextView hole5Label;
    int hole5Swings = 0;

    Button hole6Minus;
    Button hole6Plus;
    TextView hole6Label;
    int hole6Swings = 0;

    Button hole7Minus;
    Button hole7Plus;
    TextView hole7Label;
    int hole7Swings = 0;

    Button hole8Minus;
    Button hole8Plus;
    TextView hole8Label;
    int hole8Swings = 0;

    Button hole9Minus;
    Button hole9Plus;
    TextView hole9Label;
    int hole9Swings = 0;

    Button hole10Minus;
    Button hole10Plus;
    TextView hole10Label;
    int hole10Swings = 0;

    Button hole11Minus;
    Button hole11Plus;
    TextView hole11Label;
    int hole11Swings = 0;

    Button hole12Minus;
    Button hole12Plus;
    TextView hole12Label;
    int hole12Swings = 0;

    Button hole13Minus;
    Button hole13Plus;
    TextView hole13Label;
    int hole13Swings = 0;

    Button hole14Minus;
    Button hole14Plus;
    TextView hole14Label;
    int hole14Swings = 0;

    Button hole15Minus;
    Button hole15Plus;
    TextView hole15Label;
    int hole15Swings = 0;

    Button hole16Minus;
    Button hole16Plus;
    TextView hole16Label;
    int hole16Swings = 0;

    Button hole17Minus;
    Button hole17Plus;
    TextView hole17Label;
    int hole17Swings = 0;

    Button hole18Minus;
    Button hole18Plus;
    TextView hole18Label;
    int hole18Swings = 0;

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

        hole3Minus = findViewById(R.id.hole3Minus);
        hole3Plus = findViewById(R.id.hole3Plus);
        hole3Label = findViewById(R.id.hole3Label);

        hole4Minus = findViewById(R.id.hole4Minus);
        hole4Plus = findViewById(R.id.hole4Plus);
        hole4Label = findViewById(R.id.hole4Label);

        hole5Minus = findViewById(R.id.hole5Minus);
        hole5Plus = findViewById(R.id.hole5Plus);
        hole5Label = findViewById(R.id.hole5Label);

        hole6Minus = findViewById(R.id.hole6Minus);
        hole6Plus = findViewById(R.id.hole6Plus);
        hole6Label = findViewById(R.id.hole6Label);

        hole7Minus = findViewById(R.id.hole7Minus);
        hole7Plus = findViewById(R.id.hole7Plus);
        hole7Label = findViewById(R.id.hole7Label);

        hole8Minus = findViewById(R.id.hole8Minus);
        hole8Plus = findViewById(R.id.hole8Plus);
        hole8Label = findViewById(R.id.hole8Label);

        hole9Minus = findViewById(R.id.hole9Minus);
        hole9Plus = findViewById(R.id.hole9Plus);
        hole9Label = findViewById(R.id.hole9Label);

        hole10Minus = findViewById(R.id.hole10Minus);
        hole10Plus = findViewById(R.id.hole10Plus);
        hole10Label = findViewById(R.id.hole10Label);

        hole11Minus = findViewById(R.id.hole11Minus);
        hole11Plus = findViewById(R.id.hole11Plus);
        hole11Label = findViewById(R.id.hole11Label);

        hole12Minus = findViewById(R.id.hole12Minus);
        hole12Plus = findViewById(R.id.hole12Plus);
        hole12Label = findViewById(R.id.hole12Label);

        hole13Minus = findViewById(R.id.hole13Minus);
        hole13Plus = findViewById(R.id.hole13Plus);
        hole13Label = findViewById(R.id.hole13Label);

        hole14Minus = findViewById(R.id.hole14Minus);
        hole14Plus = findViewById(R.id.hole14Plus);
        hole14Label = findViewById(R.id.hole14Label);

        hole15Minus = findViewById(R.id.hole15Minus);
        hole15Plus = findViewById(R.id.hole15Plus);
        hole15Label = findViewById(R.id.hole15Label);

        hole16Minus = findViewById(R.id.hole16Minus);
        hole16Plus = findViewById(R.id.hole16Plus);
        hole16Label = findViewById(R.id.hole16Label);

        hole17Minus = findViewById(R.id.hole17Minus);
        hole17Plus = findViewById(R.id.hole17Plus);
        hole17Label = findViewById(R.id.hole17Label);

        hole18Minus = findViewById(R.id.hole18Minus);
        hole18Plus = findViewById(R.id.hole18Plus);
        hole18Label = findViewById(R.id.hole18Label);


        //call the onClick method on buttons
        hole1Minus.setOnClickListener(this);
        hole1Plus.setOnClickListener(this);

        hole2Minus.setOnClickListener(this);
        hole2Plus.setOnClickListener(this);

        hole3Minus.setOnClickListener(this);
        hole3Plus.setOnClickListener(this);

        hole4Minus.setOnClickListener(this);
        hole4Plus.setOnClickListener(this);

        hole5Minus.setOnClickListener(this);
        hole5Plus.setOnClickListener(this);

        hole6Minus.setOnClickListener(this);
        hole6Plus.setOnClickListener(this);

        hole7Minus.setOnClickListener(this);
        hole7Plus.setOnClickListener(this);

        hole8Minus.setOnClickListener(this);
        hole8Plus.setOnClickListener(this);

        hole9Minus.setOnClickListener(this);
        hole9Plus.setOnClickListener(this);

        hole10Minus.setOnClickListener(this);
        hole10Plus.setOnClickListener(this);

        hole11Minus.setOnClickListener(this);
        hole11Plus.setOnClickListener(this);

        hole12Minus.setOnClickListener(this);
        hole12Plus.setOnClickListener(this);

        hole13Minus.setOnClickListener(this);
        hole13Plus.setOnClickListener(this);

        hole14Minus.setOnClickListener(this);
        hole14Plus.setOnClickListener(this);

        hole15Minus.setOnClickListener(this);
        hole15Plus.setOnClickListener(this);

        hole16Minus.setOnClickListener(this);
        hole16Plus.setOnClickListener(this);

        hole17Minus.setOnClickListener(this);
        hole17Plus.setOnClickListener(this);

        hole18Minus.setOnClickListener(this);
        hole18Plus.setOnClickListener(this);

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

                    case R.id.hole3Minus:
                        if(hole3Swings != 0) hole3Swings--;
                        hole3Label.setText(String.valueOf(hole3Swings));
                        break;

                    case R.id.hole3Plus:
                        hole3Swings++;
                        hole3Label.setText(String.valueOf(hole3Swings));
                        break;

                    case R.id.hole4Minus:
                        if(hole4Swings != 0) hole4Swings--;
                        hole4Label.setText(String.valueOf(hole4Swings));
                        break;

                    case R.id.hole4Plus:
                        hole4Swings++;
                        hole4Label.setText(String.valueOf(hole4Swings));
                        break;

                    case R.id.hole5Minus:
                        if(hole5Swings != 0) hole5Swings--;
                        hole5Label.setText(String.valueOf(hole5Swings));
                        break;

                    case R.id.hole5Plus:
                        hole5Swings++;
                        hole5Label.setText(String.valueOf(hole5Swings));
                        break;

                    case R.id.hole6Minus:
                        if(hole6Swings != 0) hole6Swings--;
                        hole6Label.setText(String.valueOf(hole6Swings));
                        break;

                    case R.id.hole6Plus:
                        hole6Swings++;
                        hole6Label.setText(String.valueOf(hole6Swings));
                        break;

                    case R.id.hole7Minus:
                        if(hole7Swings != 0) hole7Swings--;
                        hole7Label.setText(String.valueOf(hole7Swings));
                        break;

                    case R.id.hole7Plus:
                        hole7Swings++;
                        hole7Label.setText(String.valueOf(hole7Swings));
                        break;

                    case R.id.hole8Minus:
                        if(hole8Swings != 0) hole8Swings--;
                        hole8Label.setText(String.valueOf(hole8Swings));
                        break;

                    case R.id.hole8Plus:
                        hole8Swings++;
                        hole8Label.setText(String.valueOf(hole8Swings));
                        break;

                    case R.id.hole9Minus:
                        if(hole9Swings != 0) hole9Swings--;
                        hole9Label.setText(String.valueOf(hole9Swings));
                        break;

                    case R.id.hole9Plus:
                        hole9Swings++;
                        hole9Label.setText(String.valueOf(hole9Swings));
                        break;

                    case R.id.hole10Minus:
                        if(hole10Swings != 0) hole10Swings--;
                        hole10Label.setText(String.valueOf(hole10Swings));
                        break;

                    case R.id.hole10Plus:
                        hole10Swings++;
                        hole10Label.setText(String.valueOf(hole10Swings));
                        break;

                    case R.id.hole11Minus:
                        if(hole11Swings != 0) hole11Swings--;
                        hole11Label.setText(String.valueOf(hole11Swings));
                        break;

                    case R.id.hole11Plus:
                        hole11Swings++;
                        hole11Label.setText(String.valueOf(hole11Swings));
                        break;

                    case R.id.hole12Minus:
                        if(hole12Swings != 0) hole12Swings--;
                        hole12Label.setText(String.valueOf(hole12Swings));
                        break;

                    case R.id.hole12Plus:
                        hole12Swings++;
                        hole12Label.setText(String.valueOf(hole12Swings));
                        break;

                    case R.id.hole13Minus:
                        if(hole13Swings != 0) hole13Swings--;
                        hole13Label.setText(String.valueOf(hole13Swings));
                        break;

                    case R.id.hole13Plus:
                        hole13Swings++;
                        hole13Label.setText(String.valueOf(hole13Swings));
                        break;

                    case R.id.hole14Minus:
                        if(hole14Swings != 0) hole14Swings--;
                        hole14Label.setText(String.valueOf(hole14Swings));
                        break;

                    case R.id.hole14Plus:
                        hole14Swings++;
                        hole14Label.setText(String.valueOf(hole14Swings));
                        break;

                    case R.id.hole15Minus:
                        if(hole15Swings != 0) hole15Swings--;
                        hole15Label.setText(String.valueOf(hole15Swings));
                        break;

                    case R.id.hole15Plus:
                        hole15Swings++;
                        hole15Label.setText(String.valueOf(hole15Swings));
                        break;

                    case R.id.hole16Minus:
                        if(hole16Swings != 0) hole16Swings--;
                        hole16Label.setText(String.valueOf(hole16Swings));
                        break;

                    case R.id.hole16Plus:
                        hole16Swings++;
                        hole16Label.setText(String.valueOf(hole16Swings));
                        break;

                    case R.id.hole17Minus:
                        if(hole17Swings != 0) hole17Swings--;
                        hole17Label.setText(String.valueOf(hole17Swings));
                        break;

                    case R.id.hole17Plus:
                        hole17Swings++;
                        hole17Label.setText(String.valueOf(hole17Swings));
                        break;

                    case R.id.hole18Minus:
                        if(hole18Swings != 0) hole18Swings--;
                        hole18Label.setText(String.valueOf(hole18Swings));
                        break;

                    case R.id.hole18Plus:
                        hole18Swings++;
                        hole18Label.setText(String.valueOf(hole18Swings));
                        break;


                    default:
                        break;


        }

    }
}
