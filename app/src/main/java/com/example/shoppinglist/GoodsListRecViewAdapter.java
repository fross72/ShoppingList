package com.example.shoppinglist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GoodsListRecViewAdapter extends RecyclerView.Adapter<GoodsListRecViewAdapter.ViewHolder> {

    private ArrayList<Good> goods = new ArrayList<>();
    public GoodsListRecViewAdapter() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.goods_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.goodsName.setText(goods.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return goods.size();
    }

    public void setGoods(ArrayList<Good> goods) {
        this.goods = goods;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView goodsName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            goodsName=itemView.findViewById(R.id.goods_name);
        }
    }
}
