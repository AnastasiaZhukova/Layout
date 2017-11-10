package com.github.anastasiazhukova.layout.entities.shop;

public class Shop implements IShop {

    private int mIconId;

    private String mName;

    public Shop(final int pIconId, final String pName) {
        mIconId = pIconId;
        mName = pName;
    }

    public int getIconId() {

        return mIconId;
    }

    public String getName() {
        return mName;
    }

}
