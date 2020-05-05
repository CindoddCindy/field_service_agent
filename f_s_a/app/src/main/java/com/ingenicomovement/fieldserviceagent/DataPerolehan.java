package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseInProgAssign;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseRevisitAssign;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseStatusAssign;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;
import com.ingenicomovement.fieldserviceagent.util.SignatureUtility;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataPerolehan extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView textView_hari, textView_minggu, textView_bulan;
    public TextView t_nama, t_id;
    public TextView t_in_prog, t_rev;

    public Button button_in_prog;


    private SignatureUtility signatureUtility;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_perolehan);
//        tabLayout=findViewById(R.id.tab_leout);
       // viewPager=findViewById(R.id.vew_pager);

        textView_hari=findViewById(R.id.tv_per_day);
        textView_minggu=findViewById(R.id.tv_per_week);
        textView_bulan=findViewById(R.id.tv_per_month);



        signatureUtility  = new SignatureUtility();


        t_nama=findViewById(R.id.tv_get_per_nama);
        t_id=findViewById(R.id.tv_get_per_id);

        t_in_prog=findViewById(R.id.tv_in_prog);

        t_in_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DataPerolehan.this,RvinProgg.class);
                startActivity(intent);

            }
        });
        t_rev=findViewById(R.id.tv_rev);

        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            t_nama.setText(bundle.getString("data_satu"));
            t_id.setText(bundle.getString("data_dua"));
            // data2 = bundle.getString("data2");
        }





        getDataPer();
        getInProgress();
        getRevit();
       // setupTabLayout();
       // setStatusBarColor();

    }

    public void getDataPer(){
        String name= t_nama.getText().toString();
        String id= t_id.getText().toString();
        String _datetime  = (String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());
        String _signature = signatureUtility.doSignature(_datetime,id);

        RetrofitMethod retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<ResponseStatusAssign> responseCall= retrofitMethod.getAssignStatus(id, _datetime, _signature);
       // Call<ResponseStatusAssign> responseCall= retrofitMethod.getAssignStatusses();

        responseCall.enqueue(new Callback<ResponseStatusAssign>() {
            @Override
            public void onResponse(Call<ResponseStatusAssign> call, Response<ResponseStatusAssign> response) {
                if (response.isSuccessful()){
                    textView_hari.setText(response.body().getData().get(0).getSumToday());
                    textView_minggu.setText(response.body().getData().get(0).getSumWeek());
                    textView_bulan.setText(response.body().getData().get(0).getSumMonth());
                }
            }

            @Override
            public void onFailure(Call<ResponseStatusAssign> call, Throwable t) {

            }
        });






    }

    public void getInProgress(){

        String name= t_nama.getText().toString();
        String skip ="0";
        String id= t_id.getText().toString();
        String _datetime  = (String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());
        String _signature = signatureUtility.doSignature(_datetime,id);


        RetrofitMethod retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<ResponseInProgAssign> responseCall= retrofitMethod.getAssignInProgress(id,skip, _datetime, _signature);
        //Call<ResponseInProgAssign> responseCall= retrofitMethod.getAssignInProgressess();
        responseCall.enqueue(new Callback<ResponseInProgAssign>() {
            @Override
            public void onResponse(Call<ResponseInProgAssign> call, Response<ResponseInProgAssign> response) {
                if (response.isSuccessful()){
                    t_in_prog.setText(response.body().getTotal());

                }
            }

            @Override
            public void onFailure(Call<ResponseInProgAssign> call, Throwable t) {

            }
        });


    }


    public void getRevit(){

        String name= t_nama.getText().toString();
        String skip ="0";
        String id= t_id.getText().toString();
        String _datetime  = (String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());
        String _signature = signatureUtility.doSignature(_datetime,id);


        RetrofitMethod retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<ResponseRevisitAssign> responseCall= retrofitMethod.getAssignRevisit(id,skip,_datetime,_signature);
       // Call<ResponseRevisitAssign> responseCall= retrofitMethod.getAssignRevisitest();
        responseCall.enqueue(new Callback<ResponseRevisitAssign>() {
            @Override
            public void onResponse(Call<ResponseRevisitAssign> call, Response<ResponseRevisitAssign> response) {
                if (response.isSuccessful()){
                    t_rev.setText(response.body().getTotal());
                }
            }

            @Override
            public void onFailure(Call<ResponseRevisitAssign> call, Throwable t) {

            }
        });


    }





/*
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

 */

/*
    private void setupTabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText(" In Progress"));
        tabLayout.addTab(tabLayout.newTab().setText("Done"));
        tabLayout.addTab(tabLayout.newTab().setText("Close"));
        tabLayout.addTab(tabLayout.newTab().setText("Revisit"));
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
/*
                switch (tab.getPosition()) {
                    case 0:
                        //setStatusBarColor("#3F51B5");
                      //  tabLayout.setBackgroundColor(Color.parseColor(String.valueOf(R.color.primary)));
                        break;
                    case 1:
                        //setStatusBarColor("#007a0e");
                      //  tabLayout.setBackgroundColor(Color.parseColor(String.valueOf(R.color.primary)));
                        break;

                    case 2:
                        //setStatusBarColor("#007a0e");
                        //  tabLayout.setBackgroundColor(Color.parseColor(String.valueOf(R.color.primary)));
                        break;
                    case 3:
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

 */

}
