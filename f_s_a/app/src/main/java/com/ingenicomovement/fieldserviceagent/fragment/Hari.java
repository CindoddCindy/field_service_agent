package com.ingenicomovement.fieldserviceagent.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ingenicomovement.fieldserviceagent.R;
import com.ingenicomovement.fieldserviceagent.pojo.AssignShopeeResponse;
import com.ingenicomovement.fieldserviceagent.pojo.DataItem;
import com.ingenicomovement.fieldserviceagent.pojo.DetailAssignResponse;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class Hari extends Fragment {

    public TextView textView_day, textView_week, textView_month;

    public Hari() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hari, container, false);
        textView_day=view.findViewById(R.id.tv_per_day);
        textView_week=view.findViewById(R.id.tv_per_week);
        textView_month=view.findViewById(R.id.tv_per_month);

       // dataPerolehan();

        return view;
    }

    public void dataPerolehan(){
       RetrofitMethod retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<DetailAssignResponse> assignShopeeResponseCall= retrofitMethod.getShpeeAsignInProgressDetail();
        assignShopeeResponseCall.enqueue(new Callback<DetailAssignResponse>() {
            @Override
            public void onResponse(Call<DetailAssignResponse> call, Response<DetailAssignResponse> response) {

                if (response.isSuccessful()){

                }



            }

            @Override
            public void onFailure(Call<DetailAssignResponse> call, Throwable t) {

            }
        });



    }
}
