package com.example.imageslider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageAdpater extends PagerAdapter
{
    Context mcontext;
    int image[] = {R.drawable.ic_baseline_sentiment_dissatisfied_24,R.drawable.ic_baseline_sentiment_satisfied_alt_24,R.drawable.ic_baseline_sentiment_very_satisfied_24};

    public ImageAdpater(Context mcontext) {
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView i1 = new ImageView(mcontext);
        i1.setImageResource(image[position]);
        ((ViewPager)container).addView(i1);
        return i1;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        //super.destroyItem(container, position, object);
    }



    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}
