package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginpage extends AppCompatActivity implements View.OnClickListener {
Button signin,signup;
EditText username,password;
TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_page);
        t1 = findViewById(R.id.forgotpassword);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);
        t1.setOnClickListener(this);
        signin.setOnClickListener(this);
        signup.setOnClickListener(this);
}

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.forgotpassword:
                Toast.makeText(this, "SO WHAT!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.signin:

                break;
            case R.id.signup:
                startActivity(new Intent(this, com.example.dashboard.Register.class));
                break;
        }
    }
}

