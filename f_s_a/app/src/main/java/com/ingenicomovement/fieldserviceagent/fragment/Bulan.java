package com.ingenicomovement.fieldserviceagent.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ingenicomovement.fieldserviceagent.R;
import com.ingenicomovement.fieldserviceagent.adapter.DoneAdapter;
import com.ingenicomovement.fieldserviceagent.pojo.DataDone;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseDoneAssign;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bulan extends Fragment {
    public RecyclerView recyclerView;

    public DoneAdapter doneAdapter;
    public List<DataDone> dataDoneList = new ArrayList<>();
    public RetrofitMethod retrofitMethod ;



    public Bulan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_bulan, container, false);

        recyclerView = view.findViewById(R.id.rv_data_done);
        doneAdapter = new DoneAdapter(dataDoneList, getActivity());
        recyclerView.setAdapter(doneAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        getDataDone();


        return view;
    }


    public void getDataDone(){

        retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<ResponseDoneAssign> doneAssignCall = retrofitMethod.getAssignDones();
        doneAssignCall.enqueue(new Callback<ResponseDoneAssign>() {
            @Override
            public void onResponse(Call<ResponseDoneAssign> call, Response<ResponseDoneAssign> response) {
                if (response.isSuccessful()){
                    dataDoneList=response.body().getData();
                    doneAdapter = new DoneAdapter(dataDoneList, getActivity());
                    recyclerView.setAdapter(doneAdapter);

                }

            }

            @Override
            public void onFailure(Call<ResponseDoneAssign> call, Throwable t) {

            }
        });


    }
}
