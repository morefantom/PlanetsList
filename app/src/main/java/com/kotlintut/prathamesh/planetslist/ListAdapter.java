package com.kotlintut.prathamesh.planetslist;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.kotlintut.prathamesh.planetslist.databinding.ListitemBinding;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private ArrayList<PlanetData> list;
    private LayoutInflater inflater;

    public ListAdapter(ArrayList<PlanetData> l) {
        list=l;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
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
}
