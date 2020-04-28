package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;
import com.ingenicomovement.fieldserviceagent.adapter.TabLayoutAdapter;

public class DataPerolehan extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_perolehan);
        tabLayout=findViewById(R.id.tab_leout);
        viewPager=findViewById(R.id.vew_pager);
        setupTabLayout();
       // setStatusBarColor();

    }

    public void setStatusBarColor(String color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            int statusBarColor = Color.parseColor(color);
            if (statusBarColor == Color.BLACK && window.getNavigationBarColor() == Color.BLACK) {
                window.clearFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            } else {
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            }
            window.setStatusBarColor(statusBarColor);
        }
    }


    private void setupTabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText(" In Progress"));
        tabLayout.addTab(tabLayout.newTab().setText("Done"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        TabLayoutAdapter tabLayoutAdapter = new TabLayoutAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(tabLayoutAdapter);
        viewPager.setCurrentItem(0);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                /*
                Switch case disini berfungsi untuk mengatur warna dan hint ketika disuatu posisi.
                Contoh :
                jika tab berada di posisi 0 yang berarti posisi 0 ini adalah tab pada kategori Home,
                warnanya akan berubah dan juga hint pada searchview akan berubah.

                posisi 0 = HOME
                posisi 1 = GAMES
                posisi 2 = MOVIES
                posisi 3 = BOOKS
                 */
                switch (tab.getPosition()) {
                    case 0:
                        //setStatusBarColor("#3F51B5");
                      //  tabLayout.setBackgroundColor(Color.parseColor(String.valueOf(R.color.primary)));
                        break;
                    case 1:
                        //setStatusBarColor("#007a0e");
                      //  tabLayout.setBackgroundColor(Color.parseColor(String.valueOf(R.color.primary)));
                        break;

                }
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
        });
    }

}
