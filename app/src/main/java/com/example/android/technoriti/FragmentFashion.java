package com.example.android.technoriti;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Swedish_Sweta on 3/14/2018.
 */
public class FragmentFashion extends Fragment {
    View view;
    public FragmentFashion() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fashionshow_fragment, container, false);
        return view;
    }
}