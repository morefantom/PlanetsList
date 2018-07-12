package com.kotlintut.prathamesh.planetslist;

public class PlanetData {
    public int iconResource;
    public String name,diameter,periodOrbit,moons,distanceSun,descript;

    public PlanetData(int r, String n,String des,String distS,String dia,String per,String mn) {
        iconResource = r;
        name = n;
        descript=des;
        distanceSun=distS;
        diameter=dia;
        periodOrbit=per;
        moons=mn;
    }

}
