package com.example.android.technoriti;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 */
public class MegashowsFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    public MegashowsFragment() {

    }


    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_megashows, container, false);

        tabLayout=(TabLayout)view.findViewById(R.id.tablayout_id);

        viewPager=(ViewPager)view.findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getChildFragmentManager());
        adapter.AddFragment(new FragmentUmang(),"Umang");
        adapter.AddFragment(new FragmentFashion(),"Fashion Show");
        adapter.AddFragment(new FragmentNukkad(),"Nukkad Natak");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;

    }



}
