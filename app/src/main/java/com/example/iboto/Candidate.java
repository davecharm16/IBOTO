package com.example.iboto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Candidate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate);


    }

    public void goToPres(View view){
        Intent intent = new Intent(this, CandidateCardView.class);
        intent.putExtra("nav_data", "president");
        startActivity(intent);
    }

    public void goToVP(View view){
        Intent intent = new Intent(this, CandidateCardView.class);
        intent.putExtra("nav_data", "vp");
        startActivity(intent);
    }
    public void goToSenate(View view){
        Intent intent = new Intent(this, CandidateCardView.class);
        intent.putExtra("nav_data", "senate");
        startActivity(intent);
    }
}