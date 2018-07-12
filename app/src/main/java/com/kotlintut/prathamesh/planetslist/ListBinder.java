package com.kotlintut.prathamesh.planetslist;

import android.databinding.BindingAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListBinder {
    @BindingAdapter("bind:items")
    public static void bindList(ListView view, ArrayList<PlanetData> list) {
        ListAdapter adapter = new com.kotlintut.prathamesh.planetslist.ListAdapter(list);
        view.setAdapter(adapter);
    }

}
