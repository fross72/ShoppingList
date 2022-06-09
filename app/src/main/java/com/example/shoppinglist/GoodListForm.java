package com.example.shoppinglist;

import android.widget.EditText;
import android.widget.ImageButton;

public class GoodListForm {
    private EditText editTextGoodFormName;
    private ImageButton imageButtonDelete;

    public GoodListForm(EditText editTextGoodFormName, ImageButton imageButton) {
        this.editTextGoodFormName = editTextGoodFormName;
        this.imageButtonDelete = imageButton;
    }

    public EditText getEditTextGoodFormName() {
        return editTextGoodFormName;
    }
}
