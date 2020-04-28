package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ingenicomovement.fieldserviceagent.pojo.AuthLoginResponse;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserLogin extends AppCompatActivity {

    public Button button_login;
    public EditText editText_username, editText_passord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        button_login=findViewById(R.id.btnLogin);
        editText_username=findViewById(R.id.etUserName);
        editText_passord=findViewById(R.id.etPassword);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userAuthLogin();
                //Intent intent = new Intent(UserLogin.this, SelectMenu.class);

               // startActivity(intent);
               // finish();

            }
        });
    }

    public void userAuthLogin(){
        String name=editText_username.getText().toString();
        String password="95ac42770704d5394099eaed91670c53";
        String signature="a939f165240abec4382ec354dbf058c5";
        String _datetime  = (String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());

        RetrofitMethod retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<AuthLoginResponse> authLoginResponseObj = retrofitMethod.loginUserTech(name,password, _datetime,signature);
        authLoginResponseObj.enqueue(new Callback<AuthLoginResponse>() {
            @Override
            public void onResponse(Call<AuthLoginResponse> call, Response<AuthLoginResponse> response) {


                if (response.isSuccessful()){

                    Intent intent = new Intent(UserLogin.this, BottomNavDua.class);
                    startActivity(intent);
                    finish();

                }
            }

            @Override
            public void onFailure(Call<AuthLoginResponse> call, Throwable t) {

            }
        });

    }



}
