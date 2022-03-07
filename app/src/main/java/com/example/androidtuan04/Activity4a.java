package com.example.androidtuan04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.androidtuan04.adapter.ListViewAdapter;
import com.example.androidtuan04.model.Product;

import java.util.ArrayList;

public class Activity4a extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Product> products;
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4a);

        listView = findViewById(R.id.listView);

        products = new ArrayList<>();
        products.add(new Product("Ca nấu lẩu","Devang",R.drawable._a1));
        products.add(new Product("1 kg Khô gà, Bơ tỏi","LDT Shop",R.drawable._a2));
        products.add(new Product("Xa cần cẩu đa năng","Thế giới đồ chơi",R.drawable._a3));
        products.add(new Product("Đồ chơi dạng mô hình","Thế giới đồ chơi",R.drawable._a4));
        products.add(new Product("Lãnh đạo đơn giản","Minh Long book",R.drawable._a5));
        products.add(new Product("Hiểu lòng con trẻ","Minh Long book",R.drawable._a6));

        adapter = new ListViewAdapter(this,R.layout.item_listview,products);
        listView.setAdapter(adapter);
    }
}