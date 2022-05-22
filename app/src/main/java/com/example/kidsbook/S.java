package com.example.kidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class S extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);
    }

    public void onBack17(View view) {
        Intent intent=new Intent(S.this,MainActivity2.class);
        startActivity(intent);
    }
}