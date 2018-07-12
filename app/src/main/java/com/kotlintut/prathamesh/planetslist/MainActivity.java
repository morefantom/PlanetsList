package com.kotlintut.prathamesh.planetslist;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
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
        getSupportActionBar().setTitle("Welcome to the Planet App");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.colorStars)));
        }
        amb= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        datalist=new PlanetList();
        amb.setData(datalist);
    }
}
