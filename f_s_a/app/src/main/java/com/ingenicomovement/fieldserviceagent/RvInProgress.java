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

public class RvInProgress extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rv_in_progress_act);



    }


}
