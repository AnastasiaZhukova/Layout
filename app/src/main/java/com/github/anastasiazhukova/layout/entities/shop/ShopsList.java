package com.github.anastasiazhukova.layout.entities.shop;

import com.github.anastasiazhukova.layout.R;

import java.util.ArrayList;
import java.util.List;

public class ShopsList implements IShopsList {

    private List<IShop> mShopsList;

    public ShopsList() {
        mShopsList = new ArrayList<>();
    }

    public void add(IShop pShop) {
        mShopsList.add(pShop);
    }

    @Deprecated
    public List<IShop> getShopsList() {

        for (int i = 0; i < 10; i++) {
            IShop shop = new Shop(R.drawable.ic_shop, "Name " + i);
            mShopsList.add(shop);
        }

        return mShopsList;
    }
}
