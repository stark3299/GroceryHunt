package com.example.groceryhunt;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.MyViewHolder>
{

    Context context;
    String[] name1,offer1,name2,offer2;
    int[] img1,img2;

    public Adapter2(Context context, String[] name1, String[] offer1, String[]name2, String[] offer2, int[] img1, int[] img2) {
        this.context = context;
        this.name1 = name1;
        this.offer1 = offer1;
        this.name2 = name2;
        this.offer2 = offer2;
        this.img1 = img1;
        this.img2 = img2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.grid,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.name1.setText(name1[i]);
        myViewHolder.offer1.setText(offer1[i]);
        myViewHolder.imagebutton1.setImageResource(img1[i]);
        myViewHolder.name2.setText(name2[i]);
        myViewHolder.offer2.setText(offer2[i]);
        myViewHolder.imagebutton2.setImageResource(img2[i]);


    }

    @Override
    public int getItemCount() {
        return name1.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name1,offer1,name2,offer2;
        ImageButton imagebutton1,imagebutton2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name1 = itemView.findViewById(R.id.textview1);
            offer1 = itemView.findViewById(R.id.textview2);
            imagebutton1 = itemView.findViewById(R.id.imagebutton1);
            name2 = itemView.findViewById(R.id.textview3);
            offer2 = itemView.findViewById(R.id.textview4);
            imagebutton2 = itemView.findViewById(R.id.imagebutton2);

        }
    }
}
