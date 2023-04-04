package com.kenzie.supportingmaterials;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Kenzie");
    }

    public static void practiceOne() throws IOException {
        File jsonFile = new File("assignment.json");
        ObjectMapper objectMapper = new ObjectMapper();

        AssignmentDTO assignment = null;
        String result;

        // AssignmentDTO assignment = objectMapper.readValue(jsonFile, AssignmentDTO.class);
        // AssignmentDTO assignment = objectMapper.readValue(result, AssignmentDTO);
        // AssignmentDTO assignment = objectMapper.readValue(jsonFile.toString(), new AssignmentDTO());
        // AssignmentDTO assignment = objectMapper.readValue("", AssignmentDTO.class);

        System.out.println(assignment.getName() + ": " + assignment.getGradeValue());
    }

    public static void practiceTwo() throws IOException {
        // TODO fill in the code to create a StudentDTO object
        //      from the JSON contained in "student.json"

    }

    public static void practiceThree() throws IOException {
        // TODO read student data into a list from studentList.json

        // Create your File Object

        // Create an object mapper

        // Create a type reference for list of StudentDTO

        // Use the object mapper to read from the JSON file using the type reference

        // for loop to print
            // use the student's overridden toString()

    }

    public static void practiceFour() throws IOException {
        StudentDTO newStudent = new StudentDTO();

        newStudent.setName("Einstein");
        newStudent.setCurrentlyEnrolledClassName("Java Fundamentals");
        newStudent.setTotalGrade(100);

        // TODO convert to JSON

        // Create an object mapper
        // Use the object mapper to write the value as a string
        // Print the result with system.out.println
    }

    public static void practiceFive() {
        // TODO call your HTTP Client to GET reqbin
    }

    public static void practiceSix() {
        // TODO call your HTTP Client to PUT reqbin
    }

    public static void practiceSeven() {
        // TODO call your HTTP Client for bitcoin converter
        String GET_URL = "https://api.coinbase.com/v2/prices/BTC-USD/buy";


        // Create your client
        // Pass in the URL
        // Save the response
        // Use the object mapper to create instances of CurrencyDTO
        // Print! Either override toString or do it here
    }
}