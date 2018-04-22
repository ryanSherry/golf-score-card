package com.rsherry.golfscorecard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

    private final Context mContext;

    private final Hole[] mHoles;
    private SwingsTotal mSwingsTotal;

    public ListAdapter(Context context, Hole[] holes, SwingsTotal swingsTotal){
        mContext = context;
        mHoles = holes;
        mSwingsTotal = swingsTotal;
    }

    @Override
    public int getCount() {
        return mHoles.length;
    }

    @Override
    public Object getItem(int position) {
        return mHoles[position];
    }

    @Override
    public long getItemId(int position) {
        return 0; //not implementing
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;

        if(convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.holeLabel = (TextView) convertView.findViewById(R.id.holeLabel);
            holder.strokeCount = (TextView) convertView.findViewById(R.id.strokeCount);
            holder.removeStrokeButton = (Button) convertView.findViewById(R.id.removeStrokeButton);
            holder.addStrokeButton = (Button) convertView.findViewById(R.id.addStrokeButton);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.holeLabel.setText(mHoles[position].mLabel);
        holder.strokeCount.setText(mHoles[position].getmHoleSwings() + "");
        holder.removeStrokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mHoles[position].getmHoleSwings() > 0) mSwingsTotal.decreaseTotalSwings(mSwingsTotal.getmTotalSwings());
                mSwingsTotal.getmTotalSwingsLabel().setText(mSwingsTotal.getmTotalSwings() + "");
                int updatedStrokeCount = mHoles[position].decreaseSwings(mHoles[position].getmHoleSwings());
                mHoles[position].setmHoleSwings(updatedStrokeCount);
                holder.strokeCount.setText(updatedStrokeCount + "");

//                mSwingsTotal.setmTotalSwings(mSwingsTotal.getmTotalSwings() - mHoles[position].getmHoleSwings());
            }

        });
        holder.addStrokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int updatedStrokeCount = mHoles[position].increaseSwings(mHoles[position].getmHoleSwings());
                mHoles[position].setmHoleSwings(updatedStrokeCount);
                holder.strokeCount.setText(updatedStrokeCount + "");

                mSwingsTotal.increaseTotalSwings(mSwingsTotal.getmTotalSwings());
                mSwingsTotal.getmTotalSwingsLabel().setText(mSwingsTotal.getmTotalSwings() + "");
            }
        });

        return convertView;
    }

    private static class ViewHolder {
        TextView holeLabel;
        TextView strokeCount;
        Button removeStrokeButton;
        Button addStrokeButton;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

}
