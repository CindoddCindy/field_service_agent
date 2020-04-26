package com.ingenicomovement.fieldserviceagent.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ingenicomovement.fieldserviceagent.R;
import com.ingenicomovement.fieldserviceagent.UserInputDropDown;
import com.ingenicomovement.fieldserviceagent.pojo.DataItem;

import java.util.List;

public class AdapterInProgressShopee  extends RecyclerView.Adapter<AdapterInProgressShopee.AdapterChild> {
    private Context context;
    private List<DataItem> dataItemList;

    public AdapterInProgressShopee(Context context, List<DataItem> dataItemList){
        this.context=context;
        this.dataItemList=dataItemList;
}

    @NonNull
    @Override
    public AdapterChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.intransit_adapter, parent, false);
        AdapterChild adapterChild = new AdapterChild(mView);


        return adapterChild;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterChild holder, int position) {
        final  DataItem dataItem = dataItemList.get(position);

        holder.textView_merchantName.setText(dataItem.getId());
        holder.textView_merchantAdress.setText(dataItem.getImportDate());
        holder.textView_merchantBank.setText(dataItem.getBank());

        holder.cardView_onClik_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();

                bundle.putString("data_id", dataItem.getId().toString());//.getText().toString());
                bundle.putString("data_date",dataItem.getImportDate());
                bundle.putString("data_ticket_receive",dataItem.getImportTicketReceive());
                bundle.putString("data_bank",dataItem.getImportBank());
                bundle.putString("bank",dataItem.getBank());
                bundle.putString("case",dataItem.getJsonMemberCase());
                bundle.putString("cont_numb",dataItem.getContractNumber());
                bundle.putString("tick_numb",dataItem.getTicketNumber());
                bundle.putString("spk_num",dataItem.getSpkNumber());
                bundle.putString("work_type",dataItem.getWorkType());
                bundle.putString("tid",dataItem.getTid());
                bundle.putString("tid_cimb",dataItem.getTidCimb());




                Intent intent = new Intent(context, UserInputDropDown.class);
                intent.putExtras(bundle);
                context.startActivity(intent);









            }
        });


    }

    @Override
    public int getItemCount() {
        return dataItemList.size();
    }

    public class AdapterChild extends  RecyclerView.ViewHolder{


        public CardView cardView_onClik_detail;
        public TextView textView_merchantName, textView_merchantAdress, textView_merchantBank;


        public AdapterChild(@NonNull View itemView) {
            super(itemView);
            cardView_onClik_detail=itemView.findViewById(R.id.cv_detail);
            textView_merchantName=itemView.findViewById(R.id.tv_merchantName);
            textView_merchantAdress=itemView.findViewById(R.id.tv_merchantAddress);
            textView_merchantBank=itemView.findViewById(R.id.tv_bank);
        }
    }
}
