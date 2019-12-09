package com.example.chik.p1astudio;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter< ItemViewHolder > {

    private Context mContext;
    private List<ItemData> mItemList;

    MyAdapter(Context mContext, List<ItemData> mItemList) {
        this.mContext = mContext;
        this.mItemList = mItemList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row_item,parent,false);
        return new ItemViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, int position) {
        holder.mImage.setImageResource(mItemList.get(position).getImage());
        holder.mTitle.setText(mItemList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}

class ItemViewHolder extends RecyclerView.ViewHolder {
    ImageView mImage;
    TextView mTitle;

    ItemViewHolder(View itemView) {
        super(itemView);

        ImageView mImage = itemView.findViewById(R.id.ivImage);
        TextView mTitle = itemView.findViewById(R.id.tvTitle);
    }
}