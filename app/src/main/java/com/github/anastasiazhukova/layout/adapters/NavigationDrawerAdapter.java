package com.github.anastasiazhukova.layout.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.anastasiazhukova.layout.R;
import com.github.anastasiazhukova.layout.navigationDrawer.NavigationDrawerData;

import java.util.Collections;
import java.util.List;

public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.NavigationDrawerViewHolder> {

    private LayoutInflater mLayoutInflater;
    private List<NavigationDrawerData> mNavigationDrawerDataList = Collections.EMPTY_LIST;



    public NavigationDrawerAdapter(final Context pContext, final List<NavigationDrawerData> pNavigationDrawerDataList) {
        mLayoutInflater = LayoutInflater.from(pContext);
        mNavigationDrawerDataList = pNavigationDrawerDataList;
    }

    @Override
    public NavigationDrawerViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View view = mLayoutInflater.inflate(R.layout.nav_drawer_row, parent, false);
        return new NavigationDrawerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final NavigationDrawerViewHolder holder, final int position) {

        final NavigationDrawerData navigationDrawerData = mNavigationDrawerDataList.get(position);

        holder.mIconView.setImageResource(navigationDrawerData.getIconId());
        holder.mTitleView.setText(navigationDrawerData.getTitle());
    }

    @Override
    public int getItemCount() {
        return mNavigationDrawerDataList.size();
    }

    class NavigationDrawerViewHolder extends RecyclerView.ViewHolder {

        ImageView mIconView;
        TextView mTitleView;

        NavigationDrawerViewHolder(final View itemView) {
            super(itemView);

            mIconView = itemView.findViewById(R.id.rowIcon);
            mTitleView = itemView.findViewById(R.id.rowTitle);

        }
    }
}
