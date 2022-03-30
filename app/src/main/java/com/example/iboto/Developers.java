package com.example.iboto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mikhaellopez.circularimageview.CircularImageView;

public class Developers extends AppCompatActivity {
    CircularImageView dev1, dev2, dev3, dev4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        dev1 = findViewById(R.id.dev1);
        dev2 = findViewById(R.id.dev2);
        dev3 = findViewById(R.id.dev3);
        dev4 = findViewById(R.id.dev4);

        dev1.setOnClickListener(imageListener);
        dev2.setOnClickListener(imageListener);
        dev3.setOnClickListener(imageListener);
        dev4.setOnClickListener(imageListener);

    }

    private View.OnClickListener imageListener = new View.OnClickListener() {
        String url;

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.dev1:
                    url = "https://www.facebook.com/IAm.FuturePhilGrammer/";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                    startActivity(intent);
                    break;
                case R.id.dev2:
                    url = "https://www.facebook.com/caballero880";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                    startActivity(intent);
                    break;
                case R.id.dev3:
                    url = "https://www.facebook.com/DWYNZLDJN";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                    startActivity(intent);
                    break;
                case R.id.dev4:
                    url = "https://www.facebook.com/jeradandreif";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                    startActivity(intent);
                    break;
                default:
                    break;
            }
            startActivity(intent);

        }
    };

}