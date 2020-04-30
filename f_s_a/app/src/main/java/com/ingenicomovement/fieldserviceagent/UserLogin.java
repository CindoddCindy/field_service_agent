package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ingenicomovement.fieldserviceagent.pojo_auth.AuthLoginResponse;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;
import com.ingenicomovement.fieldserviceagent.util.SignatureUtility;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserLogin extends AppCompatActivity {

    public Button button_login;
    public EditText editText_username, editText_passord;
    private SignatureUtility signatureUtility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        button_login=findViewById(R.id.btnLogin);
        editText_username=findViewById(R.id.etUserName);
        editText_passord=findViewById(R.id.etPassword);
        signatureUtility  = new SignatureUtility();
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // userAuthLogin();

                Intent intent = new Intent(UserLogin.this, BottomNavDua.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void userAuthLogin(){
        String name=editText_username.getText().toString();
        String password=editText_passord.getText().toString();
        String _datetime  = (String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());
        String _signature = signatureUtility.doSignature(_datetime, name);

        RetrofitMethod retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<AuthLoginResponse> authLoginResponseObj = retrofitMethod.loginUserTech(name,password, _datetime, _signature);
        authLoginResponseObj.enqueue(new Callback<AuthLoginResponse>() {
            @Override
            public void onResponse(Call<AuthLoginResponse> call, Response<AuthLoginResponse> response) {

                if(response.body() != null) {
                    if (response.body().getSuccess().contains("false")) {
                        Toast.makeText(UserLogin.this, response.body().getMessage().toString(), Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent(UserLogin.this, BottomNavDua.class);
                        startActivity(intent);
                        finish();
                    }
                }
                else
                {
                    Toast.makeText(UserLogin.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<AuthLoginResponse> call, Throwable t) {

            }
        });

    }



}
