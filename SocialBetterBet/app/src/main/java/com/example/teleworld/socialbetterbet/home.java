package com.example.teleworld.socialbetterbet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.betterbet.betterbet.betterbet.R;

public class home extends Fragment {



    public View onCreeateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_home, container, false);
        return rootView;
    }
}
