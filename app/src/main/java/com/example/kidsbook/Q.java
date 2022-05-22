package com.example.kidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Q extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q);
    }

    public void onback16(View view) {
        Intent intent=new Intent(Q.this,MainActivity2.class);
        startActivity(intent);
    }
}