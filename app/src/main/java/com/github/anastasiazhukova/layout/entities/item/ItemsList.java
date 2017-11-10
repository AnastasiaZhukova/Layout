package com.github.anastasiazhukova.layout.entities.item;

import com.github.anastasiazhukova.layout.R;

import java.util.ArrayList;
import java.util.List;

public class ItemsList implements IItemsList {

    private List<IItem> mItemsList;

    public ItemsList() {
        mItemsList = new ArrayList<>();
    }

    public void add(IItem pItemData) {
        mItemsList.add(pItemData);
    }

    @Deprecated
    public List<IItem> getItemsList() {

        for (int i = 0; i < 10; i++) {
            IItem item = new Item(R.drawable.popular_item_example, "Name " + i, "Price " + i);
            mItemsList.add(item);
        }

        return mItemsList;
    }
}
