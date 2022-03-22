package com.example.iboto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CandidateCardView extends AppCompatActivity {

    private static  final String TAG = "CandidateCardView";

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_layout);
        mListView = (ListView) findViewById(R.id.listView);
    }
}