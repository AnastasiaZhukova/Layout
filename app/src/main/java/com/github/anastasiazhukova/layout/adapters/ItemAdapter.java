package com.github.anastasiazhukova.layout.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.anastasiazhukova.layout.R;
import com.github.anastasiazhukova.layout.entities.item.IItem;
import com.github.anastasiazhukova.layout.entities.item.IItemsList;

import java.util.Collections;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private final LayoutInflater mLayoutInflater;
    private List<IItem> mItemsList = Collections.EMPTY_LIST;

    public ItemAdapter(final Context pContext, final IItemsList pItemsList) {
        mLayoutInflater = LayoutInflater.from(pContext);
        if (pItemsList != null) {
            mItemsList = pItemsList.getItemsList();
        }
    }

    @Override
    public ItemViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View view = mLayoutInflater.inflate(R.layout.item_view, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, final int position) {

        final IItem item = mItemsList.get(position);

        holder.mImageView.setImageResource(item.getIconId());
        holder.mNameTextView.setText(item.getName());
        holder.mPriceTextView.setText(item.getPrice());

    }

    @Override
    public int getItemCount() {
        return mItemsList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView mImageView;
        TextView mNameTextView;
        TextView mPriceTextView;

        ItemViewHolder(final View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.item_image);
            mNameTextView = itemView.findViewById(R.id.item_name);
            mPriceTextView = itemView.findViewById(R.id.item_price);

        }
    }
}
