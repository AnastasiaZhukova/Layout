package com.github.anastasiazhukova.layout.entities.shop;

public class ShopsListFactory {

    @Deprecated
    public IShopsList createPopularShopsList() {
        return new ShopsList();
    }
}
