package com.ingenicomovement.fieldserviceagent.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ingenicomovement.fieldserviceagent.R;
import com.ingenicomovement.fieldserviceagent.adapter.AdapterInProgressShopee;
import com.ingenicomovement.fieldserviceagent.pojo.AssignShopeeResponse;
import com.ingenicomovement.fieldserviceagent.pojo.DataItem;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;
import com.ingenicomovement.fieldserviceagent.util.ConnectUtil;
import com.ingenicomovement.fieldserviceagent.util.PopUpUtil;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class Minggu extends Fragment {

    RecyclerView recyclerView;
    AdapterInProgressShopee adapterInProgressShopee;
    List<DataItem> dataItemArrayList = new ArrayList<>();
    RetrofitMethod retrofitMethod ;

    public Minggu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_minggu, container, false);

        recyclerView = view.findViewById(R.id.rv_inProgresShopee);
        adapterInProgressShopee = new AdapterInProgressShopee(getActivity(),dataItemArrayList );
        recyclerView.setAdapter(adapterInProgressShopee);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);


       // if (ConnectUtil.isConnected(getActivity())) {
            shoopeInProgressData();
       // } else {
          //  PopUpUtil.showMsg(getActivity(), "No Internet connection", PopUpUtil.SHORT);
       // }

        return view;
    }

    public void shoopeInProgressData(){
        retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<AssignShopeeResponse> assignShopeeResponseCall= retrofitMethod.getShpeeAsignInProgress();
        assignShopeeResponseCall.enqueue(new Callback<AssignShopeeResponse>() {
            @Override
            public void onResponse(Call<AssignShopeeResponse> call, Response<AssignShopeeResponse> response) {
                if (response.isSuccessful()){
                    dataItemArrayList=response.body().getData();
                    adapterInProgressShopee = new AdapterInProgressShopee(getActivity(),dataItemArrayList);
                    recyclerView.setAdapter(adapterInProgressShopee);

                }
            }

            @Override
            public void onFailure(Call<AssignShopeeResponse> call, Throwable t) {

            }
        });



    }
}
