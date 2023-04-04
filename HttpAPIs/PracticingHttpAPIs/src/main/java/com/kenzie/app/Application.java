package com.kenzie.app;

import java.io.IOException;


public class Application {
    // Initialize the required constant variable here
    static String GET_URL = "";

    //Formats URL query string with one property
    public static String formatURL(String URLString, String parameter, String value){
        //TODO: Fill out method and update return value
        return "";
    }

    //Overload method: Formats URL query string with two properties
    public static String formatURL(String URLString, String parameter1, String value1,String parameter2, String value2){
        //TODO: Fill out method and update return value
        return "";
    }

    public static String getURLResponse(String URLString)  {
        //TODO: Fill out method and update return value
        return "";
    }

    public static String formatActivityOutput(String jsonString){
        //TODO: Fill out method and update return value
        return "";
    }

    public static String getActivityRandom(String URL) {
        //TODO: Fill out method and update return value
        return "";
    }

    public static String getActivityType(String URL, String type) throws com.fasterxml.jackson.core.JsonProcessingException,IOException{
        //TODO: Fill out method and update return value
        return "";
    }

    public static String getActivityWithPrice(String URL, double price) throws com.fasterxml.jackson.core.JsonProcessingException,IOException{
        //TODO: Fill out method and update return value
        return "";
    }

    public static String getActivityTypeForGroup(String URL, String type, int numParticipants) {
        //TODO: Fill out method and update return value
        return "";
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