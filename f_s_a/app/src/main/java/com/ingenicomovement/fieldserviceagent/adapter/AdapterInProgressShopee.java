package com.ingenicomovement.fieldserviceagent.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ingenicomovement.fieldserviceagent.R;
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
        holder.textView_merchantBank.setText(dataItem.getBank());


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
