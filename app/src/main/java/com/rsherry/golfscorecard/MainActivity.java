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

    // Creating Hole Object array
    private Hole[] mHoles = new Hole[18];

    // Creating Plus Button Array

    private Button[] mPlusButton = new Button[18];

    // Creating Minus Button Array

    private Button[] mMinusButton = new Button[18];

    // Creating TextView swingLabel Array

    private TextView[] mSwingLabel = new TextView[18];

    //shared preferences

    // Creating array to hold all keys for shared preferences
    final static String KEY_HOLES[] = new String[18];

    private static final String KEY_SWING_TOTAL = "KEY_SWING_TOTAL";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for (int i = 0; i < KEY_HOLES.length; i++) {
            outState.putInt(KEY_HOLES[i], mHoles[i].getmHoleSwings());
        }
        outState.putInt(KEY_SWING_TOTAL, sumOfSwings);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        for(int i = 0; i < KEY_HOLES.length; i++) {
            mHoles[i].setmHoleSwings(savedInstanceState.getInt(KEY_HOLES[i]));
            mSwingLabel[i].setText(String.valueOf(mHoles[i].getmHoleSwings()));
        }

        sumOfSwings = savedInstanceState.getInt(KEY_SWING_TOTAL);
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
        for(int i = 0; i < mHoles.length; i++) {
            mHoles[i].setmHoleSwings(0);
            mSwingLabel[i].setText(String.valueOf(0));

        }
        sumOfSwings = 0;
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

        //Add MinusButton reverences to array

        mMinusButton[0] = findViewById(R.id.hole1Minus);
        mMinusButton[1] = findViewById(R.id.hole2Minus);
        mMinusButton[2] = findViewById(R.id.hole3Minus);
        mMinusButton[3] = findViewById(R.id.hole4Minus);
        mMinusButton[4] = findViewById(R.id.hole5Minus);
        mMinusButton[5] = findViewById(R.id.hole6Minus);
        mMinusButton[6] = findViewById(R.id.hole7Minus);
        mMinusButton[7] = findViewById(R.id.hole8Minus);
        mMinusButton[8] = findViewById(R.id.hole9Minus);
        mMinusButton[9] = findViewById(R.id.hole10Minus);
        mMinusButton[10] = findViewById(R.id.hole11Minus);
        mMinusButton[11] = findViewById(R.id.hole12Minus);
        mMinusButton[12] = findViewById(R.id.hole13Minus);
        mMinusButton[13] = findViewById(R.id.hole14Minus);
        mMinusButton[14] = findViewById(R.id.hole15Minus);
        mMinusButton[15] = findViewById(R.id.hole16Minus);
        mMinusButton[16] = findViewById(R.id.hole17Minus);
        mMinusButton[17] = findViewById(R.id.hole18Minus);

        //Add PlusButton references to array

        mPlusButton[0] = findViewById(R.id.hole1Plus);
        mPlusButton[1] = findViewById(R.id.hole2Plus);
        mPlusButton[2] = findViewById(R.id.hole3Plus);
        mPlusButton[3] = findViewById(R.id.hole4Plus);
        mPlusButton[4] = findViewById(R.id.hole5Plus);
        mPlusButton[5] = findViewById(R.id.hole6Plus);
        mPlusButton[6] = findViewById(R.id.hole7Plus);
        mPlusButton[7] = findViewById(R.id.hole8Plus);
        mPlusButton[8] = findViewById(R.id.hole9Plus);
        mPlusButton[9] = findViewById(R.id.hole10Plus);
        mPlusButton[10] = findViewById(R.id.hole11Plus);
        mPlusButton[11] = findViewById(R.id.hole12Plus);
        mPlusButton[12] = findViewById(R.id.hole13Plus);
        mPlusButton[13] = findViewById(R.id.hole14Plus);
        mPlusButton[14] = findViewById(R.id.hole15Plus);
        mPlusButton[15] = findViewById(R.id.hole16Plus);
        mPlusButton[16] = findViewById(R.id.hole17Plus);
        mPlusButton[17] = findViewById(R.id.hole18Plus);



        //Add TextView label references to array

        mSwingLabel[0] = findViewById(R.id.hole1Label);
        mSwingLabel[1] = findViewById(R.id.hole2Label);
        mSwingLabel[2] = findViewById(R.id.hole3Label);
        mSwingLabel[3] = findViewById(R.id.hole4Label);
        mSwingLabel[4] = findViewById(R.id.hole5Label);
        mSwingLabel[5] = findViewById(R.id.hole6Label);
        mSwingLabel[6] = findViewById(R.id.hole7Label);
        mSwingLabel[7] = findViewById(R.id.hole8Label);
        mSwingLabel[8] = findViewById(R.id.hole9Label);
        mSwingLabel[9] = findViewById(R.id.hole10Label);
        mSwingLabel[10] = findViewById(R.id.hole11Label);
        mSwingLabel[11] = findViewById(R.id.hole12Label);
        mSwingLabel[12] = findViewById(R.id.hole13Label);
        mSwingLabel[13] = findViewById(R.id.hole14Label);
        mSwingLabel[14] = findViewById(R.id.hole15Label);
        mSwingLabel[15] = findViewById(R.id.hole16Label);
        mSwingLabel[16] = findViewById(R.id.hole17Label);
        mSwingLabel[17] = findViewById(R.id.hole18Label);


        //Initialize the hole objects

        for (int i = 0; i < mHoles.length; i++) {
            mHoles[i] = new Hole("Hole " + (i+1),0);
        }

        sumOfSwingsLabel = findViewById(R.id.sumOfSwingsLabel);


        //call the onClick method on buttons

        for(int i = 0; i < mMinusButton.length; i++){
            mMinusButton[i].setOnClickListener(this);
            mPlusButton[i].setOnClickListener(this);
        }

    }

    // function that handles subtracting a swing from a hole

    private void subtractSwingFromHole(int indexOfHoleObject) {
        if (mHoles[indexOfHoleObject].getmHoleSwings() != 0) {
            sumOfSwings--;
            sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
        }
        mHoles[indexOfHoleObject].decreaseSwings(mHoles[indexOfHoleObject].getmHoleSwings());
        mSwingLabel[indexOfHoleObject].setText(String.valueOf(mHoles[indexOfHoleObject].getmHoleSwings()));
    }

    private void addSwingToHole(int indexOfHoleObject) {
        mHoles[indexOfHoleObject].increaseSwings(mHoles[indexOfHoleObject].getmHoleSwings());
        mSwingLabel[indexOfHoleObject].setText(String.valueOf(mHoles[indexOfHoleObject].getmHoleSwings()));
        sumOfSwings++;
        sumOfSwingsLabel.setText(String.valueOf(sumOfSwings));
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

                    case R.id.hole1Minus:
                        subtractSwingFromHole(0);
                        break;

                    case R.id.hole1Plus:
                        addSwingToHole(0);
                        break;

                    case R.id.hole2Minus:
                        subtractSwingFromHole(1);
                        break;

                    case R.id.hole2Plus:
                        addSwingToHole(1);
                        break;

                    case R.id.hole3Minus:
                        subtractSwingFromHole(2);
                        break;

                    case R.id.hole3Plus:
                        addSwingToHole(2);
                        break;

                    case R.id.hole4Minus:
                        subtractSwingFromHole(3);
                        break;

                    case R.id.hole4Plus:
                        addSwingToHole(3);
                        break;

                    case R.id.hole5Minus:
                        subtractSwingFromHole(4);
                        break;

                    case R.id.hole5Plus:
                        addSwingToHole(4);
                        break;

                    case R.id.hole6Minus:
                        subtractSwingFromHole(5);
                        break;

                    case R.id.hole6Plus:
                        addSwingToHole(5);
                        break;

                    case R.id.hole7Minus:
                        subtractSwingFromHole(6);
                        break;

                    case R.id.hole7Plus:
                        addSwingToHole(6);
                        break;

                    case R.id.hole8Minus:
                        subtractSwingFromHole(7);
                        break;

                    case R.id.hole8Plus:
                        addSwingToHole(7);
                        break;

                    case R.id.hole9Minus:
                        subtractSwingFromHole(8);
                        break;

                    case R.id.hole9Plus:
                        addSwingToHole(8);
                        break;

                    case R.id.hole10Minus:
                        subtractSwingFromHole(9);
                        break;

                    case R.id.hole10Plus:
                        addSwingToHole(9);
                        break;

                    case R.id.hole11Minus:
                        subtractSwingFromHole(10);
                        break;

                    case R.id.hole11Plus:
                        addSwingToHole(10);
                        break;

                    case R.id.hole12Minus:
                        subtractSwingFromHole(11);
                        break;

                    case R.id.hole12Plus:
                        addSwingToHole(11);
                        break;

                    case R.id.hole13Minus:
                        subtractSwingFromHole(12);
                        break;

                    case R.id.hole13Plus:
                        addSwingToHole(12);
                        break;

                    case R.id.hole14Minus:
                        subtractSwingFromHole(13);
                        break;

                    case R.id.hole14Plus:
                        addSwingToHole(13);
                        break;

                    case R.id.hole15Minus:
                        subtractSwingFromHole(14);
                        break;

                    case R.id.hole15Plus:
                        addSwingToHole(14);
                        break;

                    case R.id.hole16Minus:
                        subtractSwingFromHole(15);
                        break;

                    case R.id.hole16Plus:
                        addSwingToHole(15);
                        break;

                    case R.id.hole17Minus:
                        subtractSwingFromHole(16);
                        break;

                    case R.id.hole17Plus:
                        addSwingToHole(16);
                        break;

                    case R.id.hole18Minus:
                        subtractSwingFromHole(17);
                        break;

                    case R.id.hole18Plus:
                        addSwingToHole(17);
                        break;


                    default:
                        break;


        }

    }
}
