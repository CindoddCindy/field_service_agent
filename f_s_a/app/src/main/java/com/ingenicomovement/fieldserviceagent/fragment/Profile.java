package com.ingenicomovement.fieldserviceagent.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ingenicomovement.fieldserviceagent.MainActivity;
import com.ingenicomovement.fieldserviceagent.R;
import com.ingenicomovement.fieldserviceagent.UserLogin;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class Profile extends Fragment {

    public TextView textView_btn_log_out;

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
        textView_btn_log_out=view.findViewById(R.id.btn_tv_logout);

        textView_btn_log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPrefLogOutBtn();

            }
        });


       // userAuthLogin();


        return view;
    }

/*
    public void userAuthLogin(){
        String name="ranadi";
        String password="000000";
        String signature="a939f165240abec4382ec354dbf058c5";
        String _datetime  = "20200420000000";//(String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());
        //String _datetime= =DateFormat.format("yyyyMMddhhmmss", new java.util.Date());


        RetrofitMethod retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<AuthLoginResponse> authLoginResponseObj = retrofitMethod.loginUserTech(name,password, _datetime,signature);
        authLoginResponseObj.enqueue(new Callback<AuthLoginResponse>() {
            @Override
            public void onResponse(Call<AuthLoginResponse> call, Response<AuthLoginResponse> response) {

              //  AuthLoginResponse authLoginResponse = response.body();
              //  Datum datum = (Datum) authLoginResponse.getData();
                if (response.isSuccessful()){
                    //Ai sii errornya dimana, parameter _datetime itu yang bikin error
                    //ku coba hardcode ya datetimenya??
                   // textView_username.setText(datum.getUsername());
                   // textView_user_full_name.setText(datum.getFullname());


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



 */

public void sharedPrefLogOutBtn(){
    SharedPreferences sharedpreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedpreferences.edit();
    editor.clear();
    editor.commit();
    Intent intent = new Intent(getActivity(), UserLogin.class);
    startActivity(intent);



    }

}
