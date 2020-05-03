package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ingenicomovement.fieldserviceagent.adapter.AdapterInProgressShopee;
import com.ingenicomovement.fieldserviceagent.pojo.DataInProgress;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseInProgAssign;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RvinProgg extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterInProgressShopee adapterInProgressShopee;
    List<DataInProgress> dataItemArrayList = new ArrayList<>();
    RetrofitMethod retrofitMethod ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvin_progg);
        recyclerView = findViewById(R.id.rv_inProgresShopee);
        adapterInProgressShopee = new AdapterInProgressShopee(RvinProgg.this,dataItemArrayList );
        recyclerView.setAdapter(adapterInProgressShopee);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(RvinProgg.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        getInProg();

    }

    public void getInProg(){

        retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<ResponseInProgAssign> assignShopeeResponseCall= retrofitMethod.getAssignInProgressess();
        assignShopeeResponseCall.enqueue(new Callback<ResponseInProgAssign>() {
            @Override
            public void onResponse(Call<ResponseInProgAssign> call, Response<ResponseInProgAssign> response) {
                dataItemArrayList=response.body().getData();
                adapterInProgressShopee = new AdapterInProgressShopee(RvinProgg.this,dataItemArrayList);
                recyclerView.setAdapter(adapterInProgressShopee);

            }

            @Override
            public void onFailure(Call<ResponseInProgAssign> call, Throwable t) {

            }
        });

    }
}
