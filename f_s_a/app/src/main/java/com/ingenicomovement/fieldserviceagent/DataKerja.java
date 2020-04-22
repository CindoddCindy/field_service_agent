package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DataKerja extends AppCompatActivity {

    public FloatingActionButton floatingActionButton_to_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kerja);
        floatingActionButton_to_list=findViewById(R.id.fab_to_dropdown);
        floatingActionButton_to_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DataKerja.this, UserInputDropDown.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
