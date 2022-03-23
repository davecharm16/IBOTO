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
    private String nav_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_layout);

        if(getIntent().hasExtra("nav_data")){
            Bundle extras = getIntent().getExtras();
            nav_data = extras.getString("nav_data");
        }

        listView = findViewById(R.id.listView);
        if(nav_data.equals("president")){
            models = ListDetails.getPresLists();
        }
        else if(nav_data.equals("vp")){
            models =ListDetails.getVPLists();
        }

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