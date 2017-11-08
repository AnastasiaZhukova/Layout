package com.github.anastasiazhukova.layout.NavigationDrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.anastasiazhukova.layout.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationDrawer extends Fragment {

    private View mView;

    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private DrawerLayout mDrawerLayout;

    private RecyclerView mRecyclerView;
    private NavigationDrawerAdapter mNavigationDrawerAdapter;

    public NavigationDrawer() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        mRecyclerView = mView.findViewById(R.id.recycler_nav_drawer);
        mNavigationDrawerAdapter = new NavigationDrawerAdapter(getActivity(), getNavigationDrawerData());
        mRecyclerView.setAdapter(mNavigationDrawerAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        return mView;
    }

    public void setUp(final DrawerLayout pDrawerLayout, final Toolbar pToolbar) {
        mDrawerLayout = pDrawerLayout;
        mActionBarDrawerToggle = new ActionBarDrawerToggle(getActivity(), mDrawerLayout, pToolbar,
                R.string.drawer_opened, R.string.drawer_closed);

        mDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {

            @Override
            public void onDrawerSlide(final View drawerView, final float slideOffset) {

            }

            @Override
            public void onDrawerOpened(final View drawerView) {

            }

            @Override
            public void onDrawerClosed(final View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(final int newState) {
                getActivity().invalidateOptionsMenu();
            }
        });

        mDrawerLayout.post(new Runnable() {

            @Override
            public void run() {
                mActionBarDrawerToggle.syncState();
            }
        });
    }

    static List<NavigationDrawerData> getNavigationDrawerData() {
        List<NavigationDrawerData> navigationDrawerDataList = new ArrayList<>();
        final int[] icons = {R.drawable.ic_home,
                R.drawable.ic_favorite,
                R.drawable.ic_shop,
                R.drawable.ic_search};
        final String[] titles = {"Home",
                "Favorite",
                "Shop",
                "Search"};

        for (int i = 0; i < icons.length && i < titles.length; i++) {
            navigationDrawerDataList.add(new NavigationDrawerData(icons[i], titles[i]));
        }

        return navigationDrawerDataList;

    }

}
