package com.rsherry.golfscorecard;

import android.widget.TextView;

public class Hole {

        String mLabel;
        private int mHoleSwings;

        public int increaseSwings(int holeSwings) {
            setmHoleSwings(holeSwings + 1);
            return getmHoleSwings();
        }

        public int decreaseSwings(int holeSwings) {
            if (this.mHoleSwings != 0) setmHoleSwings(holeSwings-1);
            return getmHoleSwings();
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
