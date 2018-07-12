package com.kotlintut.prathamesh.planetslist;

import java.util.ArrayList;

public class PlanetList {
    public ArrayList<PlanetData> list = new ArrayList<>();

    public PlanetList() {
        list.add(new PlanetData(R.mipmap.img1,"Mercury","closest planet to the Sun","57909227","4879","88","0"));
        list.add(new PlanetData(R.mipmap.img2,"Venus","brightest planet in our sky","108209475","12104","225","0"));
        list.add(new PlanetData(R.mipmap.img3,"Earth","has more exposed water than land","149598262","12742","365","1"));
        list.add(new PlanetData(R.mipmap.img4,"Mars","largest volcano found in the solar system","227943824","6779","687","2"));
        list.add(new PlanetData(R.mipmap.img5,"Jupiter","largest planet in the solar system","778340821","139822","4333","67"));
        list.add(new PlanetData(R.mipmap.img6,"Saturn"," second biggest, but the lightest planet","1426666422","116464","10756","62"));
        list.add(new PlanetData(R.mipmap.img7,"Uranus","axis is at a 97 degree angle","2870658186","50724","30687","27"));
        list.add(new PlanetData(R.mipmap.img8,"Neptune","one Neptune year lasts 165 Earth years","4498396441","49244","60190","14"));
    }

}
