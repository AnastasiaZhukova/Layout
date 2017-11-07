package com.github.anastasiazhukova.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationDrawer extends Fragment {

    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private DrawerLayout mDrawerLayout;

    public NavigationDrawer() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
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

}
