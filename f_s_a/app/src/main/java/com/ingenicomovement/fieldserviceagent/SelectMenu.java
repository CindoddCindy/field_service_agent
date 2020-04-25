package com.ingenicomovement.fieldserviceagent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SelectMenu extends AppCompatActivity {

    public ImageView imageView_shopee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_menu);
        imageView_shopee=findViewById(R.id.shope_click);
        imageView_shopee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SelectMenu.this,BottomNavDua.class);
                startActivity(intent);
            }
        });
    }
}
