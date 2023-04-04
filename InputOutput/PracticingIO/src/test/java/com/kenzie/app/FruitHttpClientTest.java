package com.kenzie.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.util.List;

public class FruitHttpClientTest {
    private MockWebServer mockWebServer;

    private static String PUT_FRUITS_SUCCESS = "{\"success\":\"The fruit sent will be reviewed and eventually be added to the database!\"}";

    private static String ALL_FRUITS_RESPONSE = "[{\n" +
            "    \"genus\": \"Malus\",\n" +
            "    \"name\": \"Apple\",\n" +
            "    \"id\": 6,\n" +
            "    \"family\": \"Rosaceae\",\n" +
            "    \"order\": \"Rosales\",\n" +
            "    \"nutritions\": {\n" +
            "        \"carbohydrates\": 11.4,\n" +
            "        \"protein\": 0.3,\n" +
            "        \"fat\": 0.4,\n" +
            "        \"calories\": 52,\n" +
            "        \"sugar\": 10.3\n" +
            "    }\n" +
            "}]";

    private static String URL_ALL = "/api/fruit/all";
    private static String URL_CARB = "carbohydrates?";
    private static String URL_LOW = "max=5";
    private static String URL_CAL = "calories?";
    private static String URL_HIGH = "min=100";

    @BeforeEach
    void init() throws IOException {
        this.mockWebServer = new MockWebServer();
        this.mockWebServer.start();
    }

    @Test
    public void getDesiredURLTest_All(){
        assertTrue(FruitHttpClient.getDesiredURL(FruitCriteria.ALL).contains(URL_ALL));

    }

    @Test
    public void getDesiredURLTest_LowCarb(){
        assertTrue(FruitHttpClient.getDesiredURL(FruitCriteria.LOW_CARB).contains(URL_CARB));
        assertTrue(FruitHttpClient.getDesiredURL(FruitCriteria.LOW_CARB).contains(URL_LOW));
    }

    @Test
    public void getDesiredURLTest_HighCal(){
        assertTrue(FruitHttpClient.getDesiredURL(FruitCriteria.HIGH_CALORIE).contains(URL_CAL));
        assertTrue(FruitHttpClient.getDesiredURL(FruitCriteria.HIGH_CALORIE).contains(URL_HIGH));
    }

    @Test
    public void getFruitsTest() {
        try{
            this.mockWebServer.enqueue(new MockResponse()
                    .addHeader("Content-Type", "application/json")
                    .setBody(ALL_FRUITS_RESPONSE)
                    .setResponseCode(200));

            FruitHttpClient restClient = new FruitHttpClient();

            String result = restClient.getFruits(this.mockWebServer.url("/").toString());

            assertEquals(ALL_FRUITS_RESPONSE, result);
        }
        catch (Exception e){
            fail(e.getMessage());
        }

    }

    @Test
    public void getFruitsListTest(){
        try {
            List<FruitDTO> list = FruitHttpClient.getFruitsList(ALL_FRUITS_RESPONSE);
            assertEquals(1, list.size());

            FruitDTO apple = list.get(0);
            assertTrue(apple instanceof FruitDTO);
        }
        catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Test
    public void putFruitTest() {
        try{
            String fruitDTOJSON = "{\n" +
                    "  \"genus\" : \"Fragaria\",\n" +
                    "  \"name\" : \"Strawberry\",\n" +
                    "  \"id\" : 1,\n" +
                    "  \"family\" : \"Rosaceae\",\n" +
                    "  \"order\" : \"Rosales\",\n" +
                    "  \"nutritions\" : {\n" +
                    "    \"carbohydrates\" : 15.3,\n" +
                    "    \"protein\" : 3.2,\n" +
                    "    \"fat\" : 3.1,\n" +
                    "    \"calories\" : 100.7,\n" +
                    "    \"sugar\" : 12.9\n" +
                    "  }\n" +
                    "}";
            this.mockWebServer.enqueue(new MockResponse()
                    .addHeader("Content-Type", "application/json")
                    .setBody(PUT_FRUITS_SUCCESS)
                    .setResponseCode(202));

            FruitHttpClient restClient = new FruitHttpClient();

            String result = restClient.putFruit(fruitDTOJSON, this.mockWebServer.url("/").toString());

            assertEquals(PUT_FRUITS_SUCCESS, result);
        }
        catch (Exception e){
            fail(e.getMessage());
        }
    }


}
