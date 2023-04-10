package com.kenzie.supportingmaterials;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Kenzie");
        practiceSeven();
    }

    public static void practiceOne() throws IOException {
        File jsonFile = new File("assignment.json");
        ObjectMapper objectMapper = new ObjectMapper();


        String result;

        AssignmentDTO assignment = objectMapper.readValue(jsonFile, AssignmentDTO.class);
        // AssignmentDTO assignment = objectMapper.readValue(result, AssignmentDTO);
        // AssignmentDTO assignment = objectMapper.readValue(jsonFile.toString(), new AssignmentDTO());
        // AssignmentDTO assignment = objectMapper.readValue("", AssignmentDTO.class);

        System.out.println(assignment.getName() + ": " + assignment.getGradeValue());
    }

    public static void practiceTwo() throws IOException {
        // TODO fill in the code to create a StudentDTO object
        //      from the JSON contained in "student.json"
        File jsonFile = new File("student.json");
        ObjectMapper objectMapper = new ObjectMapper();
        StudentDTO student = objectMapper.readValue(jsonFile, StudentDTO.class);

    }

    public static void practiceThree() throws IOException {
        // TODO read student data into a list from studentList.json

        // Create your File Object
        File jsonFile = new File("input.json");
        // Create an object mapper
        ObjectMapper objectMapper = new ObjectMapper();
        // Create a type reference for list of StudentDTO
        TypeReference<List<StudentDTO>> typeReferenceListStudentDTO = new TypeReference<>() {};
        List<StudentDTO> allStudentList = objectMapper.readValue(jsonFile, typeReferenceListStudentDTO);
        // Use the object mapper to read from the JSON file using the type reference

        // for loop to print
        for(StudentDTO student : allStudentList){
            System.out.println(student);
        }
            // use the student's overridden toString()

    }

    public static void practiceFour() throws IOException {
        StudentDTO newStudent = new StudentDTO();

        newStudent.setName("Einstein");
        newStudent.setCurrentlyEnrolledClassName("Java Fundamentals");
        newStudent.setTotalGrade(100);

        // TODO convert to JSON
        ObjectMapper objectMapper = new ObjectMapper();

        String studentStr= objectMapper.writeValueAsString(newStudent);
        System.out.println(studentStr);

        // Create an object mapper
        // Use the object mapper to write the value as a string
        // Print the result with system.out.println
    }

    public static void practiceFive() {
        // TODO call your HTTP Client to GET reqbin
        MyHttpClient myHttpClient = new MyHttpClient();
        String url = "https://reqbin.com/echo/get/json";
        myHttpClient.makeGETRequest(url);
    }

    public static void practiceSix() {
        // TODO call your HTTP Client to PUT reqbin
        MyHttpClient myHttpClient = new MyHttpClient();
        String url = "https://reqbin.com/echo/put/json";
        String testJson = "{\"key\" : \"message to send\"}";

        myHttpClient.makePUTRequest(url, testJson);
    }

    public static void practiceSeven() throws JsonProcessingException {
        // TODO call your HTTP Client for bitcoin converter
        String GET_URL = "https://api.coinbase.com/v2/prices/BTC-USD/buy";


        // Create your client
        MyHttpClient myHttpClient = new MyHttpClient();
        // Pass in the URL
        myHttpClient.makeGETRequest(GET_URL);
        // Save the response
        String jsonString = myHttpClient.makeGETRequest(GET_URL);
        // Use the object mapper to create instances of CurrencyDTO
        ObjectMapper objectMapper = new ObjectMapper();
        CurrencyDTO currency = objectMapper.readValue(jsonString, CurrencyDTO.class);

        // Print! Either override toString or do it here
        System.out.println(currency);
    }
}