package com.example.shoppinglist;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GoodListFormRecViewAdapter extends RecyclerView.Adapter<GoodListFormRecViewAdapter.GoodFormViewHolder> {

    Context context;
    private ArrayList<GoodListForm> goodListForms;

    public GoodListFormRecViewAdapter(Context context, ArrayList<GoodListForm> goodListForms) {
        this.context=context;
        this.goodListForms = goodListForms;
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
       holder.editTextGoodFormName.setHint(goodListForms.get(position).getEditTextGoodFormName().getHint());
    }

    @Override
    public int getItemCount() {
        return goodListForms.size();
    }

    public void setGoodListForms(ArrayList<GoodListForm> goodListForms) {
        this.goodListForms = goodListForms;
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

}
