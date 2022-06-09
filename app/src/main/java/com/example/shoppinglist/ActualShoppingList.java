package com.example.shoppinglist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class ActualShoppingList extends AppCompatActivity {

    private RecyclerView goodsRecView;
    private ArrayList<Good> goods;
    private GoodsListRecViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual_shopping_list);

        goodsRecView = findViewById(R.id.goodsRecView);

        goods = new ArrayList<>();
        goods.add(new Good("1"));
        goods.add(new Good("2"));
        goods.add(new Good("3"));
        goods.add(new Good("4"));
        goods.add(new Good("5"));
        goods.add(new Good("6"));
        goods.add(new Good("7"));
        goods.add(new Good("8"));
        goods.add(new Good("9"));
        goods.add(new Good("10"));
        goods.add(new Good("11"));
        goods.add(new Good("12"));
        goods.add(new Good("13"));
        goods.add(new Good("14"));
        goods.add(new Good("15"));
        goods.add(new Good("16"));
        goods.add(new Good("17"));
        goods.add(new Good("18"));
        goods.add(new Good("19"));
        goods.add(new Good("20"));

        //TODO remove hardcoded elements

        adapter = new GoodsListRecViewAdapter();
        adapter.setGoods(goods);

        goodsRecView.setAdapter(adapter);
        goodsRecView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.clear,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.clear:
                goods.clear();
                adapter.setGoods(goods);
                goodsRecView.setAdapter(adapter);
                //TODO Add clearing code (Probably remove clearing feature for final screen)
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}