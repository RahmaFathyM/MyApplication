package com.example.WhatsApp_Task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.ArrayList;

public class fragPager extends FragmentStatePagerAdapter {
    ArrayList<MyTab> tabs=new ArrayList<>();
    public fragPager(@NonNull FragmentManager fm) {
        super(fm);
    }
public void addTab(MyTab tab){
        tabs.add(tab);
}
    public fragPager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tabs.get(position).getFragment() ;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getName();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
