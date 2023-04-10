package com.kenzie.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.kenzie.app.FruitCriteria.*;

public class FruitHttpClient {
    public static String getDesiredURL(FruitCriteria fc){
        if(fc == ALL) {
            return "https://fruityvice.com/api/fruit/all";
        }
        else if(fc == LOW_CARB) {
            return "https://fruityvice.com/api/fruit/carbohydrates?max=5";
        }
        else if(fc == HIGH_CALORIE) {
            return "https://fruityvice.com/api/fruit/calories?min=100";
        }
        else {
            return "";
        }
    }

    public static String getFruits(String url) {
        // TODO: create a URL object from the desired URL

        // TODO: make the GET request and return the list of FruitDTOs
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(url);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int statusCode = httpResponse.statusCode();
        if(statusCode == 200){
            return httpResponse.body();
        }else{
            return String.format("GET request failed: %d status code received", statusCode);
        }

    }


    public static List<FruitDTO> getFruitsList(String httpResponseBody) throws IOException {
       ObjectMapper objectMapper = new ObjectMapper();
       TypeReference<List<FruitDTO>> typeReference = new TypeReference<>() {};

       return objectMapper.readValue(httpResponseBody, typeReference);
    }

    public static FruitDTO createFruitDTO(){
        // TODO: create a sample FruitDTO object based on what you want to send in your PUT request
        FruitDTO fruitDTO = new FruitDTO();
        Nutritions nutritions = new Nutritions();
        // instantiate a new FruitDTO object and a new Nutritions DTO object
        nutritions.setCalories(29);
        nutritions.setCarbohydrates(5.5);
        nutritions.setProtein(0);
        nutritions.setFat(0.4);
        nutritions.setSugar(5.4);
        // then fill in the properties for each item with the setter methods
        fruitDTO.setGenus("Fragaria");
        fruitDTO.setName("Strawberry");
        fruitDTO.setFamily("Rosaceae");
        fruitDTO.setOrder("Rosales");
        fruitDTO.setId(1);
        fruitDTO.setNutritions(nutritions);
        return fruitDTO;
    }

    public static String fruitToJSON(FruitDTO fruit) throws JsonProcessingException {
        // TODO: convert FruitDTO to JSON using the Jackson library
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        return objectMapper.writeValueAsString(fruit);
    }

    public String putFruit(String fruitStr, String url) throws IOException, InterruptedException {
        // TODO: make a PUT request with the data, and return the response
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(url);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(fruitStr))
                .build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        int statusCode = httpResponse.statusCode();
        if(statusCode == 201 || statusCode == 202){
            return httpResponse.body();
        }else{
            return String.format("PUT request failed: %d status code received", statusCode);
        }

    }
}