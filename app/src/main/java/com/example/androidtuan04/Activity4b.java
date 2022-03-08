package com.example.androidtuan04;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.lang.UProperty;
import android.os.Bundle;
import android.widget.GridView;

import com.example.androidtuan04.adapter.GridViewAdapter;
import com.example.androidtuan04.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Activity4b extends AppCompatActivity {
    private GridView gridView;
    private List<Product> products;
    private GridViewAdapter gridViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4b);

        gridView = findViewById(R.id.girdview);

        products = new ArrayList<>();
        products.add(new Product("","",R.drawable._b1));
        products.add(new Product("","",R.drawable._b2));
        products.add(new Product("","",R.drawable._b3));
        products.add(new Product("","",R.drawable._b4));
        products.add(new Product("","",R.drawable._b5));
        products.add(new Product("","",R.drawable._b6));

        gridViewAdapter = new GridViewAdapter(this,R.layout.item_gridview,products);
        gridView.setAdapter(gridViewAdapter);
    }
}