package com.ingenicomovement.fieldserviceagent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ingenicomovement.fieldserviceagent.fragment.Bulan;
import com.ingenicomovement.fieldserviceagent.fragment.Dashboard;
import com.ingenicomovement.fieldserviceagent.fragment.Hari;
import com.ingenicomovement.fieldserviceagent.fragment.Installation;
import com.ingenicomovement.fieldserviceagent.fragment.Intransit;
import com.ingenicomovement.fieldserviceagent.fragment.Minggu;
import com.ingenicomovement.fieldserviceagent.fragment.Profile;

public class BottomNavDua extends AppCompatActivity {
    public BottomNavigationView bottomNavigationView_dua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav_dua);

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new Hari());

        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationViewdua);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.day:
                        fragment = new Hari();
                        break;

                    case R.id.week:
                        fragment = new Minggu();
                        break;

                    case R.id.month:
                        fragment = new Bulan();
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
                    .replace(R.id.page_container_dua, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
