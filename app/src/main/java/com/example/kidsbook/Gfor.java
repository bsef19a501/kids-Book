package com.example.kidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gfor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gfor);


}

    public void onBack26(View view) {
        Intent intent=new Intent(Gfor.this,MainActivity2.class);
        startActivity(intent);
    }
    }