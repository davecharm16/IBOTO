package com.example.iboto;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class Survey extends AppCompatActivity {
    // Create the object of TextView and PieChart class
    TextView tvBBM, tvLeni, tvIsko, tvManny, tvPing, tvFaisal, tvLeody, tvJose;
    PieChart pieChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        // Link those objects with their respective
        // id's that we have given in .XML file
        tvBBM = findViewById(R.id.tvR);
        tvLeni = findViewById(R.id.tvPython);
        tvIsko = findViewById(R.id.tvCPP);
        tvManny = findViewById(R.id.tvJava);
        tvPing = findViewById(R.id.tvPing);
        tvFaisal = findViewById(R.id.tvFaisal);
        tvLeody = findViewById(R.id.tvLeody);
        tvJose = findViewById(R.id.jtvJose);
        pieChart = findViewById(R.id.piechart);

        // Set the data and color to the pie chart

        setData();

    }
    private void setData(){
        tvBBM.setText(Integer.toString(60));
        tvLeni.setText(Integer.toString(15));
        tvIsko.setText(Integer.toString(10));
        tvManny.setText(Integer.toString(8));
        tvPing.setText(Integer.toString(2));
        tvFaisal.setText(Integer.toString(2));
        tvLeody.setText(Integer.toString(2));
        tvJose.setText(Integer.toString(1));

        pieChart.addPieSlice(
                new PieModel(
                        "BongBong",
                        Integer.parseInt(tvBBM.getText().toString()),
                        Color.parseColor("#AF0202")));
        pieChart.addPieSlice(
                new PieModel(
                        "Leni",
                        Integer.parseInt(tvLeni.getText().toString()),
                        Color.parseColor("#E91E63")));
        pieChart.addPieSlice(
                new PieModel(
                        "Isko",
                        Integer.parseInt(tvIsko.getText().toString()),
                        Color.parseColor("#2196F3")));
        pieChart.addPieSlice(
                new PieModel(
                        "Manny",
                        Integer.parseInt(tvManny.getText().toString()),
                        Color.parseColor("#3F51B5")));

        pieChart.addPieSlice(
                new PieModel(
                        "Ping",
                        Integer.parseInt(tvPing.getText().toString()),
                        Color.parseColor("#FF03DAC5")));

        pieChart.addPieSlice(
                new PieModel(
                        "Faisal",
                        Integer.parseInt(tvFaisal.getText().toString()),
                        Color.parseColor("#FFBB86FC")));

        pieChart.addPieSlice(
                new PieModel(
                        "Leody",
                        Integer.parseInt(tvLeody.getText().toString()),
                        Color.parseColor("#FF6200EE")));
        pieChart.addPieSlice(
                new PieModel(
                        "Jose",
                        Integer.parseInt(tvJose.getText().toString()),
                        Color.parseColor("#fb7268")));

        pieChart.startAnimation();
    }
}