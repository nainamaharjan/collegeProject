package com.example.testfeb.collegeproject;

import android.app.ProgressDialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.email_login)
    EditText email;
    @BindView(R.id.password_login)
    EditText password;
    @BindView(R.id.login_btn)
    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        init();


    }

    private void init() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailAddress  = email.getText().toString();
                String password1= password.getText().toString();

                if(TextUtils.isEmpty(emailAddress)){
                    email.setError("Please enter email");
                    email.requestFocus();
                }else if(TextUtils.isEmpty(password1)){
                    password.setError("please enter password");
                }else {
                    if(emailAddress.equals("naina@gmail.com") && password1.equals("naina")){
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);

                    }else {
                        Toast.makeText(LoginActivity.this, "wrong email and password", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });


    }



}
