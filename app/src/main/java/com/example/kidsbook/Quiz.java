package com.example.kidsbook;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity implements View.OnClickListener{
    public static String question[]={
            "A cat has how many legs?",
            "Can an elephant fly?",
            "A dog has how many horns?"


    };

    public static String choices[][]={
            {"one","two","three",
                    "four"},
            {"yes","no","maybe","I don't know"},
            {"1","2","0","3"}

    };

    public static String correctAns[]={
            "four","no","0"
    };

    TextView totalquestionstextView;
    TextView questiontextView;
    Button ansA,ansB,ansC,ansD;
    Button submitButton;
    int score=0;
    int totalquestions=question.length;
    int currentquestionindex=0;
    String selectedans="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        totalquestionstextView =findViewById(R.id.total_question);
        questiontextView =findViewById(R.id.question);
        ansA=findViewById(R.id.ans_A);
        ansB=findViewById(R.id.ans_B);
        ansC=findViewById(R.id.ans_C);
        ansD=findViewById(R.id.ans_D);
        submitButton=findViewById(R.id.submit);
        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitButton.setOnClickListener(this);

        totalquestionstextView.setText("Total Questions: " + totalquestions);
        loadNewQuestion();
    }


    @Override
    public void onClick(View view) {
        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);
    Button btnclicked=(Button)view;
    if(btnclicked.getId()==R.id.submit)
    {
        if(selectedans.equals(correctAns[currentquestionindex]))
        {
            score++;
        }
    currentquestionindex++;
    loadNewQuestion();

    }
    else{
        selectedans=btnclicked.getText().toString();
        btnclicked.setBackgroundColor(Color.MAGENTA);

    }
    }
    void loadNewQuestion(){
        if(currentquestionindex==totalquestions)
        {
            finishquiz();
            return;

        }
        questiontextView.setText(question[currentquestionindex]);
        ansA.setText(choices[currentquestionindex][0]);
        ansB.setText(choices[currentquestionindex][1]);
        ansC.setText(choices[currentquestionindex][2]);
        ansD.setText(choices[currentquestionindex][3]);
    }

    void finishquiz()
    {
    String passStatus="";
    if(score>totalquestions*0.6)
    {
        passStatus="Passed";
    }
    else
    {passStatus="Fail";}
    new AlertDialog.Builder(this).setTitle(passStatus)
        .setMessage("Score is "+ score + " out of "+ totalquestions)
            .setPositiveButton("Restart Quiz",((dialogInterface, i) -> restartQuiz()))
        .setCancelable(false)
            .show();
    }
    void restartQuiz(){
        currentquestionindex=0;
        score=0;
        loadNewQuestion();
    }

    public void homepage(View view) {
        Intent intent=new Intent(Quiz.this,MainActivity.class);
        startActivity(intent);
    }
}