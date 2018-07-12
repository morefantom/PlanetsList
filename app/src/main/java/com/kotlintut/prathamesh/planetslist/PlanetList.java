package com.kotlintut.prathamesh.planetslist;

import java.util.ArrayList;

public class PlanetList {
    public ArrayList<PlanetData> list = new ArrayList<>();

    public PlanetList() {
        list.add(new PlanetData(R.mipmap.img1,"Mercury"));
        list.add(new PlanetData(R.mipmap.img2,"Venus"));
        list.add(new PlanetData(R.mipmap.img3,"Earth"));
        list.add(new PlanetData(R.mipmap.img4,"Mars"));
        list.add(new PlanetData(R.mipmap.img5,"Jupiter"));
        list.add(new PlanetData(R.mipmap.img6,"Saturn"));
        list.add(new PlanetData(R.mipmap.img7,"Uranus"));
        list.add(new PlanetData(R.mipmap.img8,"Neptune"));
        list.add(new PlanetData(R.mipmap.img9,"Pluto"));
    }

}
