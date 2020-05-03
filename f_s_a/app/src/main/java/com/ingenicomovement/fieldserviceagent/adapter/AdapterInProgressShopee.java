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
import com.ingenicomovement.fieldserviceagent.pojo.DataInProgress;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseInProgAssign;

import java.util.List;

public class AdapterInProgressShopee  extends RecyclerView.Adapter<AdapterInProgressShopee.AdapterChild> {
    private Context context;
    private List<DataInProgress> dataItemList;

    public AdapterInProgressShopee(Context context, List<DataInProgress> dataItemList){
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
        final DataInProgress dataItem = dataItemList.get(position);

        holder.textView_merchantName.setText(dataItem.getMerchantName());
        holder.textView_merchantAdress.setText(dataItem.getMerchantAddress());
        holder.textView_merchantBank.setText(dataItem.getNote());

        holder.cardView_onClik_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();

               bundle.putString("prog_id", dataItem.getId());
                bundle.putString("prog_category",dataItem.getCategory());
                bundle.putString("prog_customer",dataItem.getCustomer());
                bundle.putString("prog_import_date",dataItem.getImportDate());
                bundle.putString("prog_import_ticket",dataItem.getImportTicketReceive());
                bundle.putString("prog_import_bank",dataItem.getImportBank());
                bundle.putString("prog_bank",dataItem.getBank());
                bundle.putString("prog_case",dataItem.getCase());
                bundle.putString("prog_contract_number",dataItem.getContractNumber());
                bundle.putString("prog_ticket_number",dataItem.getTicketNumber());
                bundle.putString("prog_spk_number",dataItem.getSpkNumber());
                bundle.putString("prog_work_type",dataItem.getWorkType());
                bundle.putString("prog_tid",dataItem.getTid());
                bundle.putString("prog_tid_cimb",dataItem.getTidCimb());
                bundle.putString("prog_mid",dataItem.getMid());
                bundle.putString("prog_merchant_name",dataItem.getMerchantName());
                bundle.putString("prog_merchant_address",dataItem.getMerchantAddress());
                bundle.putString("prog_merchant_address_dua",dataItem.getMerchantAddress2());
                bundle.putString("prog_postal_code",dataItem.getPostalCode());
                bundle.putString("prog_city",dataItem.getCity());
                bundle.putString("prog_pic_name",dataItem.getPicName());
                bundle.putString("prog_pic_number",dataItem.getPicNumber());
                bundle.putString("prog_note",dataItem.getNote());
                bundle.putString("prog_damage_type",dataItem.getDamageType());
                bundle.putString("prog_init_code",dataItem.getInitCode());
                bundle.putString("prog_sla",dataItem.getSla());



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


