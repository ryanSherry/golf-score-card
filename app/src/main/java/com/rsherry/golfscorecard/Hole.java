package com.rsherry.golfscorecard;

import android.widget.Button;
import android.widget.TextView;

public class Hole {

        String mLabel;
        private int mHoleSwings;

        private void increaseSwings(int holeSwings) {
            holeSwings++;
        }

        private void decreaseSwings(int holeSwings) {
            if (holeSwings != 0) holeSwings--;
        }

        public Hole(String label, int holeSwings) {
            mLabel = label;
            mHoleSwings = holeSwings;
        }

    public int getmHoleSwings() {
        return mHoleSwings;
    }

    public void setmHoleSwings(int mHoleSwings) {
        this.mHoleSwings = mHoleSwings;
    }
}
