package com.example.kidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rfor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rfor);
    }

    public void onBack25(View view) {
        Intent intent=new Intent(Rfor.this,MainActivity2.class);
        startActivity(intent);
    }
}