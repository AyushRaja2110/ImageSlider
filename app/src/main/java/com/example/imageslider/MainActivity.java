package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper vf1;
    ViewPager vp1;
     int image[] = {R.drawable.ic_baseline_sentiment_dissatisfied_24,R.drawable.ic_baseline_sentiment_satisfied_alt_24,R.drawable.ic_baseline_sentiment_very_satisfied_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vf1 = findViewById(R.id.viewflip);
        vp1 = findViewById(R.id.viewpager);

        for(int i=0;i<image.length;i++)
            showImage(image[i]);

        ImageAdpater adt = new ImageAdpater(this);
        vp1.setAdapter(adt);
    }

    public void showImage(int i) {
        ImageView i1 = new ImageView(this);
        i1.setImageResource(i);
        vf1.addView(i1);
        vf1.setAutoStart(true);
        vf1.setFlipInterval(1000);
        vf1.setInAnimation(this, android.R.anim.slide_in_left);
        vf1.setInAnimation(this, android.R.anim.slide_out_right);
    }
}