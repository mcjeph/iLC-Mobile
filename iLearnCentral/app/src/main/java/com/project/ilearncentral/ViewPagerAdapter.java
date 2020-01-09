package com.project.ilearncentral;

import com.project.ilearncentral.UserProfile;
import com.project.ilearncentral.Home;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> strings = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int i){
        switch (i){
            case 0:
                return new UserProfile();
            case 1:
                return new Home();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return fragments.size();
    }

    public void addFragment(Fragment fragment, String string){
        fragments.add(fragment);
        strings.add(string);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return strings.get(position);
    }
}
