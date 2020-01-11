package com.project.ilearncentral;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

public class ActivityPages extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);

        Button backButton = (Button)findViewById(R.id.back_button);
        backButton.setOnClickListener(this);

        viewPager = (ViewPager)findViewById(R.id.htab_viewpager);
        tabLayout = (TabLayout)findViewById(R.id.htab_tabs);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new UserProfile(), "Profile");
        adapter.addFragment(new NewsFeed(), "NewsFeed");
        adapter.addFragment(new Management(), "Management");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_button:
                startActivity(new Intent(getApplicationContext(), Home.class));
                break;
            default:
                return;
        }
    }
}
