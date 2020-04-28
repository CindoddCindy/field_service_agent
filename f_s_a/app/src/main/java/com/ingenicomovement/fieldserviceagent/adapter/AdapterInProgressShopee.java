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

        holder.textView_merchantName.setText(dataItem.getMerchantName());
        holder.textView_merchantAdress.setText(dataItem.getMerchantAddress());
        holder.textView_merchantBank.setText(dataItem.getNote());

        holder.cardView_onClik_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();

                bundle.putString("data_id", dataItem.getId().toString());//.getText().toString());
                bundle.putString("data_date",dataItem.getImportDate());
                bundle.putString("data_ticket_receive",dataItem.getImportTicketReceive());
                bundle.putString("data_bank",dataItem.getImportBank());
                bundle.putString("bank",dataItem.getBank());
                bundle.putString("case",dataItem.getCase());
                bundle.putString("cont_numb",dataItem.getContractNumber());
                bundle.putString("tick_numb",dataItem.getTicketNumber());
                bundle.putString("spk_num",dataItem.getSpkNumber());
                bundle.putString("work_type",dataItem.getWorkType());
                bundle.putString("tid",dataItem.getTid());
                bundle.putString("tid_cimb",dataItem.getTidCimb());
                bundle.putString("mid",dataItem.getMid());
                bundle.putString("mer_name",dataItem.getMerchantName());
                bundle.putString("mer_add",dataItem.getMerchantAddress());
                bundle.putString("mer_add_dua",dataItem.getMerchantAddress2());
                bundle.putString("post_code",dataItem.getPostalCode());
                bundle.putString("city",dataItem.getCity());
                bundle.putString("pict_name",dataItem.getPicName());
                bundle.putString("pict_numb",dataItem.getPicNumber());
                bundle.putString("note",dataItem.getNote());
                bundle.putString("damage",dataItem.getDamageType());
                bundle.putString("init_code",dataItem.getInitCode());
                bundle.putString("sla",dataItem.getSla());
                bundle.putString("ssn_edc",dataItem.getSnEdc());
                bundle.putString("ssn_sim",dataItem.getSnSim());
                bundle.putString("assign_to_date",dataItem.getAssignToDate());
                bundle.putString("assign_to_status",dataItem.getAssignToStatus());




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
