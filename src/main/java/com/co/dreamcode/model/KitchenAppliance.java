package com.co.dreamcode.model;

import java.util.Arrays;
import java.util.List;

public class KitchenAppliance extends MajorAppliance{
    @Override
    public List<String> getDefaultKeyWords() {
        String [] keyWords = {"Kitchen stove", "Wall oven", "Steamer oven", "Microwave oven"};
        return Arrays.asList(keyWords);
    }

    public KitchenAppliance(String nameAppliance, double value) {
        this.nameAppliance = nameAppliance;
        this.value = value;
        String [] keywords = {"Microwave Oven", "Toaster", "Fryer",
                "Electric Kettle", "Multi Cooker", "Food Processor", "Hand Blender"};
        this.keyWords.addAll(Arrays.asList(keywords));
    }

    public KitchenAppliance() {
        String [] keyWords = {"Kitchen stove", "Wall oven", "Steamer oven", "Microwave oven"};
        this.keyWords = Arrays.asList(keyWords);
    }


}
