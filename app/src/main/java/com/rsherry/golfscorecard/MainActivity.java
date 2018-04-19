package com.rsherry.golfscorecard;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView sumOfSwingsLabel;
    int sumOfSwings = 0;

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


    // Creating array to hold all keys for shared preferences
    String KEY_HOLES[] = new String[18];

    // Creating Hole Object array
    private Hole[] mHoles = new Hole[18];

    //shared preferences

    private static  final String KEY_HOLE_1 =  "KEY_HOLE_1";
    private static  final String KEY_HOLE_2 =  "KEY_HOLE_2";
    private static  final String KEY_HOLE_3 =  "KEY_HOLE_3";
    private static  final String KEY_HOLE_4 =  "KEY_HOLE_4";
    private static  final String KEY_HOLE_5 =  "KEY_HOLE_5";
    private static  final String KEY_HOLE_6 =  "KEY_HOLE_6";
    private static  final String KEY_HOLE_7 =  "KEY_HOLE_7";
    private static  final String KEY_HOLE_8 =  "KEY_HOLE_8";
    private static  final String KEY_HOLE_9 =  "KEY_HOLE_9";
    private static  final String KEY_HOLE_10 =  "KEY_HOLE_10";
    private static  final String KEY_HOLE_11 =  "KEY_HOLE_11";
    private static  final String KEY_HOLE_12 =  "KEY_HOLE_12";
    private static  final String KEY_HOLE_13 =  "KEY_HOLE_13";
    private static  final String KEY_HOLE_14 =  "KEY_HOLE_14";
    private static  final String KEY_HOLE_15 =  "KEY_HOLE_15";
    private static  final String KEY_HOLE_16 =  "KEY_HOLE_16";
    private static  final String KEY_HOLE_17 =  "KEY_HOLE_17";
    private static  final String KEY_HOLE_18 =  "KEY_HOLE_18";
    private static final String KEY_SWING_TOTAL = "KEY_SWING_TOTAL";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(KEY_HOLE_1,hole1Swings);
        outState.putInt(KEY_HOLE_2,hole2Swings);
        outState.putInt(KEY_HOLE_3,hole3Swings);
        outState.putInt(KEY_HOLE_4,hole4Swings);
        outState.putInt(KEY_HOLE_5,hole5Swings);
        outState.putInt(KEY_HOLE_6,hole6Swings);
        outState.putInt(KEY_HOLE_7,hole7Swings);
        outState.putInt(KEY_HOLE_8,hole8Swings);
        outState.putInt(KEY_HOLE_9,hole9Swings);
        outState.putInt(KEY_HOLE_10,hole10Swings);
        outState.putInt(KEY_HOLE_11,hole11Swings);
        outState.putInt(KEY_HOLE_12,hole12Swings);
        outState.putInt(KEY_HOLE_13,hole13Swings);
        outState.putInt(KEY_HOLE_14,hole14Swings);
        outState.putInt(KEY_HOLE_15,hole15Swings);
        outState.putInt(KEY_HOLE_16,hole16Swings);
        outState.putInt(KEY_HOLE_17,hole17Swings);
        outState.putInt(KEY_HOLE_18,hole18Swings);
        outState.putInt(KEY_SWING_TOTAL,sumOfSwings);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        for(int i = 0; i < KEY_HOLES.length; i++) {

        }

        hole1Swings = savedInstanceState.getInt(KEY_HOLE_1);
        hole2Swings = savedInstanceState.getInt(KEY_HOLE_2);
        hole3Swings = savedInstanceState.getInt(KEY_HOLE_3);
        hole4Swings = savedInstanceState.getInt(KEY_HOLE_4);
        hole5Swings = savedInstanceState.getInt(KEY_HOLE_5);
        hole6Swings = savedInstanceState.getInt(KEY_HOLE_6);
        hole7Swings = savedInstanceState.getInt(KEY_HOLE_7);
        hole8Swings = savedInstanceState.getInt(KEY_HOLE_8);
        hole9Swings = savedInstanceState.getInt(KEY_HOLE_9);
        hole10Swings = savedInstanceState.getInt(KEY_HOLE_10);
        hole11Swings = savedInstanceState.getInt(KEY_HOLE_11);
        hole12Swings = savedInstanceState.getInt(KEY_HOLE_12);
        hole13Swings = savedInstanceState.getInt(KEY_HOLE_13);
        hole14Swings = savedInstanceState.getInt(KEY_HOLE_14);
        hole15Swings = savedInstanceState.getInt(KEY_HOLE_15);
        hole16Swings = savedInstanceState.getInt(KEY_HOLE_16);
        hole17Swings = savedInstanceState.getInt(KEY_HOLE_17);
        hole18Swings = savedInstanceState.getInt(KEY_HOLE_18);
        sumOfSwings = savedInstanceState.getInt(KEY_SWING_TOTAL);


        hole1Label.setText(String.valueOf(hole1Swings));
        hole2Label.setText(String.valueOf(hole2Swings));
        hole3Label.setText(String.valueOf(hole3Swings));
        hole4Label.setText(String.valueOf(hole4Swings));
        hole5Label.setText(String.valueOf(hole5Swings));
        hole6Label.setText(String.valueOf(hole6Swings));
        hole7Label.setText(String.valueOf(hole7Swings));
        hole8Label.setText(String.valueOf(hole8Swings));
        hole9Label.setText(String.valueOf(hole9Swings));
        hole10Label.setText(String.valueOf(hole10Swings));
        hole11Label.setText(String.valueOf(hole11Swings));
        hole12Label.setText(String.valueOf(hole12Swings));
        hole13Label.setText(String.valueOf(hole13Swings));
        hole14Label.setText(String.valueOf(hole14Swings));
        hole15Label.setText(String.valueOf(hole15Swings));
        hole16Label.setText(String.valueOf(hole16Swings));
        hole17Label.setText(String.valueOf(hole17Swings));
        hole18Label.setText(String.valueOf(hole18Swings));
        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.golf_card_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.clear_swings:
                clearSwings();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }

    private void clearSwings() {
        hole1Swings = 0;
        hole2Swings = 0;
        hole3Swings = 0;
        hole4Swings = 0;
        hole5Swings = 0;
        hole6Swings = 0;
        hole7Swings = 0;
        hole8Swings = 0;
        hole9Swings = 0;
        hole10Swings = 0;
        hole11Swings = 0;
        hole12Swings = 0;
        hole13Swings = 0;
        hole14Swings = 0;
        hole15Swings = 0;
        hole16Swings = 0;
        hole17Swings = 0;
        hole18Swings = 0;
        sumOfSwings = 0;

        hole1Label.setText(String.valueOf(hole1Swings));
        hole2Label.setText(String.valueOf(hole2Swings));
        hole3Label.setText(String.valueOf(hole3Swings));
        hole4Label.setText(String.valueOf(hole4Swings));
        hole5Label.setText(String.valueOf(hole5Swings));
        hole6Label.setText(String.valueOf(hole6Swings));
        hole7Label.setText(String.valueOf(hole7Swings));
        hole8Label.setText(String.valueOf(hole8Swings));
        hole9Label.setText(String.valueOf(hole9Swings));
        hole10Label.setText(String.valueOf(hole10Swings));
        hole11Label.setText(String.valueOf(hole11Swings));
        hole12Label.setText(String.valueOf(hole12Swings));
        hole13Label.setText(String.valueOf(hole13Swings));
        hole14Label.setText(String.valueOf(hole14Swings));
        hole15Label.setText(String.valueOf(hole15Swings));
        hole16Label.setText(String.valueOf(hole16Swings));
        hole17Label.setText(String.valueOf(hole17Swings));
        hole18Label.setText(String.valueOf(hole18Swings));
        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create the keys that will be used in sharedPreferences

        for (int i = 0; i < KEY_HOLES.length; i++) {
            KEY_HOLES[i] = "KEY_HOLE_" + (i+1);
        }

        //Initialize the hole objects

        for (int i = 0; i < mHoles.length; i++) {
            mHoles[i] = new Hole("Hole " + (i+1),0);
        }

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

        sumOfSwingsLabel = findViewById(R.id.sumOfSwingsLabel);


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
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole1Plus:
                        hole1Swings++;
                        hole1Label.setText(String.valueOf(hole1Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole2Minus:
                        if(hole2Swings != 0) hole2Swings--;
                        hole2Label.setText(String.valueOf(hole2Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole2Plus:
                        hole2Swings++;
                        hole2Label.setText(String.valueOf(hole2Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole3Minus:
                        if(hole3Swings != 0) hole3Swings--;
                        hole3Label.setText(String.valueOf(hole3Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole3Plus:
                        hole3Swings++;
                        hole3Label.setText(String.valueOf(hole3Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole4Minus:
                        if(hole4Swings != 0) hole4Swings--;
                        hole4Label.setText(String.valueOf(hole4Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole4Plus:
                        hole4Swings++;
                        hole4Label.setText(String.valueOf(hole4Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole5Minus:
                        if(hole5Swings != 0) hole5Swings--;
                        hole5Label.setText(String.valueOf(hole5Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole5Plus:
                        hole5Swings++;
                        hole5Label.setText(String.valueOf(hole5Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole6Minus:
                        if(hole6Swings != 0) hole6Swings--;
                        hole6Label.setText(String.valueOf(hole6Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole6Plus:
                        hole6Swings++;
                        hole6Label.setText(String.valueOf(hole6Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole7Minus:
                        if(hole7Swings != 0) hole7Swings--;
                        hole7Label.setText(String.valueOf(hole7Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole7Plus:
                        hole7Swings++;
                        hole7Label.setText(String.valueOf(hole7Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole8Minus:
                        if(hole8Swings != 0) hole8Swings--;
                        hole8Label.setText(String.valueOf(hole8Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole8Plus:
                        hole8Swings++;
                        hole8Label.setText(String.valueOf(hole8Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole9Minus:
                        if(hole9Swings != 0) hole9Swings--;
                        hole9Label.setText(String.valueOf(hole9Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole9Plus:
                        hole9Swings++;
                        hole9Label.setText(String.valueOf(hole9Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole10Minus:
                        if(hole10Swings != 0) hole10Swings--;
                        hole10Label.setText(String.valueOf(hole10Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole10Plus:
                        hole10Swings++;
                        hole10Label.setText(String.valueOf(hole10Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole11Minus:
                        if(hole11Swings != 0) hole11Swings--;
                        hole11Label.setText(String.valueOf(hole11Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole11Plus:
                        hole11Swings++;
                        hole11Label.setText(String.valueOf(hole11Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole12Minus:
                        if(hole12Swings != 0) hole12Swings--;
                        hole12Label.setText(String.valueOf(hole12Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole12Plus:
                        hole12Swings++;
                        hole12Label.setText(String.valueOf(hole12Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole13Minus:
                        if(hole13Swings != 0) hole13Swings--;
                        hole13Label.setText(String.valueOf(hole13Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole13Plus:
                        hole13Swings++;
                        hole13Label.setText(String.valueOf(hole13Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole14Minus:
                        if(hole14Swings != 0) hole14Swings--;
                        hole14Label.setText(String.valueOf(hole14Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole14Plus:
                        hole14Swings++;
                        hole14Label.setText(String.valueOf(hole14Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole15Minus:
                        if(hole15Swings != 0) hole15Swings--;
                        hole15Label.setText(String.valueOf(hole15Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole15Plus:
                        hole15Swings++;
                        hole15Label.setText(String.valueOf(hole15Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole16Minus:
                        if(hole16Swings != 0) hole16Swings--;
                        hole16Label.setText(String.valueOf(hole16Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole16Plus:
                        hole16Swings++;
                        hole16Label.setText(String.valueOf(hole16Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole17Minus:
                        if(hole17Swings != 0) hole17Swings--;
                        hole17Label.setText(String.valueOf(hole17Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole17Plus:
                        hole17Swings++;
                        hole17Label.setText(String.valueOf(hole17Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole18Minus:
                        if(hole18Swings != 0) hole18Swings--;
                        hole18Label.setText(String.valueOf(hole18Swings));
                        if (sumOfSwings != 0) sumOfSwings--;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;

                    case R.id.hole18Plus:
                        hole18Swings++;
                        hole18Label.setText(String.valueOf(hole18Swings));
                        sumOfSwings++;
                        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
                        break;


                    default:
                        break;


        }

    }
}
