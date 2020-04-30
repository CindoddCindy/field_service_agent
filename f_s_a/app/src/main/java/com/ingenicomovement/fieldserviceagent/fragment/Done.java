package com.ingenicomovement.fieldserviceagent.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ingenicomovement.fieldserviceagent.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Done extends Fragment {

    public Done() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_done, container, false);
    }
}
