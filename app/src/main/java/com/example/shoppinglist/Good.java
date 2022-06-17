package com.example.shoppinglist;

import android.widget.CheckBox;

public class Good {
    private String name;
    private CheckBox box;

    public Good(String name, CheckBox box) {
        this.name = name;
        this.box = box;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                '}';
    }
}
