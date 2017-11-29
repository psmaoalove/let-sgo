
package com.stv.android.home.fragment.NavFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.stv.com.home.R;
import com.stv.android.home.fragment.contentFragment.FragmentFirst;
import com.stv.android.home.fragment.contentFragment.FragmentTwo;

public class NavTwitterFragment extends BaseNavPagerFragment {

    public static NavTwitterFragment newInstance() {
        NavTwitterFragment fragment = new NavTwitterFragment();
        return fragment;
    }

    public NavTwitterFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nav_twitter, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    protected String[] getTitles() {
        return new String[] {
                "视频", "社会",
                "图片", "娱乐", "问答",
                "科技", "汽车",
                "财经", "军事",
                "体育", "段子", "国际"
        };
    }

    @Override
    protected Fragment getFragment(int position) {
        String title = getTitles()[position];
        Fragment fragment = null;
        if (title.equals("视频")) {
            fragment = new FragmentFirst();
        } else {
            fragment = new FragmentTwo();
        }
        return fragment;
    }

}
