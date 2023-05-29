package com.co.dreamcode.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lawn_Garden extends HomeAppliance{
    @Override
    public List<String> getDefaultKeyWords() {
        String [] keyWords = {"Pruning Shears", "Loppers", "Garden Fork", "Hand Trowel", "Spade", "Rake", "Hoe"};
        return Arrays.asList(keyWords);
    }

    public Lawn_Garden(String nameAppliance, double value) {
        super(nameAppliance, value);
        String [] keyWords = {"Pruning Shears", "Loppers", "Garden Fork", "Hand Trowel", "Spade", "Rake", "Hoe"};
        this.keyWords = new ArrayList<>(Arrays.asList(keyWords));
    }

    public Lawn_Garden() {
        String [] keyWords = {"Pruning Shears", "Loppers", "Garden Fork", "Hand Trowel", "Spade", "Rake", "Hoe"};
        this.keyWords = new ArrayList<>(Arrays.asList(keyWords));
    }
}
