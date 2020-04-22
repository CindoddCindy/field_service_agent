package com.ingenicomovement.fieldserviceagent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ingenicomovement.fieldserviceagent.fragment.Dashboard;
import com.ingenicomovement.fieldserviceagent.fragment.Installation;
import com.ingenicomovement.fieldserviceagent.fragment.Intransit;
import com.ingenicomovement.fieldserviceagent.fragment.Profile;

public class BottomNav extends AppCompatActivity {
    public BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new Dashboard());

        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.dashboard:
                        fragment = new Dashboard();
                        break;

                    case R.id.in_transit:
                        fragment = new Intransit();
                        break;

                    case R.id.installation:
                        fragment = new Installation();
                        break;

                    case R.id.user_profile:
                        fragment = new Profile();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });

    }

    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
