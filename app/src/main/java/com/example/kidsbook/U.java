package com.example.kidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class U extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u);
    }

    public void onBack19(View view) {
        Intent intent=new Intent(U.this,MainActivity2.class);
        startActivity(intent);

    }
}