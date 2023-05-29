package com.co.dreamcode.model;

import java.util.Arrays;
import java.util.List;

public class MinorAppliance extends HomeAppliance{

    @Override
    public List<String> getDefaultKeyWords() {
        String [] keywords = {"Microwave Oven", "Toaster", "Fryer",
                "Electric Kettle", "Multi Cooker", "Food Processor", "Hand Blender"};
        return Arrays.asList(keywords);
    }

    public MinorAppliance() {
        String [] keywords = {"Microwave Oven", "Toaster", "Fryer",
                "Electric Kettle", "Multi Cooker", "Food Processor", "Hand Blender"};
        this.keyWords.addAll(Arrays.asList(keywords));
    }

    public MinorAppliance(String nameAppliance, double value) {
        super(nameAppliance, value);
        String [] keywords = {"Microwave Oven", "Toaster", "Fryer",
                "Electric Kettle", "Multi Cooker", "Food Processor", "Hand Blender"};
        this.keyWords.addAll(Arrays.asList(keywords));
    }
}
