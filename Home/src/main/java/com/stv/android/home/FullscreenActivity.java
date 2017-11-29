
package com.stv.android.home;

import com.android.stv.com.home.R;
import com.aspsine.fragmentnavigator.FragmentNavigator;
import com.stv.android.home.fragment.NavFragment.MainFragmentAdapter;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

public class FullscreenActivity extends AppCompatActivity {

    private static final int DEFAULT_POSITION = 0;

    private DrawerLayout drawerLayout;
    private FragmentNavigator mFragmentNavigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFragmentNavigator = new FragmentNavigator(getSupportFragmentManager(), new MainFragmentAdapter(), R.id.container);

        mFragmentNavigator.setDefaultPosition(DEFAULT_POSITION);

        mFragmentNavigator.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mFragmentNavigator.showFragment(mFragmentNavigator.getCurrentPosition());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mFragmentNavigator.onSaveInstanceState(outState);
    }

}
