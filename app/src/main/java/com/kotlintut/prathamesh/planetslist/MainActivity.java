package com.kotlintut.prathamesh.planetslist;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.kotlintut.prathamesh.planetslist.databinding.ActivityMainBinding;
import com.kotlintut.prathamesh.planetslist.databinding.ListitemBinding;

public class MainActivity extends AppCompatActivity {

    PlanetList datalist;
    ActivityMainBinding amb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        datalist=new PlanetList();
        amb.setData(datalist);
    }
}
