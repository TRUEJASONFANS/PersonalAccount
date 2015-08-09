package com.truejasonfans.personalaccount.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.truejasonfans.personalaccount.R;

/**
 * a fragment of login page
 */


public class LoginSettingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login_setting, null);
        return view;
    }

}
