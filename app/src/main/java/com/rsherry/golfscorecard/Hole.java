package com.rsherry.golfscorecard;

import android.widget.Button;
import android.widget.TextView;

public class Hole {

        String mLabel;
        private int mHoleSwings;
        TextView mMinus;
        TextView mPlus;
        TextView mHoleLabel;

        public void increaseSwings(int holeSwings) {
            setmHoleSwings(holeSwings + 1);
        }

        public void decreaseSwings(int holeSwings) {
            if (this.mHoleSwings != 0) setmHoleSwings(holeSwings-1);
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
