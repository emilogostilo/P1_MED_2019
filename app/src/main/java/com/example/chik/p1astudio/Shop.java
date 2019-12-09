package com.example.chik.p1astudio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;
import java.util.List;

public class Shop extends AppCompatActivity {
    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List<ItemData> mItemList;
    ItemData mItemData;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridlayoutManager = new GridLayoutManager(Shop.this, 2);
        mRecyclerView.setLayoutManager(mGridlayoutManager);

        mItemList = new ArrayList<>();
        mItemData = new ItemData("Book", getString(R.string.description_item_book),R.drawable.book);
        mItemList.add(mItemData);

        MyAdapter myAdapter = new MyAdapter(Shop.this, mItemList);
        mRecyclerView.setAdapter(myAdapter);


    }



}
