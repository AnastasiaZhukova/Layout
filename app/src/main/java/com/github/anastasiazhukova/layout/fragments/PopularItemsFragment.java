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
import com.github.anastasiazhukova.layout.adapters.ItemAdapter;
import com.github.anastasiazhukova.layout.entities.item.IItemsList;
import com.github.anastasiazhukova.layout.entities.item.ItemsListFactory;

public class PopularItemsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private ItemAdapter mItemAdapter;

    private View mView;

    private ItemsListFactory mItemsListFactory;
    private IItemsList mItemDataList;

    public PopularItemsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_popular_items, null);

        mRecyclerView = mView.findViewById(R.id.recycler_popular);

        mItemsListFactory = new ItemsListFactory();
        mItemDataList = mItemsListFactory.createPopularItemsList();
        mItemAdapter = new ItemAdapter(getActivity(), mItemDataList);

        mRecyclerView.setAdapter(mItemAdapter);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2, LinearLayoutManager.VERTICAL, false));

        return mView;
    }

}
