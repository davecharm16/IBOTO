package com.example.iboto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CandidateCardView extends AppCompatActivity {

    private static  final String TAG = "CandidateCardView";

    private ListView listView;
    private ArrayList<Model> models;
    private CustomListAdapter candidateAdapter;
    private TextView candidateTitle, view_info;
    private String nav_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_layout);

        candidateTitle = findViewById(R.id.candidateTextTitle);

        if(getIntent().hasExtra("nav_data")){
            Bundle extras = getIntent().getExtras();
            nav_data = extras.getString("nav_data");
        }

        listView = findViewById(R.id.listView);
        if(nav_data.equals("president")){
            models = ListDetails.getPresLists();
            candidateTitle.setText("Presidentials");
            setItemsOnclick();

        }
        else if(nav_data.equals("vp")){
            models =ListDetails.getVPLists();
            candidateTitle.setText("Vice Presidentials");
            setItemsOnclick();
        }
        else if(nav_data.equals("senate")){
            models =ListDetails.getSenatorials();
            candidateTitle.setText("Senatorials");
            //test
        }

        candidateAdapter = new CustomListAdapter(CandidateCardView.this, models, nav_data);

        listView.setAdapter(candidateAdapter);

//        ArrayList<Cards> list  = new ArrayList<>();


    }

    private void setItemsOnclick(){
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