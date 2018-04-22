package com.rsherry.golfscorecard;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends ListActivity {


    // Creating Hole Object array
    private Hole[] mHoles = new Hole[18];

    // Creating SwingsTotal Object
    private SwingsTotal mSwingsTotal;

    //shared preferences

    // Creating array to hold all keys for shared preferences
    final static String KEY_HOLES[] = new String[18];

    private static final String KEY_SWING_TOTAL = "KEY_SWING_TOTAL";
    private ListAdapter mListAdapter;


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
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

        }
        mSwingsTotal.setmTotalSwings(0);
        mSwingsTotal.getmTotalSwingsLabel().setText(mSwingsTotal.getmTotalSwings() + "");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwingsTotal = new SwingsTotal(0);

        mSwingsTotal.setmTotalSwingsLabel((TextView) findViewById(R.id.totalSwings));


        //Create the keys that will be used in sharedPreferences

        for (int i = 0; i < KEY_HOLES.length; i++) {
            KEY_HOLES[i] = "KEY_HOLE_" + (i+1);
        }




        //Initialize the hole objects

        for (int i = 0; i < mHoles.length; i++) {
            mHoles[i] = new Hole("Hole " + (i+1),0);
        }

        mListAdapter = new ListAdapter(this, mHoles, mSwingsTotal);
        setListAdapter(mListAdapter);

    }

}
