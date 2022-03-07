package com.example.androidtuan04.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidtuan04.R;
import com.example.androidtuan04.model.Product;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Product> listProduct;
    private int positionSelect = -1;


    public ListViewAdapter(Context context, int idLayout, List<Product> listProduct) {
        this.context = context;
        this.idLayout = idLayout;
        this.listProduct = listProduct;
//        this.positionSelect = positionSelect;
    }

    @Override
    public int getCount() {
        if (listProduct.size() != 0 && !listProduct.isEmpty()) {
            return listProduct.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tvProductName = convertView.findViewById(R.id.textViewName);
        TextView tvShop = convertView.findViewById(R.id.textViewShop);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        final Product product = listProduct.get(position);

        if (listProduct != null && !listProduct.isEmpty()) {
            tvProductName.setText(product.getName());
            tvShop.setText(product.getShop());
            imageView.setImageResource(product.getImage());
        }
        return convertView;
    }
}
