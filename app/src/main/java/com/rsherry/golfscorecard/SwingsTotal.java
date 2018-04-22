package com.rsherry.golfscorecard;

import android.widget.TextView;

public class SwingsTotal {
    private int mTotalSwings;
    private TextView mTotalSwingsLabel;

    public int decreaseTotalSwings(int holeSwings){
        if(this.mTotalSwings != 0) setmTotalSwings(holeSwings - 1);
        return getmTotalSwings();
    }

    public int increaseTotalSwings(int holeSwings) {
        setmTotalSwings(holeSwings + 1);
        return getmTotalSwings();
    }

    public SwingsTotal(int totalSwings){
        mTotalSwings = totalSwings;
    }


    public TextView getmTotalSwingsLabel() {
        return mTotalSwingsLabel;
    }

    public void setmTotalSwingsLabel(TextView mTotalSwingsLabel) {
        this.mTotalSwingsLabel = mTotalSwingsLabel;
    }

    public int getmTotalSwings() {
        return mTotalSwings;
    }

    public void setmTotalSwings(int mTotalSwings) {
        this.mTotalSwings = mTotalSwings;
    }
}
