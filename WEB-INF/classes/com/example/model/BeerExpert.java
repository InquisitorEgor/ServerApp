package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Klinskoe");
        }
        else if (color.equals("light"))
            brands.add("Baltika'");
        else if (color.equals("dark"))
            brands.add("Zhigulevskie");
        else if (color.equals("brown"))
            brands.add("Devyatka");
        else if (color.equals("heavy"))
            brands.add("Very heavy");
        return brands;
    }
}
