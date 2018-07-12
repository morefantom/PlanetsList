package com.kotlintut.prathamesh.planetslist;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.kotlintut.prathamesh.planetslist.databinding.ListitemBinding;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter {

    private ArrayList<PlanetData> list;
    private LayoutInflater inflater;

    public ListAdapter(ArrayList<PlanetData> l) {
        list=l;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }



    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    /*@Override
    public View getView(final int i, final View view, ViewGroup viewGroup) {
        if(inflater==null)
        {
            inflater=(LayoutInflater)viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        ListitemBinding lib= DataBindingUtil.inflate(inflater,R.layout.listitem,viewGroup,false);
        lib.setData(list.get(i));
        lib.setListitemclickevent(new ListItemClick() {
            @Override
            public void onItemClick() {
                Intent in=new Intent(view.getContext(),PlanetInfo.class);
                in.putExtra("position",i);
                ContextCompat.startActivity(view.getContext(),in,null);
            }
        });
        return lib.getRoot();
    }
    */
}
