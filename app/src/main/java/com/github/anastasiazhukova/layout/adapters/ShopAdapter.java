package com.github.anastasiazhukova.layout.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.anastasiazhukova.layout.R;
import com.github.anastasiazhukova.layout.entities.shop.IShop;
import com.github.anastasiazhukova.layout.entities.shop.IShopsList;

import java.util.Collections;
import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopViewHolder> {

    private final LayoutInflater mLayoutInflater;
    private List<IShop> mShopsList = Collections.EMPTY_LIST;

    public ShopAdapter(final Context pContext, final IShopsList pShopsList) {
        mLayoutInflater = LayoutInflater.from(pContext);
        if (pShopsList != null) {
            mShopsList = pShopsList.getShopsList();
        }

    }

    @Override
    public ShopViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View view = mLayoutInflater.inflate(R.layout.shop_view, parent, false);
        return new ShopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ShopViewHolder holder, final int position) {

        final IShop shop = mShopsList.get(position);

        holder.mImageView.setImageResource(shop.getIconId());
        holder.mShopNameTextView.setText(shop.getName());

    }

    @Override
    public int getItemCount() {
        return mShopsList.size();
    }

    class ShopViewHolder extends RecyclerView.ViewHolder {

        ImageView mImageView;
        TextView mShopNameTextView;

        public ShopViewHolder(final View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.shop_image);
            mShopNameTextView = itemView.findViewById(R.id.shop_name);
        }
    }
}
