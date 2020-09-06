package com.example.groceryhunt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Adapter4 extends RecyclerView.Adapter<Adapter4.MyViewHolder> {
    Context context;
    List<String> urlList;

    public Adapter4(Context context, List<String> urlList) {
        this.context = context;
        this.urlList = urlList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.layout_grid,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {

        for (i=0;i<9;i++){
            List<String> urlList1 = new ArrayList<String>();
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer10.png?alt=media&token=2fa41668-48cf-41fd-a62f-51455bb09717");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer11.png?alt=media&token=a9aa1865-f74a-40ff-a055-0709f50008c7");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer12.png?alt=media&token=7fd7332c-4601-4438-af84-d8a2cf8f6dae");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer13.png?alt=media&token=c93fd23e-c302-4f81-bc34-5b55385f0cd8");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer14.png?alt=media&token=92f6af5c-18bf-4055-8268-23c89d381d2e");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer15.png?alt=media&token=4ac60a7c-7556-444a-a836-0ef0438276ab");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer16.png?alt=media&token=7bb5fab8-1cc7-4086-a390-3b6e91406641");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer17.png?alt=media&token=f20810d6-f79d-4f58-a63c-59df2913cf66");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer18.png?alt=media&token=c73db3ce-8124-4cfd-a12d-7b54be7f7d64");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer19.png?alt=media&token=913a5b99-01e8-41bd-84fb-93a6a8a4264d");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer20.png?alt=media&token=746a498a-4c1b-4ba6-bd77-27b0973cae98");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer21.png?alt=media&token=4ffa1fb4-5968-4b0c-9604-9b3bd272f2a0");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer3.jpg?alt=media&token=477b067f-abbf-4ebd-b989-c5e290b8784e");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer4.png?alt=media&token=0b6fa0aa-cc4f-44dc-af53-52b2fa0aeb2f");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer5.png?alt=media&token=8e6dcc7a-1b65-4bf7-9a7e-5f42b45430be");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer6.png?alt=media&token=6fb96419-86fb-4a03-8ab3-2a30947c7b96");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer7.png?alt=media&token=96682d73-867a-4387-8927-65787ae796c0");
            urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer8.png?alt=media&token=c8e324bb-06e7-48cd-9d86-10d52c951b7b");
            String randomPicture = urlList1.get(new Random().nextInt(urlList.size()));
            Picasso.get()
                    .load(randomPicture)
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .error(R.drawable.ic_launcher_background)
                    .into(holder.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return urlList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {     ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView11);


        }
    }

}
