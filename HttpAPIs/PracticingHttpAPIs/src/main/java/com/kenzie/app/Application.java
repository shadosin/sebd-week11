package com.kenzie.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;


public class Application {
    // Initialize the required constant variable here
    static String GET_URL = "http://www.boredapi.com/api/activity";

    //Formats URL query string with one property
    public static String formatURL(String URLString, String parameter, String value){
        //TODO: Fill out method and update return value
        return URLString + "?" + parameter + "=" + value;
    }

    //Overload method: Formats URL query string with two properties
    public static String formatURL(String URLString, String parameter1, String value1,String parameter2, String value2){
        //TODO: Fill out method and update return value
        return URLString + "?" + parameter1 + "=" + value1  + "&" + parameter2 + "=" + value2;
    }

    public static String getURLResponse(String URLString) throws IOException, InterruptedException {
        //TODO: Fill out method and update return value
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(URLString);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        int statusCode = httpResponse.statusCode();
        if(statusCode == 200){
            return httpResponse.body();
        }else{
            return String.format("GET request failed: %d status code received", statusCode);
        }

    }

    public static String formatActivityOutput(String jsonString){
        //TODO: Fill out method and update return value

        /*https://javarevisited.blogspot.com/2012/12/how-to-solve-javalangclasscastexception-java.html#axzz7y2WwD6jv
        Used this to get the idea to create a generic, dug through and found doubleValue()
         */
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<Map<String, Object>> typeReference = new TypeReference<>() {};

            Map<String, Object> jsonMap = objectMapper.readValue(jsonString, typeReference);

            if(jsonMap.containsKey("error")){
                return "No activity found";
            }
            String activity = (String) jsonMap.get("activity");
            String type = (String) jsonMap.get("type");
            int participants = (int) jsonMap.get("participants");
            Number priceValue = (Number) jsonMap.get("price");
            double price = priceValue.doubleValue();

            return "Activity: " + activity + "\n" +
                    "Type: " + type + "\n" +
                    "Participants: " + participants + "\n" +
                    "Price: " + price + "\n";
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getActivityRandom(String URL) throws IOException, InterruptedException {
        //TODO: Fill out method and update return value

        return getURLResponse(URL);
    }

    public static String getActivityType(String URL, String type) throws IOException, InterruptedException {
        //TODO: Fill out method and update return value

        return getURLResponse(formatURL(URL, "type", type));
    }

    public static String getActivityWithPrice(String URL, double price) throws JsonProcessingException, IOException, InterruptedException {
        //TODO: Fill out method and update return value



        return getURLResponse(formatURL(URL, "price", String.valueOf(price)));
    }

    public static String getActivityTypeForGroup(String URL, String type, int numParticipants) throws JsonProcessingException, IOException, InterruptedException {
        //TODO: Fill out method and update return value


        return getURLResponse(formatURL(URL, "type", type,
                "participants", String.valueOf(numParticipants)));
    }

    /** Do not modify main method **/
    public static void main(String[] args) throws IOException {
        String response;
        try {
            System.out.println("Are you feeling bored? Try these activities: ");

            //parse JSON string into formatted output
            System.out.println(formatActivityOutput(getActivityRandom(GET_URL)));
            System.out.println(formatActivityOutput(getActivityType(GET_URL, "education")));
            System.out.println(formatActivityOutput(getActivityWithPrice(GET_URL, 0)));
            System.out.println(formatActivityOutput(getActivityTypeForGroup(GET_URL, "recreational",4)));

            //Test for error checking: this last one does not have a return. Should print "No activity found"
            System.out.println(formatActivityOutput(getActivityType(GET_URL, "mayhem")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}