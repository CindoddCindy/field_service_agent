package com.ingenicomovement.fieldserviceagent.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ingenicomovement.fieldserviceagent.BottomNavDua;
import com.ingenicomovement.fieldserviceagent.DataKerja;
import com.ingenicomovement.fieldserviceagent.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboard extends Fragment {

    public ImageView imageView_shope;

    public Dashboard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        imageView_shope=view.findViewById(R.id.shope_click);

        imageView_shope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BottomNavDua.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
