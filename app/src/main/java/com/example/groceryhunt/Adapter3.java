package com.example.groceryhunt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adapter3 extends ArrayAdapter {
    String[] brand1, product1, quantity1, mrp1;
    int[] imgl;
    Context context;
    public Adapter3(@NonNull Context context, String[] brand1, String[] product1, String[] quantity1, String[] mrp1, int[] img) {
        super(context,R.layout.grid1,R.id.brand,brand1);
        this.context = context;
        this.brand1=brand1;
        this.product1 = product1;
        this.quantity1 = quantity1;
        this.mrp1 = mrp1;
        this.imgl=img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=layoutInflater.inflate(R.layout.grid1,parent,false);

        TextView brandView =row.findViewById(R.id.brand);
        TextView productView =row.findViewById(R.id.product);
        TextView quantityView =row.findViewById(R.id.quantity);
        TextView mrpView =row.findViewById(R.id.mrp);
        ImageView imgView = row.findViewById(R.id.imageView);

        brandView.setText(brand1[position]);
        productView.setText(product1[position]);
        quantityView.setText(quantity1[position]);
        mrpView.setText(mrp1[position]);
        imgView.setImageResource(imgl[position]);
        return row;

    }

}
