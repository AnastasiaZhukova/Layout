package com.github.anastasiazhukova.layout;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.anastasiazhukova.layout.NavigationDrawer.NavigationDrawer;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private NavigationDrawer mNavigationDrawer;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.app_bar);
        setSupportActionBar(mToolbar);

        mNavigationDrawer = (NavigationDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_drawer);
        mNavigationDrawer.setUp((DrawerLayout) findViewById(R.id.drawer_layout_main), mToolbar);

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
