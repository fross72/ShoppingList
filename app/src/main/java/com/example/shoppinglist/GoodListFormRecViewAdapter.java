package com.example.shoppinglist;

import android.content.Context;
import android.media.Image;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class GoodListFormRecViewAdapter extends RecyclerView.Adapter<GoodListFormRecViewAdapter.GoodFormViewHolder> {

    Context context;
    private ArrayList<GoodListForm> goodListForms;
    private ArrayList<String> goods = new ArrayList<>();

    public GoodListFormRecViewAdapter(Context context, ArrayList<GoodListForm> goodListForms) {
        this.context=context;
        this.goodListForms = goodListForms;
        while(goods.size()!=goodListForms.size()){
            goods.add("");
        }
    }

    @NonNull
    @Override
    public GoodListFormRecViewAdapter.GoodFormViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.creating_good_list_form,parent,false);
        return new GoodListFormRecViewAdapter.GoodFormViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GoodListFormRecViewAdapter.GoodFormViewHolder holder, int position) {
        holder.editTextGoodFormName.setText(goods.get(holder.getAdapterPosition()));
        holder.editTextGoodFormName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                goods.set(holder.getAdapterPosition(),s.toString());
            }
        });

        holder.imageButtonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goods.remove(holder.getAdapterPosition());
                goodListForms.remove(holder.getAdapterPosition());
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return goodListForms.size();
    }

    public void setGoodListForms(ArrayList<GoodListForm> goodListForms) {
        this.goodListForms = goodListForms;
        if(goodListForms.size()==0){
            goods.clear();
        }
       else {
            while (goods.size() != goodListForms.size()) {
                goods.add("");
            }
        }
        notifyDataSetChanged();
    }


    public static class GoodFormViewHolder extends RecyclerView.ViewHolder{

        EditText editTextGoodFormName;
        ImageButton imageButtonDelete;

        public GoodFormViewHolder(@NonNull View itemView) {
            super(itemView);
            this.editTextGoodFormName=itemView.findViewById(R.id.editTextGoodFormName);
            this.imageButtonDelete=itemView.findViewById(R.id.imageButtonDelete);
        }
    }

    public ArrayList<String> retStrings(){
        return goods; //TODO try to find new way to transmit data from RecycleView
    }


}
