package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DoneDetail extends AppCompatActivity {
    public TextView textView_satu_done, textView_dua_done, textView_tiga_done, textView_empat_done, textView_lima_done,
            textView_enam_done, textView_tujuh_done, textView_delapan_done, textView_sembilan_done, textView_sepuluh_done,
            textView_sebelas_done, textView_duabelas_done, textView_tigabelas_done, textView_empatbelas_done, textView_lima_belas_done,
            textView_enambelas_done, textView_tujuhbelas_done, textView_delapan_belas_done, textView_sembilanbelas_done, textView_duapuluh_done,
            textView_duapuluhsatu_done, textView_duapuluhdua_done, textView_duapuluh_tiga_done, textView_dua_puluhempat_done, textView_duapuluh_lima_done, textView_duapuluh_enam_done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done_detail);
        textView_satu_done=findViewById(R.id.shoope_done_detail_id);
        textView_dua_done=findViewById(R.id.shopee_done_category);
        textView_tiga_done=findViewById(R.id.shopee_done_customer);
        textView_empat_done=findViewById(R.id.shopee_done_import_date);
        textView_lima_done=findViewById(R.id.shopee_done_detail_import_ticket);
        textView_enam_done=findViewById(R.id.shopee_done_detail_import_bank);
        textView_tujuh_done=findViewById(R.id.shope__done_detail_bank);
        textView_delapan_done=findViewById(R.id.shope_done_detail_case);
        textView_sembilan_done=findViewById(R.id.shope_done_detail_contract_number);
        textView_sepuluh_done=findViewById(R.id.shope_done_detail_ticket_number);
        textView_sebelas_done=findViewById(R.id.shopee_done_detail_spk_number);
        textView_duabelas_done=findViewById(R.id.shopee_done_detail_work_type);
        textView_tigabelas_done=findViewById(R.id.shopee_done_detail_tid);
        textView_empatbelas_done=findViewById(R.id.shopee_done_detail_tid_cimb);
        textView_lima_belas_done=findViewById(R.id.shopee_done_detail_mid);
        textView_enambelas_done=findViewById(R.id.shopee_done_detail_merchant_name);
        textView_tujuhbelas_done=findViewById(R.id.shopee_done_detail_merchant_address);
        textView_delapan_belas_done=findViewById(R.id.shopee_done_detail_merchant_addres_dua);
        textView_sembilanbelas_done=findViewById(R.id.shopee_done_detail_postal_code);
        textView_duapuluh_done=findViewById(R.id.shopee_done_detail_city);
        textView_duapuluhsatu_done=findViewById(R.id.shope_done_deail_pic_name);
        textView_duapuluhdua_done=findViewById(R.id.shoope_done_detail_pic_number);
        textView_duapuluh_tiga_done=findViewById(R.id.shope_done_detail_note);
        textView_dua_puluhempat_done=findViewById(R.id.shope_done_detail_damage_type);
        textView_duapuluh_lima_done=findViewById(R.id.shope_done_detail_init_code);
        textView_duapuluh_enam_done=findViewById(R.id.shope_done_detail_sla);


        getDataBundle();
    }

    public void getDataBundle(){
        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            textView_satu_done.setText(bundle.getString("done_id"));
            textView_dua_done.setText(bundle.getString("done_category"));
            textView_tiga_done.setText(bundle.getString("done_customer"));
            textView_empat_done.setText(bundle.getString("done_import_date"));
            textView_lima_done.setText(bundle.getString("done_import_ticket"));
            textView_enam_done.setText(bundle.getString("done_import_bank"));
            textView_tujuh_done.setText(bundle.getString("done_bank"));
            textView_delapan_done.setText(bundle.getString("done_case"));
            textView_sembilan_done.setText(bundle.getString("done_contract_number"));
            textView_sepuluh_done.setText(bundle.getString("done_ticket_number"));
            textView_sebelas_done.setText(bundle.getString("done_spk_number"));
            textView_duabelas_done.setText(bundle.getString("done_work_type"));
            textView_tigabelas_done.setText(bundle.getString("done_tid"));
            textView_empatbelas_done.setText(bundle.getString("done_tid_cimb"));
            textView_lima_belas_done.setText(bundle.getString("done_mid"));
            textView_enambelas_done.setText(bundle.getString("done_merchant_name"));
            textView_tujuhbelas_done.setText(bundle.getString("done_merchant_address"));
            textView_delapan_belas_done.setText(bundle.getString("done_merchant_address_dua"));
            textView_sembilanbelas_done.setText(bundle.getString("done_postal_code"));
            textView_duapuluh_done.setText(bundle.getString("done_city"));
            textView_duapuluhsatu_done.setText(bundle.getString("done_pic_name"));
            textView_duapuluhdua_done.setText(bundle.getString("done_pic_number"));
            textView_duapuluh_tiga_done.setText(bundle.getString("done_note"));
            textView_dua_puluhempat_done.setText(bundle.getString("done_damage_type"));
            textView_duapuluh_lima_done.setText(bundle.getString("done_init_code"));
            textView_duapuluh_enam_done.setText(bundle.getString("done_sla"));




        }
    }
}
