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
        goods.add(new Good("Sausage"));
        goods.add(new Good("Macaroni"));
        goods.add(new Good("Lettuce"));
        goods.add(new Good("Eggs"));

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
                //TODO Add clearing code
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}