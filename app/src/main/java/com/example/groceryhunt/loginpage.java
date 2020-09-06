package com.example.groceryhunt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class loginpage extends AppCompatActivity implements View.OnClickListener {
    Button signin,signup;
    EditText username,password;
    private ProgressBar progressBar4;
    private int pStatus = 0;
    private Handler handler;
    private FirebaseAuth mAuth;
    SharedPreferences sharedPreferences;
    private static final String pref = "pref";
    private static final String emails = "email";
    private static final String passwords = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_page);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        progressBar4 = findViewById(R.id.progress);
        signin = findViewById(R.id.signin);
        mAuth=FirebaseAuth.getInstance();
        signup = findViewById(R.id.signup);
        signin.setOnClickListener(this);
        signup.setOnClickListener(this);
}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signin:
                mAuth.signInWithEmailAndPassword(username.getText().toString(),password.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Intent intent = new Intent(loginpage.this,Dashboard.class);

                            String em = username.getText().toString();
                            String ps = password.getText().toString();
                            sharedPreferences = getSharedPreferences(pref,MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(emails,em);
                            editor.putString(passwords,ps);
                            editor.commit();

                            startActivity(intent);
                            handler = new Handler();
                            new Thread(new Runnable() {


                                @Override
                                public void run() {
                                    // TODO Auto-generated method stub
                                    while (pStatus < 100) {

                                        pStatus++;

                                        if(pStatus == 99){
                                            pStatus = 0;
                                        }
                                        handler.post(new Runnable() {

                                            @Override
                                            public void run() {
                                                // TODO Auto-generated method stub
                                                progressBar4.setProgress(pStatus);
                                                progressBar4.setSecondaryProgress(pStatus+15);
                                            }
                                        });
                                        try {
                                            // Sleep for 200 milliseconds.
                                            // Just to display the progress slowly
                                            Thread.sleep(16); //thread will take approx 3 seconds to finish
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            }).start();
                            finish();
                        }

                        else {
                            Toast.makeText(loginpage.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                break;
            case R.id.signup:
                startActivity(new Intent(this,Register.class));
                break;
        }
    }
}

