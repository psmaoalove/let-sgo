
package com.stv.android.home.fragment.contentFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.stv.com.home.R;
import com.stv.android.home.fragment.BaseFragment;

public class FragmentFirst extends BaseFragment {
    TextView mtext;

    public static FragmentFirst newInstance() {
        FragmentFirst fragment = new FragmentFirst();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_navigation_header, container, false);
        mtext = (TextView) view.findViewById(R.id.text);
        return view;
    }

    public void settext(String text) {
        if (mtext != null) {
            mtext.setText(text);
        }
    }
}
