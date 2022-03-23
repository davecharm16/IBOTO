package com.example.iboto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        models = ListDetails.getPresLists();

        candidateAdapter = new CustomListAdapter(CandidateCardView.this, models);

        listView.setAdapter(candidateAdapter);

//        ArrayList<Cards> list  = new ArrayList<>();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Model model = models.get(i);
                Intent intent = new Intent(CandidateCardView.this, CandidateInfo.class);
                intent.putExtra("candidate", model);
                startActivity(intent);
            }
        });



    }
}