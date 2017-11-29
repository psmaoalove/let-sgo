
package com.stv.android.home.fragment.NavFragment;

import com.aspsine.fragmentnavigator.FragmentNavigatorAdapter;

import android.support.v4.app.Fragment;

public class MainFragmentAdapter implements FragmentNavigatorAdapter {

    @Override
    public Fragment onCreateFragment(int position) {
        switch (position) {
            case 0:
                return NavTwitterFragment.newInstance();
        }
        return null;
    }

    @Override
    public String getTag(int position) {
        return String.valueOf(position);
    }

    @Override
    public int getCount() {
        return 1;
    }
}
