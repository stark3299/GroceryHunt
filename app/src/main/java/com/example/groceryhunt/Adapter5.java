package com.example.groceryhunt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class Adapter5 extends RecyclerView.Adapter<Adapter5.MyViewHolder>
{

    Context context;
    int[] img;

    public Adapter5(Context context, int[] img)
    {
        this.context = context;
        this.img = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.offerxml,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.imageButton.setImageResource(img[i]);
    }
    @Override
    public int getItemCount() {
        return img.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageButton imageButton;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageButton = itemView.findViewById(R.id.imageButton);

        }
    }
}
