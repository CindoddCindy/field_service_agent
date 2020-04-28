package com.ingenicomovement.fieldserviceagent.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Debug;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ingenicomovement.fieldserviceagent.R;
import com.ingenicomovement.fieldserviceagent.pojo.AuthLoginResponse;
import com.ingenicomovement.fieldserviceagent.pojo.Datum;
import com.ingenicomovement.fieldserviceagent.pojo.Project;
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
public class Profile extends Fragment {

    public TextView  textView_username, textView_user_full_name;
    public static String KEY_ACTIVITY = "msg_activity";
//    List<ProjectItem> projectItemList = new ArrayList();

    public Profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        textView_username=view.findViewById(R.id.tv_user_profile_name);
        textView_user_full_name=view.findViewById(R.id.tv_user_full_name);


        userAuthLogin();


        return view;
    }


    public void userAuthLogin(){
        String name="ranadi";
        String password="95ac42770704d5394099eaed91670c53";
        String signature="a939f165240abec4382ec354dbf058c5";
        String _datetime  = "20200420000000";//(String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());

        RetrofitMethod retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<AuthLoginResponse> authLoginResponseObj = retrofitMethod.loginUserTech(name,password, _datetime,signature);
        authLoginResponseObj.enqueue(new Callback<AuthLoginResponse>() {
            @Override
            public void onResponse(Call<AuthLoginResponse> call, Response<AuthLoginResponse> response) {

                //AuthLoginResponse authLoginResponse = response.body();
                //Datum datum = authLoginResponse.getData();
                if (response.isSuccessful()){
                    //Ai sii errornya dimana, parameter _datetime itu yang bikin error
                    //ku coba hardcode ya datetimenya??

                    textView_username.setText(response.body().getData().get(0).getUsername());
                    textView_user_full_name.setText(response.body().getData().get(0).getFullname());
                    //textView_user_full_name.setText(datum.getFullname());


                }
            }

            @Override
            public void onFailure(Call<AuthLoginResponse> call, Throwable t) {

            }
        });

    }



}
