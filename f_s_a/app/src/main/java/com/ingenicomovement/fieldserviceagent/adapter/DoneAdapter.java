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
import com.ingenicomovement.fieldserviceagent.pojo.DataDone;

import java.util.List;

public class DoneAdapter extends RecyclerView.Adapter<DoneAdapter.DoneChild> {
    public List<DataDone> dataDoneList;
    Context context;

    public DoneAdapter(List<DataDone> dataDoneList, Context context){
        this.dataDoneList=dataDoneList;
        this.context=context;
    }


    @NonNull
    @Override
    public DoneChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.done_adapter, parent, false);
        DoneChild doneChild = new DoneChild(mView);

        return doneChild;
    }

    @Override
    public void onBindViewHolder(@NonNull DoneChild holder, int position) {
        final  DataDone dataDone = dataDoneList.get(position);
        holder.textView_done_merch_name.setText(dataDone.getMerchantName());
        holder.textView_done_merch_add.setText(dataDone.getMerchantAddress());
        holder.textView_done_merch_note.setText(dataDone.getNote());
        holder.cardView_done_klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return dataDoneList.size();
    }

    public class DoneChild extends RecyclerView.ViewHolder{

        public TextView textView_done_merch_name, textView_done_merch_add, textView_done_merch_note;
        public CardView cardView_done_klik;

        public DoneChild(@NonNull View itemView) {
            super(itemView);
            textView_done_merch_name=itemView.findViewById(R.id.tv_merchant_name_detail);
            textView_done_merch_add=itemView.findViewById(R.id.tv_merchant_address_detail);
            textView_done_merch_note=itemView.findViewById(R.id.tv_merchant_detail_note);
            cardView_done_klik=itemView.findViewById(R.id.card_view_done_assign);
        }
    }
}
