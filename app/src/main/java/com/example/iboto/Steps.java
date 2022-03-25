package com.example.iboto;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Steps extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {
            R.drawable.step1,
            R.drawable.step2,
            R.drawable.step3,
            R.drawable.step4,
            R.drawable.step5,
            R.drawable.step6,
            R.drawable.step7,
            R.drawable.step8,

    };

    TextView elect_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);

        // Slider View

        sliderView = findViewById(R.id.image_slider);
        SliderAdapter sliderAdapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        // DateTime

        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String inputString2 = "09 05 2022";
        elect_date = findViewById(R.id.electionDay);
        try {
            Date currDate = new Date();
            Date date2 = myFormat.parse(inputString2);
            String curD = myFormat.format(currDate);
            Date date1 = myFormat.parse(curD);

            long diff = date2.getTime() - date1.getTime();
            long diff_t = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            String res = Long.toString(diff_t);

            elect_date.setText(res);



        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}