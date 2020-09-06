package com.example.dashboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class settings extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        b1 = findViewById(R.id.country);
        b2 = findViewById(R.id.purchase);
        b3 = findViewById(R.id.notificationset);
        b4 = findViewById(R.id.signout);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.country:
                Toast.makeText(this, "Change Country", Toast.LENGTH_SHORT).show();
                break;
            case R.id.purchase:
                Toast.makeText(this, "Default Purchase Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.notificationset:
                Toast.makeText(this, "Notifications Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.signout:
                Toast.makeText(this, "Sign Out", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
