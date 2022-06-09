package com.example.shoppinglist;

import android.widget.EditText;
import android.widget.ImageButton;

public class GoodListForm {
    private EditText editTextGoodFormName;
    private ImageButton imageButtonDelete;

    public GoodListForm(EditText editTextGoodFormName) {
        this.editTextGoodFormName = editTextGoodFormName;
    }

    public EditText getEditTextGoodFormName() {
        return editTextGoodFormName;
    }
}
