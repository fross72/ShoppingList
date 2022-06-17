package com.example.shoppinglist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CheckBox;

import java.util.ArrayList;

public class ActualShoppingList extends AppCompatActivity {

    private RecyclerView goodsRecView;
    private ArrayList<Good> goods ;
    private GoodsListRecViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getIntent().getExtras();
        ArrayList<String> goodsNames= bundle.getStringArrayList("finalGoods");
        setContentView(R.layout.activity_actual_shopping_list);

        goodsRecView = findViewById(R.id.goodsRecView);

        goods = new ArrayList<>();

        for(String s:goodsNames){
            goods.add(new Good(s,new CheckBox(this)));
        }

        //TODO remove hardcoded elements

        adapter = new GoodsListRecViewAdapter();
        adapter.setGoods(goods);

        goodsRecView.setAdapter(adapter);
        goodsRecView.setLayoutManager(new LinearLayoutManager(this));
    }

}