package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DataKerja extends AppCompatActivity {

    public FloatingActionButton floatingActionButton_to_list;
    public CardView cardView_in_progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kerja);
        floatingActionButton_to_list=findViewById(R.id.fab_to_dropdown);
        cardView_in_progress=findViewById(R.id.cv_in_progress);
        floatingActionButton_to_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DataKerja.this, UserInputDropDown.class);
                startActivity(intent);
                finish();
            }
        });

        cardView_in_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DataKerja.this,BottomNavDua.class);

                startActivity(intent);

            }
        });
    }
}
