package com.example.dating;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.Toast;

public class Manhinhchao extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT =3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhchao);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Manhinhchao.this, Login_Activity.class);
                Toast.makeText(Manhinhchao.this," Chào mừng đến với Dating", Toast.LENGTH_SHORT).show();
               startActivity(intent);
               finish();
            }
        },SPLASH_TIME_OUT);
    }
}