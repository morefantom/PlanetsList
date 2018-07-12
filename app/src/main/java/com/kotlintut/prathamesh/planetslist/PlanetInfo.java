package com.kotlintut.prathamesh.planetslist;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kotlintut.prathamesh.planetslist.databinding.ActivityPlanetInfoBinding;

public class PlanetInfo extends AppCompatActivity {

    PlanetList pl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPlanetInfoBinding pib= DataBindingUtil.setContentView(this,R.layout.activity_planet_info);
        int pos= getIntent().getIntExtra("position",-1);
        pl=new PlanetList();
        PlanetData pldate=pl.list.get(pos);
        pib.setData(pldate);
        getSupportActionBar().setTitle(pldate.name);
        //pldate=pl.getListItem(pos);
        //String plname=pldate.getName();
        //Toast.makeText(this, "you have clicked on "+plname, Toast.LENGTH_SHORT).show();

    }
}
