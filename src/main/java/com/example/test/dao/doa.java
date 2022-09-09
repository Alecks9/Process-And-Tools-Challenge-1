package com.example.test.dao;


import com.example.test.model.Item;
import org.springframework.stereotype.Repository;

import com.example.test.model.Items;

@Repository
public class doa {

    private static Items list = new Items();

    static {
        list.getItemList().add(new Item("1", "can", "description1", 50));
        list.getItemList().add(new Item("2", "can", "description2", 70));
        list.getItemList().add(new Item("3", "can", "description3", 80));
        list.getItemList().add(new Item("4", "can", "description4", 90));
    }

    public Items getAllItems()
    {
        return list;
    }

    public void addItem( Item item){
        list.getItemList().add(item);
    }


}
