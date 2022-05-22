package com.example.kidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class I extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i);
    }

    public void onBack8(View view) {
        Intent intent=new Intent(I.this,MainActivity2.class);
        startActivity(intent);
    }
}