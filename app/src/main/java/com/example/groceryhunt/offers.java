package com.example.groceryhunt;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class offers extends AppCompatActivity {

    RecyclerView recyclerView;
    int[] img = {R.drawable.offer1,R.drawable.offer2,R.drawable.offer3,R.drawable.offer4,R.drawable.offer5,R.drawable.offer6,R.drawable.offer7,R.drawable.offer8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);
        recyclerView = findViewById(R.id.recview);
        Adapter5 adapter = new Adapter5(this,img);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
