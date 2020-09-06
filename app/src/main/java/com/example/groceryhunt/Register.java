package com.example.groceryhunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {
    CheckBox checkbox;
    FirebaseFirestore db;
    private FirebaseAuth mAuth;
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
        mAuth = FirebaseAuth.getInstance();
        state.setAdapter(ad2);
        state.setThreshold(1);
        db=FirebaseFirestore.getInstance();
        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
                .setTimestampsInSnapshotsEnabled(true)
                .build();
        db.setFirestoreSettings(settings);

    }
    public void submit(View view) {
        if (checkbox.isChecked()){

            String em = email.getText().toString();
            String ps = pass.getText().toString();
            mAuth.createUserWithEmailAndPassword(em,ps).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if(task.isSuccessful())
                    {
                    }
                    else
                    {
                        Toast.makeText(Register.this, "Error !!", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            Map<String, Object> user = new HashMap<>();
            user.put("name",name.getText().toString());
            user.put("email",email.getText().toString());
            user.put("username",username.getText().toString());
            user.put("pass",pass.getText().toString());
            user.put("city",city.getText().toString());
            user.put("state",state.getText().toString());
            user.put("mobile",mobile.getText().toString());

            db.collection("user").add(user).addOnSuccessListener(this, new OnSuccessListener<DocumentReference>() {
                @Override
                public void onSuccess(DocumentReference documentReference) {
                    Toast.makeText(Register.this, "Data Saved", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Register.this,loginpage.class));
                    finish();
                }
            }).addOnFailureListener(this, new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Register.this, "Error !!", Toast.LENGTH_SHORT).show();
                }
            });

        }
        else {
            Toast.makeText(this, "Agree to the Terms and Conditions !!", Toast.LENGTH_SHORT).show();

        }
    }
}
