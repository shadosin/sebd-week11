package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutritions {
    @JsonProperty("sugar")
    private double sugar;
    @JsonProperty("calories")
    private double calories;
    @JsonProperty("fat")
    private double fat;
    @JsonProperty("protein")
    private double protein;
    @JsonProperty("carbohydrates")
    private double carbohydrates;

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    @Override
    public String toString() {
        return "Nutritions{" +
                "sugar=" + sugar +
                ", calories=" + calories +
                ", fat=" + fat +
                ", protein=" + protein +
                ", carbohydrates=" + carbohydrates +
                '}';
    }
}
