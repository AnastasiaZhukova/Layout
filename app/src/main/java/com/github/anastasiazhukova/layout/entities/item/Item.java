package com.github.anastasiazhukova.layout.entities.item;

public class Item implements IItem {

    private int mIconId;

    private String mName;

    private String mPrice;

    public Item(final int pIconId, final String pName, final String pPrice) {
        mIconId = pIconId;
        mName = pName;
        mPrice = pPrice;
    }

    public int getIconId() {

        return mIconId;
    }


    public String getName() {
        return mName;
    }


    public String getPrice() {
        return mPrice;
    }

}
