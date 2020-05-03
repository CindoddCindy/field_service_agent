package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PilihProject extends AppCompatActivity {


    public ImageView imageView;
    public TextView textView_get_sel;
    public TextView getId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_project);
        textView_get_sel=findViewById(R.id.get_name_select_project);
        getId=findViewById(R.id.get__id_select_project);
        imageView=findViewById(R.id.shope_click);



        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            textView_get_sel.setText(bundle.getString("data1"));
            getId.setText(bundle.getString("data2"));
            // data2 = bundle.getString("data2");
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("data_satu", textView_get_sel.getText().toString());
                bundle.putString("data_dua", getId.getText().toString());
                Intent intent = new Intent(PilihProject.this, DataPerolehan.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }
}
