package com.github.anastasiazhukova.layout;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.github.anastasiazhukova.layout.fragments.NotFoundFragment;
import com.github.anastasiazhukova.layout.fragments.PopularItemsFragment;
import com.github.anastasiazhukova.layout.fragments.PopularShopsFragment;
import com.github.anastasiazhukova.layout.navigationDrawer.NavigationDrawer;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private NavigationDrawer mNavigationDrawer;

    private FragmentTransaction mFragmentTransaction = getFragmentManager().beginTransaction();
    private PopularItemsFragment mPopularItemsFragment = new PopularItemsFragment();
    private PopularShopsFragment mPopularShopsFragment = new PopularShopsFragment();
    private NotFoundFragment mNotFoundFragment = new NotFoundFragment();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.app_bar);
        setSupportActionBar(mToolbar);

        mNavigationDrawer = (NavigationDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_drawer);
        mNavigationDrawer.setUp((DrawerLayout) findViewById(R.id.drawer_layout_main), mToolbar);

        showFragment(mPopularItemsFragment);

        initTabs();

    }

    private void showFragment(final Fragment fragment) {
        mFragmentTransaction = getFragmentManager().beginTransaction();
        mFragmentTransaction.replace(R.id.container, fragment);
        mFragmentTransaction.commit();
    }

    private void initTabs() {
        findViewById(R.id.tab_popular_item).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showFragment(mPopularItemsFragment);

            }
        });
        findViewById(R.id.tab_popular_shop).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showFragment(mPopularShopsFragment);

            }
        });
        findViewById(R.id.tab_recently_viewed).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showFragment(mNotFoundFragment);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        try {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        } finally {
            return super.onCreateOptionsMenu(menu);
        }

    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        final int id = item.getItemId();

        switch (id) {
            case R.id.item_search: {
                //TODO implement method for search
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
