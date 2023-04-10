package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActivityDTO {

    @JsonProperty("accessibility")
    private double accessibility;
    @JsonProperty("key")
    private String key;
    @JsonProperty("link")
    private String link;
    @JsonProperty("price")
    private double price;
    @JsonProperty("participants")
    private int participants;
    @JsonProperty("type")
    private String type;
    @JsonProperty("activity")
    private String activity;

    public double getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(double accessibility) {
        this.accessibility = accessibility;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;


    }

    @Override
    public String toString() {
        return "ActivityDTO{" +
                "accessibility=" + accessibility +
                ", key='" + key + '\'' +
                ", link='" + link + '\'' +
                ", price=" + price +
                ", participants=" + participants +
                ", type='" + type + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }


}