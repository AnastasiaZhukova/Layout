package com.github.anastasiazhukova.layout.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.anastasiazhukova.layout.R;
import com.github.anastasiazhukova.layout.adapters.ShopAdapter;
import com.github.anastasiazhukova.layout.entities.shop.IShopsList;
import com.github.anastasiazhukova.layout.entities.shop.ShopsListFactory;

public class PopularShopsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private ShopAdapter mShopAdapter;

    private View mView;

    private ShopsListFactory mShopsListFactory;
    private IShopsList mShopsList;

    public PopularShopsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_popular_shops, null);

        mRecyclerView = mView.findViewById(R.id.recycler_popular);

        mShopsListFactory =new ShopsListFactory();
        mShopsList = mShopsListFactory.createPopularShopsList();
        mShopAdapter = new ShopAdapter(getActivity(), mShopsList);

        mRecyclerView.setAdapter(mShopAdapter);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1, LinearLayoutManager.HORIZONTAL, false));

        return mView;
    }
}
