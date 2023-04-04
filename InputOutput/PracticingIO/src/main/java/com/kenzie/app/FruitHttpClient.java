package com.kenzie.app;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

import static com.kenzie.app.FruitCriteria.*;

public class FruitHttpClient {
    public static String getDesiredURL(FruitCriteria fc){
        if(fc == ALL) {
            return "";
        }
        else if(fc == LOW_CARB) {
            return "";
        }
        else if(fc == HIGH_CALORIE) {
            return "";
        }
        else {
            return "";
        }
    }

    public static String getFruits(String url) {
        // TODO: create a URL object from the desired URL
        // TODO: make the GET request and return the list of FruitDTOs
        return "";
    }

    public static List<FruitDTO> getFruitsList(String httpResponseBody) throws JsonProcessingException {
        return new ArrayList<FruitDTO>();
    }

    public static FruitDTO createFruitDTO(){
        // TODO: create a sample FruitDTO object based on what you want to send in your PUT request
        // instantiate a new FruitDTO object and a new Nutritions DTO object
        // then fill in the properties for each item with the setter methods
        return new FruitDTO();
    }

    public static String fruitToJSON(FruitDTO fruit) throws JsonProcessingException {
        // TODO: convert FruitDTO to JSON using the Jackson library
        return "";
    }

    public String putFruit(String fruitStr, String url) {
        // TODO: make a PUT request with the data, and return the response
        return "";
    }
}