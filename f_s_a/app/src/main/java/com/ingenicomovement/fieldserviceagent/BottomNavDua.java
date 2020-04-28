package com.ingenicomovement.fieldserviceagent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ingenicomovement.fieldserviceagent.fragment.Bulan;
import com.ingenicomovement.fieldserviceagent.fragment.Hari;
import com.ingenicomovement.fieldserviceagent.fragment.Minggu;
import com.ingenicomovement.fieldserviceagent.fragment.Profile;

public class BottomNavDua extends AppCompatActivity {
    public BottomNavigationView bottomNavigationView_dua;
    public String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav_dua);

        if(getIntent().getExtras()!=null) {
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
             data = bundle.getString("user_name");
        }

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


                    case R.id.profile:
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
                    .replace(R.id.page_container_dua, fragment)
                    .commit();
            return true;
        }
        return false;
    }


}
