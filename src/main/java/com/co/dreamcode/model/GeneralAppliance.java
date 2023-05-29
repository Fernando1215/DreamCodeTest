package com.co.dreamcode.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneralAppliance extends MajorAppliance{
    @Override
    public List<String> getDefaultKeyWords() {
        String [] keywords = {"Refrigerator", "Oven", "Dishwasher", "Washing machine", "Iron"};
        return Arrays.asList(keywords);
    }

    public GeneralAppliance() {
        String [] keywords = {"Refrigerator", "Oven", "Dishwasher", "Washing machine", "Iron"};
        this.keyWords = new ArrayList<>(Arrays.asList(keywords));
    }

    public GeneralAppliance(String nameAppliance, double value){
        this.nameAppliance = nameAppliance;
        this.value = value;
        String [] keywords = {"Refrigerator", "Oven", "Dishwasher", "Washing machine", "Iron"};
        this.keyWords = new ArrayList<>(Arrays.asList(keywords));
    }

}
