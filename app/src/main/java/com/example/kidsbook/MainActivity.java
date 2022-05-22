package com.example.kidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRepository(View view) {
        Uri webpage = Uri.parse("https://github.com/bsef19a501/kids-Book.git");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void alphabets(View view) {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    public void attemptQuiz(View view) {
        Intent intent=new Intent(MainActivity.this,Quiz.class);
        startActivity(intent);
    }
}