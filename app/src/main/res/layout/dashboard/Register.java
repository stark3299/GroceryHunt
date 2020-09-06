package com.example.dashboard;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    CheckBox checkbox;
    EditText name,username,email,mobile,pass;
    String[] cities = {"Ahmedabad","Aligarh","Lucknow","Kanpur","Delhi","Chennai","Mumbai","Kolkata","Bhopal","Hyderabad"};
    String[] states = {"Maharashtra","Tamil Nadu","Delhi","Uttar Pradesh","West Bengal","Gujrat","Madhya Pradesh"};
    AutoCompleteTextView city,state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        city = findViewById(R.id.city);
        pass = findViewById(R.id.password);
        state = findViewById(R.id.state);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        mobile = findViewById(R.id.mobile);
        checkbox = findViewById(R.id.checkbox);
        ArrayAdapter ad = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,cities);
        ArrayAdapter ad2 = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,states);
        city.setAdapter(ad);
        city.setThreshold(1);
        state.setAdapter(ad2);
        state.setThreshold(1);
    }

    public void submit(View view) {

        if (checkbox.isChecked()){

        }
        else {
        }
    }
}
