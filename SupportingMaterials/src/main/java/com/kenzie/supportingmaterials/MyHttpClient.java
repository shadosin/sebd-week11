package com.kenzie.supportingmaterials;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class MyHttpClient {
    public String makeGETRequest(String url){

        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(url);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();
        try{
            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            if (statusCode == 200){
                return httpResponse.body();
            }else{
                return String.format("GET request failed: %d status code received", statusCode);
            }
        }catch(IOException | InterruptedException e){
            return e.getMessage();
        }

    }
    public String makePUTRequest(String url, String requestBody){
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(url);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        try{
            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            if(statusCode == 201 || statusCode == 202){
                return httpResponse.body();
            }else{
                return String.format("Put request failed: %d status code received", statusCode);
            }
        }catch(IOException | InterruptedException e){
            return e.getMessage();
        }
    }
}
