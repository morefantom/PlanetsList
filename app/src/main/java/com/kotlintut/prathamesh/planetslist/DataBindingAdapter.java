package com.kotlintut.prathamesh.planetslist;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

public class DataBindingAdapter {

    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView iv, int res)
    {
        iv.setImageResource(res);
    }
}
