package com.example.iboto;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CandidateCardView extends AppCompatActivity {

    private static  final String TAG = "CandidateCardView";

    private ListView listView;
    private ArrayList<Model> models;
    private CustomListAdapter candidateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_layout);

        listView = findViewById(R.id.listView);

        models = ListDetails.getLists();

        candidateAdapter = new CustomListAdapter(CandidateCardView.this, models);

        listView.setAdapter(candidateAdapter);

//        ArrayList<Cards> list  = new ArrayList<>();


    }
}