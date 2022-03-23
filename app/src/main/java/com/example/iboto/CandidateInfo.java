package com.example.iboto;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CandidateInfo extends AppCompatActivity {
    private TextView name, party, info, platform, accomplishment;
    private ImageView image;
    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_info);

        name = findViewById(R.id.canId);
        party = findViewById(R.id.candidateParty);
        info = findViewById(R.id.infoCandidateTxt);
        platform = findViewById(R.id.candidatePlatform);
        accomplishment = findViewById(R.id.candidateAccomplishments);
        image = findViewById(R.id.infoImage);

        if(getIntent().hasExtra("candidate")){
            model = getIntent().getParcelableExtra("candidate");
        }

        name.setText(model.getName());
        party.setText(model.getPartylist());
        info.setText(model.getInfo());
        platform.setText(model.getPlatform());
        accomplishment.setText(model.getAccomplishment());
        image.setImageResource(model.getCandidateImage());

    }
}