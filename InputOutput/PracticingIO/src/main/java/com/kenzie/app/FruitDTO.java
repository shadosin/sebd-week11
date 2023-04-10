package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FruitDTO {


    @JsonProperty("nutritions")
    private Nutritions nutritions;
    @JsonProperty("order")
    private String order;
    @JsonProperty("family")
    private String family;
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("genus")
    private String genus;

    public Nutritions getNutritions() {
        return nutritions;
    }

    public void setNutritions(Nutritions nutritions) {
        this.nutritions = nutritions;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    public String toString() {
        return "FruitDTO{" +
                "nutritions=" + nutritions.toString() +
                ", order='" + order + '\'' +
                ", family='" + family + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", genus='" + genus + '\'' +
                '}';
    }
}