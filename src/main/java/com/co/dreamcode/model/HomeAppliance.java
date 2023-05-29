package com.co.dreamcode.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class HomeAppliance {

    protected String nameAppliance;
    protected double value;
    protected List<String> keyWords;

    public String getNameAppliance() {
        return nameAppliance;
    }

    public void setNameAppliance(String nameAppliance) {
        this.nameAppliance = nameAppliance;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }

    public HomeAppliance(String nameAppliance, double value) {
        this.nameAppliance = nameAppliance;
        this.value = value;
        this.keyWords = new ArrayList<>();
    }

    public HomeAppliance() {
        this.keyWords = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "nameAppliance='" + nameAppliance + '\'' +
                ", value=" + value +
                ", keyWords=" + keyWords +
                '}';
    }

    public List<String> getDefaultKeyWords(){
        String [] keyWords = {"Cooking", "Refrigeration", "Washing", "Drying", "Heating", "Cooling"};
        return Arrays.asList(keyWords);
    }

    public static List<String> defaultKeyWords(){
        String [] keyWords = {"Cooking", "Refrigeration", "Washing", "Drying", "Heating", "Cooling"};
        return Arrays.asList(keyWords);
    }
}
