package com.example.groceryhunt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.MyViewHolder>
{

    Context context;
    String[] name,detail;
    int[] img;

    public CartAdapter(Context context, String[] name, String[] detail, int[] img) {
        this.context = context;
        this.name = name;
        this.detail = detail;
        this.img = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.cartxml,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.name.setText(name[i]);
        myViewHolder.detail.setText(detail[i]);
        myViewHolder.imageButton.setImageResource(img[i]);
    }

    @Override
    public int getItemCount() {
        return name.length;

    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name,detail;
        ImageButton imageButton;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            detail = itemView.findViewById(R.id.detail);
            imageButton=itemView.findViewById(R.id.imagebtn);
        }
    }
}
