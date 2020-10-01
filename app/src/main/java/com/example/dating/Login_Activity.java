package com.example.dating;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Activity extends AppCompatActivity {
    private Button login_fb;
    private Button login_gg;
    private Button login_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        login_fb = findViewById(R.id.login_fb);
        login_phone = findViewById(R.id.login_phone);
        login_gg = findViewById(R.id.login_gg);

        login_phone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Activity.this,MainActivity.class);
                 startActivity(intent);
            }
        });
    }
}