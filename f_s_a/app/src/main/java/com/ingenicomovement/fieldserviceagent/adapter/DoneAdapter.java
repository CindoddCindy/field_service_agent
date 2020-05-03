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
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.ingenicomovement.fieldserviceagent.DoneDetail;
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

                Bundle bundle = new Bundle();

                bundle.putString("done_id", dataDone.getId());
                bundle.putString("done_category",dataDone.getCategory());
                bundle.putString("done_customer",dataDone.getCustomer());
                bundle.putString("done_import_date",dataDone.getImportDate());
                bundle.putString("done_import_ticket",dataDone.getImportTicketReceive());
                bundle.putString("done_import_bank",dataDone.getImportBank());
                bundle.putString("done_bank",dataDone.getBank());
                bundle.putString("done_case",dataDone.getCase());
                bundle.putString("done_contract_number",dataDone.getContractNumber());
                bundle.putString("done_ticket_number",dataDone.getTicketNumber());
                bundle.putString("done_spk_number",dataDone.getSpkNumber());
                bundle.putString("done_work_type",dataDone.getWorkType());
                bundle.putString("done_tid",dataDone.getTid());
                bundle.putString("done_tid_cimb",dataDone.getTidCimb());
                bundle.putString("done_mid",dataDone.getMid());
                bundle.putString("done_merchant_name",dataDone.getMerchantName());
                bundle.putString("done_merchant_address",dataDone.getMerchantAddress());
                bundle.putString("done_merchant_address_dua",dataDone.getMerchantAddress2());
                bundle.putString("done_postal_code",dataDone.getPostalCode());
                bundle.putString("done_city",dataDone.getCity());
                bundle.putString("done_pic_name",dataDone.getPicName());
                bundle.putString("done_pic_number",dataDone.getPicNumber());
                bundle.putString("done_note",dataDone.getNote());
                bundle.putString("done_damage_type",dataDone.getDamageType());
                bundle.putString("done_init_code",dataDone.getInitCode());
                bundle.putString("done_sla",dataDone.getSla());




                Intent intent = new Intent(context, DoneDetail.class);
                intent.putExtras(bundle);
                context.startActivity(intent);





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
