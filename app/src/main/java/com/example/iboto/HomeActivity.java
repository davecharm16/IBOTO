package com.example.iboto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void goToCandidate(View view){
        Intent intent = new Intent(this,Candidate.class );
        startActivity(intent);
    }

    public void goToNews(View view){
        Intent intent = new Intent(this,News.class );
        startActivity(intent);
    }

    public void goToSurvey(View view){
        Intent intent = new Intent(this,Survey.class );
        startActivity(intent);
    }

    public void goToSteps(View view){
        Intent intent = new Intent(this,Steps.class );
        startActivity(intent);
    }
}