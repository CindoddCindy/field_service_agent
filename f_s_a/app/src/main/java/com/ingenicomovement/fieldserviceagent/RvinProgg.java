package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;

import com.ingenicomovement.fieldserviceagent.adapter.AdapterInProgressShopee;
import com.ingenicomovement.fieldserviceagent.pojo.DataInProgress;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseInProgAssign;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;
import com.ingenicomovement.fieldserviceagent.util.SignatureUtility;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RvinProgg extends AppCompatActivity {

    public RecyclerView recyclerView;
    public AdapterInProgressShopee adapterInProgressShopee;
    public List<DataInProgress> dataItemArrayList = new ArrayList<>();
    public RetrofitMethod retrofitMethod ;
    public TextView textView_id;
    private SignatureUtility signatureUtility;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvin_progg);
        recyclerView = findViewById(R.id.rv_inProgresShopee);
        adapterInProgressShopee = new AdapterInProgressShopee(RvinProgg.this,dataItemArrayList );
        recyclerView.setAdapter(adapterInProgressShopee);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(RvinProgg.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        textView_id=findViewById(R.id.tv_id_in_prog);
        signatureUtility  = new SignatureUtility();


        getInProg();

    }

    public void getInProg(){
        String skip ="0";
        String id= textView_id.getText().toString();
        String _datetime  = (String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());
        String _signature = signatureUtility.doSignature(_datetime,id);


        retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<ResponseInProgAssign> assignShopeeResponseCall= retrofitMethod.getAssignInProgress(id,skip, _datetime, _signature);
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
