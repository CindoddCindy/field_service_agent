package com.ingenicomovement.fieldserviceagent.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.ingenicomovement.fieldserviceagent.DataPerolehan;
import com.ingenicomovement.fieldserviceagent.R;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class Hari extends Fragment {

    public TextView textView_day, textView_week, textView_month;
    public TabLayout tabLayout_data;
    public ImageView imageView_shopee;

    public Hari() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hari, container, false);
      /*  textView_day=view.findViewById(R.id.tv_per_day);
        textView_week=view.findViewById(R.id.tv_per_week);
        textView_month=view.findViewById(R.id.tv_per_month);
        tabLayout_data=view.findViewById(R.id.tab_leout);
        tabLayout_data.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout_data.addTab(tabLayout_data.newTab().setIcon(R.drawable.ic_keyboard_arrow_down_black_24dp).setText("In Progress"));
        tabLayout_data.addTab(tabLayout_data.newTab().setIcon(R.drawable.ic_done_black_24dp).setText("Done"));


       */
        imageView_shopee=view.findViewById(R.id.shope_click);
        imageView_shopee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DataPerolehan.class);
                startActivity(intent);
            }
        });




      //  dataPerolehan();

        return view;
    }


/*

    public void dataPerolehan(){

       RetrofitMethod retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<AssignDataResponse> assignShopeeResponseCall= retrofitMethod.getShpeeAsignInProgressDetail();
        assignShopeeResponseCall.enqueue(new Callback<AssignDataResponse>() {
            @Override
            public void onResponse(Call<AssignDataResponse> call, Response<AssignDataResponse> response) {
               // DataItem dataItem = new DataItem();


                if (response.isSuccessful()){
                    //textView_day.setText(response.body().getData().get(0).get.toString());
                   // textView_week.setText(response.body().getData().get(0).getSumWeek().toString());
                    //textView_month.setText(response.body().getData().get(0).getSumMonth().toString());

                }



            }

            @Override
            public void onFailure(Call<AssignDataResponse> call, Throwable t) {

            }
        });



    }

 */
}
