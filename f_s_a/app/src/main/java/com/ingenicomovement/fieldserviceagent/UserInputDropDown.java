package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ingenicomovement.fieldserviceagent.pojo.ResponseInProgAssign;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserInputDropDown extends AppCompatActivity {


    public TextView textView_satu, textView_dua, textView_tiga, textView_empat, textView_lima,
    textView_enam, textView_tujuh, textView_delapan, textView_sembilan, textView_sepuluh,
    textView_sebelas, textView_duabelas, textView_tigabelas, textView_empatbelas, textView_lima_belas,
    textView_enambelas, textView_tujuhbelas, textView_delapan_belas, textView_sembilanbelas, textView_duapuluh,
    textView_duapuluhsatu, textView_duapuluhdua, textView_duapuluh_tiga, textView_dua_puluhempat, textView_duapuluhlima,
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
        textView_tigabelas=findViewById(R.id.shopee_detail_mid);
        textView_empatbelas=findViewById(R.id.shopee_detail_merchant_name);
        textView_lima_belas=findViewById(R.id.shopee_detail_merc_adres);
        textView_enambelas=findViewById(R.id.shopee_detail_addres_mrchnt_dua);
        textView_tujuhbelas=findViewById(R.id.shopee_detail_post_code);
        textView_delapan_belas=findViewById(R.id.shopee_detail_city);
        textView_sembilanbelas=findViewById(R.id.shopee_detail_pict_name);
        textView_duapuluh=findViewById(R.id.shopee_detail_pic_numb);
        textView_duapuluhsatu=findViewById(R.id.shope_deail_note);
        textView_duapuluhdua=findViewById(R.id.shoope_detail_damage_type);
        textView_duapuluh_tiga=findViewById(R.id.shope_detail_init_code);
        textView_dua_puluhempat=findViewById(R.id.shope_detail_sla);
        textView_duapuluhlima=findViewById(R.id.shope_detail_ssn_edc);
        textView_duapuluhenam=findViewById(R.id.shope_detail_ssn_sim);


       getDetailItem();
    }

    public void getBundle(){

        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            textView_satu.setText(bundle.getString("prog_id"));
            textView_dua.setText(bundle.getString("prog_category"));
            textView_tiga.setText(bundle.getString("prog_customer"));
            textView_empat.setText(bundle.getString("prog_import_date"));
            textView_lima.setText(bundle.getString("prog_import_ticket"));
            textView_enam.setText(bundle.getString("prog_import_bank"));
            textView_tujuh.setText(bundle.getString("prog_bank"));
            textView_delapan.setText(bundle.getString("prog_case"));
            textView_sembilan.setText(bundle.getString("prog_contract_number"));
            textView_sepuluh.setText(bundle.getString("prog_ticket_number"));
            textView_sebelas.setText(bundle.getString("prog_spk_number"));
            textView_duabelas.setText(bundle.getString("prog_work_type"));
            textView_tigabelas.setText(bundle.getString("prog_tid"));
            textView_empatbelas.setText(bundle.getString("prog_tid_cimb"));
            textView_lima_belas.setText(bundle.getString("prog_mid"));
            textView_enambelas.setText(bundle.getString("prog_merchant_name"));
            textView_tujuhbelas.setText(bundle.getString("prog_merchant_address"));
            textView_delapan_belas.setText(bundle.getString("prog_merchant_address_dua"));
            textView_sembilanbelas.setText(bundle.getString("prog_postal_code"));
            textView_duapuluh.setText(bundle.getString("prog_city"));
            textView_duapuluhsatu.setText(bundle.getString("prog_pic_name"));
            textView_duapuluhdua.setText(bundle.getString("prog_pic_number"));
            textView_duapuluh_tiga.setText(bundle.getString("prog_note"));
            textView_dua_puluhempat.setText(bundle.getString("prog_damage_type"));
            textView_duapuluhlima.setText(bundle.getString("prog_init_code"));
            textView_duapuluhenam.setText(bundle.getString("prog_sla"));
//            textView_duapuluhtujuh.setText(bundle.getString(""));
          //  textView_duapuluhdelapaan.setText(bundle.getString(""));

        }

    }

    public void getDetailItem(){
    RetrofitMethod    retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<ResponseInProgAssign> assignShopeeResponseCall= retrofitMethod.getAssignInProgressess();
        assignShopeeResponseCall.enqueue(new Callback<ResponseInProgAssign>() {
            @Override
            public void onResponse(Call<ResponseInProgAssign> call, Response<ResponseInProgAssign> response) {
                if (response.isSuccessful()){
                    getBundle();

                }
            }

            @Override
            public void onFailure(Call<ResponseInProgAssign> call, Throwable t) {

            }
        });
    }


}
