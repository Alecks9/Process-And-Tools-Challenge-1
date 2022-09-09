package com.example.test.controller;

import com.example.test.dao.doa;
import com.example.test.model.Item;
import com.example.test.model.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class controller {

    @RestController
    @RequestMapping(path = "/items")
    public class controller{
        @Autowired
        private dao itemDao;

        @GetMapping(path="/item{id})

        }

        @GetMapping(path="/item"){
            public Item
                }


        






    }
}
