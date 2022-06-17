package com.example.shoppinglist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GoodsListRecViewAdapter extends RecyclerView.Adapter<GoodsListRecViewAdapter.ViewHolder> {

    private ArrayList<Good> goods = new ArrayList<>();
    public GoodsListRecViewAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.goods_form, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.goodsName.setText(goods.get(position).getName());
        holder.boughtBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(holder.boughtBox.isChecked())
                    holder.cardView.setCardBackgroundColor(holder.cardView.getContext().getResources().getColor(R.color.green));
               else
                   holder.cardView.setCardBackgroundColor(holder.cardView.getContext().getResources().getColor(R.color.red));
            }
        });
    }

    @Override
    public int getItemCount() {
        return goods.size();
    }

    public void setGoods(ArrayList<Good> goods) {
        this.goods = goods;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView goodsName;
        private CheckBox boughtBox;
        private CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            goodsName=itemView.findViewById(R.id.goodName);
            boughtBox=itemView.findViewById(R.id.boughtBox);
            cardView=itemView.findViewById(R.id.cardBackground);
        }
    }
}
