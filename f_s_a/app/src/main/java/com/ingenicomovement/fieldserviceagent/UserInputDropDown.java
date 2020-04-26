package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ingenicomovement.fieldserviceagent.pojo.AssignShopeeResponse;
import com.ingenicomovement.fieldserviceagent.pojo.DataItem;
import com.ingenicomovement.fieldserviceagent.pojo.DetailAssignResponse;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserInputDropDown extends AppCompatActivity {


    public TextView textView_satu, textView_dua, textView_tiga, textView_empat, textView_lima,
    textView_enam, textView_tujuh, textView_delapan, textView_sembilan, textView_sepuluh,
    textView_sebelas, textView_duabelas, textView_tigabelas, textView_empatbelas, textView_lima_belas,
    textView_enambelas, textView_tujuhbelas, textView_delapan_belas, getTextView_sembilanbelas, textView_duapuluh,
    textView_duapuluhsatu, textView_duapuluhdua, textView_duapuluh_tiga, textView_dua_puluhemapt, textView_duapuluhlima,
    textView_duapuluhenam, textView_duapuluhtujuh, textView_duapuluhdelapaan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_drop_down);
        textView_satu=findViewById(R.id.shoope_detail_id);
        textView_dua=findViewById(R.id.shopee_detail_iport_date);
        textView_tiga=findViewById(R.id.shopee_ticket_receive);
        textView_empat=findViewById(R.id.shopee_datail_banks);
        textView_lima=findViewById(R.id.shopee_detail_bank_sajah);
        textView_enam=findViewById(R.id.shopee_detail_case);
        textView_tujuh=findViewById(R.id.shope_contract_number);
        textView_delapan=findViewById(R.id.shope_detail_ticket_number);
        textView_sembilan=findViewById(R.id.shope_detail_spk_number);
        textView_sepuluh=findViewById(R.id.shope_detail_work_type);
        textView_sebelas=findViewById(R.id.shopee_detail_tid);
        textView_duabelas=findViewById(R.id.shopee_detail_tid_cimb);

        getDetailItem();
    }

    public void getBundle(){

        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            textView_satu.setText(bundle.getString("data_id"));
            textView_dua.setText(bundle.getString("data_date"));
            textView_tiga.setText(bundle.getString("data_ticket_receive"));
            textView_empat.setText(bundle.getString("data_bank"));
            textView_lima.setText(bundle.getString("bank"));
            textView_enam.setText(bundle.getString("case"));
            textView_tujuh.setText(bundle.getString("cont_numb"));
            textView_delapan.setText(bundle.getString("tick_numb"));
            textView_sembilan.setText(bundle.getString("spk_num"));
            textView_sepuluh.setText(bundle.getString("work_type"));
            textView_sebelas.setText(bundle.getString("tid"));
            textView_duabelas.setText(bundle.getString("tid_cimb"));

        }

    }

    public void getDetailItem(){
    RetrofitMethod    retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<DetailAssignResponse> assignShopeeResponseCall= retrofitMethod.getShpeeAsignInProgressDetail();
        assignShopeeResponseCall.enqueue(new Callback<DetailAssignResponse>() {
            @Override
            public void onResponse(Call<DetailAssignResponse> call, Response<DetailAssignResponse> response) {
                if (response.isSuccessful()){
                    getBundle();

                }
            }

            @Override
            public void onFailure(Call<DetailAssignResponse> call, Throwable t) {

            }
        });
    }
}
