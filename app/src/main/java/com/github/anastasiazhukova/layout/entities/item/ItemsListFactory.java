package com.github.anastasiazhukova.layout.entities.item;

public class ItemsListFactory {

    @Deprecated
    public IItemsList createPopularItemsList(){
        return  new ItemsList();
    }
}
