package com.example.shoppinglist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CreatingShoppingList extends AppCompatActivity {

    private FloatingActionButton addBtn;
    private FloatingActionButton confirmBtn;
    private ArrayList<GoodListForm> goodListForms = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_shopping_list);

        RecyclerView recyclerView = findViewById(R.id.creatingListRecView);

        addBtn = findViewById(R.id.addBtn);
        confirmBtn = findViewById(R.id.confirmBtn);

        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));
        goodListForms.add(new GoodListForm(new EditText(this)));

        GoodListFormRecViewAdapter goodListFormRecViewAdapter = new GoodListFormRecViewAdapter(this,goodListForms);
        recyclerView.setAdapter(goodListFormRecViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO creating and confirming list of goods
                changeAction();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.clear,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.clear:
                //TODO clearing ArrayList and Screen

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void changeAction(){
        Intent intent = new Intent(this, ActualShoppingList.class);
        startActivity(intent);
    }



}