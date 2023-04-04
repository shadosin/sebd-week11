package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.lang.reflect.*;


public class ApplicationTest {
    private MockWebServer mockWebServer;

    public static final String TEST_ENDPOINT = "http://www.boredapi.com/api/activity";
    public static final String TEST_ACTIVITY = "Try a food you don't like";
    public static final String TEST_TYPE = "social";
    public static final String TEST_KEY = "6693574";
    public static final String TEST_TYPE_TWO = "recreational";
    public static final String TEST_KEY_TWO = "6693575";
    public static final String TEST_LINK = "http://www.w3schools.com/java/";
    public static final String TEST_KEY_RESPONSE = "{\"activity\":\"Try a food you don't like\",\"type\":\"recreational\",\"participants\":1,\"price\":0.1,\"link\":\"\",\"key\":\"6693574\",\"accessibility\":0.05}";
    public static final String TEST_FORMAT_URL = "http://www.boredapi.com/api/activity?social=6693574";
    public static final String TEST_FORMAT_URL_TWO = "http://www.boredapi.com/api/activity?social=6693574&recreational=6693575";
    public static final double TEST_PRICE = 0.1;
    public static final double TEST_ACCESSIBILITY = 1.0;
    public static final int TEST_PARTICIPANTS = 1;
    public static final String TEST_FORMATTED_ACTIVITY = "Activity: Try a food you don't like\n" +
            "Type: recreational\n" +
            "Participants: 1\n" +
            "Price: 0.1\n";

    Object [] ACTIVITYDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES = {};

    Class<?> [] ACTIVITYDTO__CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES = {};

    private static final String CLASSNAME = "ActivityDTO";


    @BeforeEach
    void init() throws IOException {
        this.mockWebServer = new MockWebServer();
        this.mockWebServer.start();
    }

    @Order(1)
    @Test
    void activityDTOClass_accessibility_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "accessibility";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, ACTIVITYDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, ACTIVITYDTO__CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = ActivityDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(2)
    @Test
    void activityDTOClass_key_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "key";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, ACTIVITYDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, ACTIVITYDTO__CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = ActivityDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(3)
    @Test
    void activityDTOClass_link_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "link";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, ACTIVITYDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, ACTIVITYDTO__CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = ActivityDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(4)
    @Test
    void activityDTOClass_price_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "price";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, ACTIVITYDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, ACTIVITYDTO__CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = ActivityDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(5)
    @Test
    void activityDTOClass_participants_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "participants";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, ACTIVITYDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, ACTIVITYDTO__CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = ActivityDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(6)
    @Test
    void activityDTOClass_type_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "type";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, ACTIVITYDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, ACTIVITYDTO__CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = ActivityDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(7)
    @Test
    void activityDTOClass_activity_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "activity";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, ACTIVITYDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, ACTIVITYDTO__CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = ActivityDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + CLASSNAME + " class that has the correct annotation.");
        }
    }


    @Order(18)
    @Test
    void activityDTOClass_has_OverridentoStringMethod_Test() {
        try {
            assertTrue(doesClassContainOverriddenStringMethod(ActivityDTO.class));
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have overridden the toString() method in your " + CLASSNAME);
        }
    }

    @Order(19)
    @Test
    void canCreateActivity() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        try{
            //check that required methods are defined
            ActivityDTO activityInstance = new ActivityDTO();

            Method setActivityMethod = ActivityDTO.class.getMethod("setActivity",String.class);
            setActivityMethod.invoke(activityInstance, TEST_ACTIVITY);

            Method setTypeMethod = ActivityDTO.class.getMethod("setType",String.class);
            setTypeMethod.invoke(activityInstance, TEST_TYPE);
            Method setKeyMethod = ActivityDTO.class.getMethod("setKey",String.class);
            setKeyMethod.invoke(activityInstance, TEST_KEY);
            Method setLinkMethod = ActivityDTO.class.getMethod("setLink",String.class);
            setLinkMethod.invoke(activityInstance, TEST_LINK);
            Method setParticipantsMethod = ActivityDTO.class.getMethod("setParticipants",int.class);
            setParticipantsMethod.invoke(activityInstance, TEST_PARTICIPANTS);
            Method setAccessibilityMethod = ActivityDTO.class.getMethod("setAccessibility",double.class);
            setAccessibilityMethod.invoke(activityInstance, TEST_ACCESSIBILITY);
            Method setPriceMethod = ActivityDTO.class.getMethod("setPrice",double.class);
            setPriceMethod.invoke(activityInstance, TEST_PRICE);

            Method getActivityMethod = ActivityDTO.class.getMethod("getActivity");
            String activityValue = (String) getActivityMethod.invoke(activityInstance);
            assertEquals(TEST_ACTIVITY, activityValue, "Can set/get activity");

            Method getTypeMethod = ActivityDTO.class.getMethod("getType");
            String typeValue = (String) getTypeMethod.invoke(activityInstance);
            assertEquals(TEST_TYPE, typeValue, "Can set/get type");

            Method getKeyMethod = ActivityDTO.class.getMethod("getKey");
            String keyValue = (String) getKeyMethod.invoke(activityInstance);
            assertEquals(TEST_KEY, keyValue, "Can set/get key");

            Method getLinkMethod = ActivityDTO.class.getMethod("getLink");
            String linkValue = (String) getLinkMethod.invoke(activityInstance);
            assertEquals(TEST_LINK, linkValue, "Can set/get link");

            Method getParticipantsMethod = ActivityDTO.class.getMethod("getParticipants");
            int participantsValue = (int) getParticipantsMethod.invoke(activityInstance);
            assertEquals(TEST_PARTICIPANTS, participantsValue, "Can set/get Participants");

            Method getAccessibilityMethod = ActivityDTO.class.getMethod("getAccessibility");
            double accessibilityValue = (double) getAccessibilityMethod.invoke(activityInstance);
            assertEquals(TEST_ACCESSIBILITY, accessibilityValue, "Can set/get Accessibility");

            Method getPriceMethod = ActivityDTO.class.getMethod("getPrice");
            double priceValue = (double) getPriceMethod.invoke(activityInstance);
            assertEquals(TEST_PRICE, priceValue, "Can set/get Price");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            fail("ActivityDTO and all setter/getter methods must be defined");
        }

    }

    @Order(20)
    @Test
    void canFormatURL_OnePropertyAndValue(){
        try{
            assertEquals(TEST_FORMAT_URL, Application.formatURL(TEST_ENDPOINT, TEST_TYPE, TEST_KEY));
        }
        catch(Exception e) {
            fail("Exception " + e.getMessage());
        }
    }

    @Order(21)
    @Test
    void canFormatURL_TwoPropertiesAndValues(){
        try{
            assertEquals(TEST_FORMAT_URL_TWO, Application.formatURL(TEST_ENDPOINT, TEST_TYPE, TEST_KEY, TEST_TYPE_TWO, TEST_KEY_TWO));
        }
        catch(Exception e) {
            fail("Exception " + e.getMessage());
        }
    }

    @Order(22)
    @Test
    void canGetURLResponse() {
        try {
            mockWebServer.enqueue(new MockResponse()
                    .addHeader("Content-Type", "application/json")
                    .setBody(TEST_KEY_RESPONSE)
                    .setResponseCode(200));
            assertEquals(TEST_KEY_RESPONSE, Application.getURLResponse(mockWebServer.url("/").toString()), "Send GET to URL and receive JSON response");
        }
        catch (Exception e) {
            fail("Exception " + e.getMessage());
        }
    }

    @Order(23)
    @Test
    void canMapActivity() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            //convert json string to object
            ActivityDTO activity = objectMapper.readValue(TEST_KEY_RESPONSE, ActivityDTO.class);
            assertTrue(activity instanceof ActivityDTO, "Initialized ActivityDTO based on JSON");
            Method getActivityMethod = ActivityDTO.class.getMethod("getActivity");
            String activityValue = (String) getActivityMethod.invoke(activity);
            assertTrue(activityValue instanceof String);
        }
        catch (Exception e) {
            fail("Exception " + e);
        }
    }

    @Order(24)
    @Test
    void canGetActivityType() {
        try {

            mockWebServer.enqueue(new MockResponse()
                    .addHeader("Content-Type", "application/json")
                    .setBody(TEST_KEY_RESPONSE)
                    .setResponseCode(200));
            String response = Application.getActivityType(mockWebServer.url(TEST_ENDPOINT).toString(),TEST_TYPE_TWO);

            ObjectMapper objectMapper = new ObjectMapper();
            //convert json string to object
            ActivityDTO activity = objectMapper.readValue(response, ActivityDTO.class);
            Method getTypeMethod = ActivityDTO.class.getMethod("getType");
            String typeValue = (String) getTypeMethod.invoke(activity);
            assertEquals(TEST_TYPE_TWO, typeValue, "Get activity by type");
        }
        catch (Exception e) {
            fail("Exception " + e);
        }
    }

    @Order(25)
    @Test
    void canGetActivityWithPrice() {
        try {
            mockWebServer.enqueue(new MockResponse()
                    .addHeader("Content-Type", "application/json")
                    .setBody(TEST_KEY_RESPONSE)
                    .setResponseCode(200));
            String response = Application.getActivityWithPrice(mockWebServer.url(TEST_ENDPOINT).toString(),TEST_PRICE);

            ObjectMapper objectMapper = new ObjectMapper();
            //convert json string to object
            ActivityDTO activity = objectMapper.readValue(response, ActivityDTO.class);
            Method getPriceMethod = ActivityDTO.class.getMethod("getPrice");
            double priceValue = (double) getPriceMethod.invoke(activity);
            assertEquals(TEST_PRICE, priceValue, "Get activity by price");

        }
        catch (Exception e) {
            fail("Exception " + e);
        }
    }

    @Order(26)
    @Test
    void canGetActivityTypeForGroup() {
        try {
            mockWebServer.enqueue(new MockResponse()
                    .addHeader("Content-Type", "application/json")
                    .setBody(TEST_KEY_RESPONSE)
                    .setResponseCode(200));

            String response = Application.getActivityTypeForGroup(mockWebServer.url(TEST_ENDPOINT).toString(),TEST_TYPE_TWO,TEST_PARTICIPANTS);

            ObjectMapper objectMapper = new ObjectMapper();
            //convert json string to object
            ActivityDTO activity = objectMapper.readValue(response, ActivityDTO.class);
            Method getTypeMethod = ActivityDTO.class.getMethod("getType");
            String typeValue = (String) getTypeMethod.invoke(activity);
            assertEquals(TEST_TYPE_TWO, typeValue, "Get activity by type");

            Method getParticipantsMethod = ActivityDTO.class.getMethod("getParticipants");
            int participantsValue = (int) getParticipantsMethod.invoke(activity);
            assertEquals(TEST_PARTICIPANTS, participantsValue, "Get activity by participants");
        }
        catch (Exception e) {
            fail("Exception " + e);
        }
    }

    @Order(27)
    @Test
    void canFormatActivityOutput() {
        try {
            String formattedJson = Application.formatActivityOutput(TEST_KEY_RESPONSE);
            assertEquals(TEST_FORMATTED_ACTIVITY, formattedJson,"Parse activity from JSON");
        }
        catch (Exception e) {
            fail("Exception " + e);
        }
    }

    public static boolean doesClassContainOverriddenStringMethod(Class<?> classToCheck) {
        Method m;
        try {
            m = classToCheck.getMethod("toString");
        } catch (NoSuchMethodException e) {
            // Can't be thrown since every class has a toString method through Object
            return false;
        }
        return (m.getDeclaringClass() != Object.class);
    }

    private String getFieldValueInClassUsingReflection(String variableName, Object[] params, Class<?> [] paramTypes) {
        try {
            Class<ActivityDTO> myClass = ActivityDTO.class;

            Constructor constructor = myClass.getConstructor(paramTypes);
            ActivityDTO activityDTO = (ActivityDTO) constructor.newInstance(params);

            Field field = myClass.getDeclaredField(variableName);
            Object fieldType = field.getType();

            field.setAccessible(true);
            if (field.get(activityDTO) == null){
                return "";
            }
            return field.get(activityDTO).toString();

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}