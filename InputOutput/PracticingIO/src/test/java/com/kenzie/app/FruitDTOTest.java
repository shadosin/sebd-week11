package com.kenzie.app;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FruitDTOTest {

    private static final String FRUITDTO_CLASSNAME = "FruitDTO";

    private static final String FRUITDTO_NUTRITIONS_CLASSNAME = "FruitDTO Nutritions";
    private static final String TEST_GENUS = "Fragaria";
    private static final String TEST_NAME = "Strawberry";
    private static final int TEST_ID = 1;
    private static final String TEST_FAMILY = "Rosaceae";
    private static final String TEST_ORDER = "Rosales";

    private static final double TEST_CARBOHYDRATES = 15.3;
    private static final double TEST_PROTEIN = 3.2;
    private static final double TEST_FAT = 3.1;
    private static final double TEST_CALORIES = 100.7;
    private static final double TEST_SUGAR = 12.9;

    Object [] FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES = {};

    Class<?> [] FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES = {};

    @Order(1)
    @Test
    void fruitDTOClass_genus_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "genus";

        try {
            getFieldValueInFruitDTOClassUsingReflection(fieldNameToFind, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = FruitDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(2)
    @Test
    void fruitDTOClass_nutritions_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "nutritions";

        try {
            getFieldValueInFruitDTOClassUsingReflection(fieldNameToFind, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = FruitDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(3)
    @Test
    void fruitDTOClass_order_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "order";

        try {
            getFieldValueInFruitDTOClassUsingReflection(fieldNameToFind, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = FruitDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(4)
    @Test
    void fruitDTOClass_family_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "family";

        try {
            getFieldValueInFruitDTOClassUsingReflection(fieldNameToFind, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = FruitDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(5)
    @Test
    void fruitDTOClass_id_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "id";

        try {
            getFieldValueInFruitDTOClassUsingReflection(fieldNameToFind, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = FruitDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(6)
    @Test
    void fruitDTOClass_name_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "name";

        try {
            getFieldValueInFruitDTOClassUsingReflection(fieldNameToFind, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_VALUES, FRUITDTO_CLASS_ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            Field classMemberField = FruitDTO.class.getDeclaredField(fieldNameToFind);
            assertTrue(classMemberField.isAnnotationPresent(JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(7)
    @Test
    void fruitDTOClassNutritions_sugar_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "sugar";
        try {
            assertTrue(doesObjectContainFieldAndAnnotation(fieldNameToFind, JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_NUTRITIONS_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(8)
    @Test
    void fruitDTOClassNutritions_calories_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "calories";

        try {
            assertTrue(doesObjectContainFieldAndAnnotation(fieldNameToFind, JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_NUTRITIONS_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(9)
    @Test
    void fruitDTOClassNutritions_fat_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "fat";

        try {
            assertTrue(doesObjectContainFieldAndAnnotation(fieldNameToFind, JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_NUTRITIONS_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(10)
    @Test
    void fruitDTOClassNutritions_protein_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "protein";

        try {
            assertTrue(doesObjectContainFieldAndAnnotation(fieldNameToFind, JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_NUTRITIONS_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(11)
    @Test
    void fruitDTOClassNutritions_carbohydrates_Field_AndHasCorrectAnnotation_Test() {
        String fieldNameToFind = "carbohydrates";

        try {
            assertTrue(doesObjectContainFieldAndAnnotation(fieldNameToFind, JsonProperty.class), "Please double check you have the correct Json Annotation above the field: " + fieldNameToFind);
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + " in the " + FRUITDTO_NUTRITIONS_CLASSNAME + " class that has the correct annotation.");
        }
    }

    @Order(12)
    @Test
    public void fruitDTOClass_hasAll_gettersAndSettersTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        FruitDTO fruitInstance = new FruitDTO();

        Method setGenusMethod = FruitDTO.class.getMethod("setGenus", String.class);
        setGenusMethod.invoke(fruitInstance, TEST_GENUS);

        Method setNameMethod = FruitDTO.class.getMethod("setName", String.class);
        setNameMethod.invoke(fruitInstance, TEST_NAME);

        Method setIdMethod = FruitDTO.class.getMethod("setId", int.class);
        setIdMethod.invoke(fruitInstance, TEST_ID);

        Method setFamilyMethod = FruitDTO.class.getMethod("setFamily", String.class);
        setFamilyMethod.invoke(fruitInstance, TEST_FAMILY);

        Method setOrderMethod = FruitDTO.class.getMethod("setOrder", String.class);
        setOrderMethod.invoke(fruitInstance, TEST_ORDER);


        Method getGenusMethod = FruitDTO.class.getMethod("getGenus");
        String genusValue = (String) getGenusMethod.invoke(fruitInstance);
        assertEquals(TEST_GENUS, genusValue, "Can set/get genus");

        Method getNameMethod = FruitDTO.class.getMethod("getName");
        String nameValue = (String) getNameMethod.invoke(fruitInstance);
        assertEquals(TEST_NAME, nameValue, "Can set/get name");

        Method getIdMethod = FruitDTO.class.getMethod("getId");
        int idValue = (Integer) getIdMethod.invoke(fruitInstance);
        assertEquals(TEST_ID, idValue, "Can set/get id");

        Method getFamilyMethod = FruitDTO.class.getMethod("getFamily");
        String familyValue = (String) getFamilyMethod.invoke(fruitInstance);
        assertEquals(TEST_FAMILY, familyValue, "Can set/get family");

        Method getOrderMethod = FruitDTO.class.getMethod("getOrder");
        String orderValue = (String) getOrderMethod.invoke(fruitInstance);
        assertEquals(TEST_ORDER, orderValue, "Can set/get order");


    }

    @Order(13)
    @Test
    public void fruitDTONutritionsClass_hasAll_gettersAndSettersTest() throws Exception {
        Class<FruitDTO> oc = null;
        Class<?> nutritionsInstance = null;
        Constructor<?> con = null;
        Object i = null;

        try {
            nutritionsInstance = Class.forName("com.kenzie.app.Nutritions");
            i = nutritionsInstance.getConstructor().newInstance();
        }
        catch(Exception e) {
            try {
                oc = FruitDTO.class;
                nutritionsInstance = Class.forName("com.kenzie.app.FruitDTO$Nutritions");
                con = nutritionsInstance.getConstructors()[0];

                i = (Object) con.newInstance(oc.newInstance());
            } catch (Exception e2){
                assertTrue(false, "Be sure that Nutritions is its own file");
            }
        }

        Method setCarbohydratesMethod = nutritionsInstance.getDeclaredMethod("setCarbohydrates", double.class);
        setCarbohydratesMethod.invoke(i, TEST_CARBOHYDRATES);

        Method setProteinMethod = nutritionsInstance.getMethod("setProtein", double.class);
        setProteinMethod.invoke(i, TEST_PROTEIN);

        Method setFatMethod = nutritionsInstance.getMethod("setFat", double.class);
        setFatMethod.invoke(i, TEST_FAT);

        Method setCaloriesMethod = nutritionsInstance.getMethod("setCalories", double.class);
        setCaloriesMethod.invoke(i, TEST_CALORIES);

        Method setSugarMethod = nutritionsInstance.getMethod("setSugar", double.class);
        setSugarMethod.invoke(i, TEST_SUGAR);

        Method getCarbohydratesMethod = nutritionsInstance.getMethod("getCarbohydrates");
        Double carbohydratesValue = (Double) getCarbohydratesMethod.invoke(i);
        assertEquals(TEST_CARBOHYDRATES, carbohydratesValue, "Can set/get carbohydrates");

        Method getProteinMethod = nutritionsInstance.getMethod("getProtein");
        Double proteinValue = (Double) getProteinMethod.invoke(i);
        assertEquals(TEST_PROTEIN, proteinValue, "Can set/get protein");

        Method getFatMethod = nutritionsInstance.getMethod("getFat");
        Double fatValue = (Double) getFatMethod.invoke(i);
        assertEquals(TEST_FAT, fatValue, "Can set/get fat");

        Method getCaloriesMethod = nutritionsInstance.getMethod("getCalories");
        Double caloriesValue = (Double) getCaloriesMethod.invoke(i);
        assertEquals(TEST_CALORIES, caloriesValue, "Can set/get calories");

        Method getSugarMethod = nutritionsInstance.getMethod("getSugar");
        Double sugarValue = (Double) getSugarMethod.invoke(i);
        assertEquals(TEST_SUGAR, sugarValue, "Can set/get sugar");

    }

    private String getFieldValueInFruitDTOClassUsingReflection(String variableName, Object[] params, Class<?> [] paramTypes) {
        try {
            Class<FruitDTO> myClass = FruitDTO.class;

            Constructor constructor = myClass.getConstructor(paramTypes);
            FruitDTO fruitDTO = (FruitDTO) constructor.newInstance(params);

            Field field = myClass.getDeclaredField(variableName);
            Object fieldType = field.getType();

            field.setAccessible(true);
            if (field.get(fruitDTO) == null){
                return "";
            }
            return field.get(fruitDTO).toString();

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

    public boolean doesObjectContainFieldAndAnnotation(String fieldName, Class annotationClass) throws Exception {
        Class<?> objectClass = getNutritionsClassFromSubclassOrSeparateClass();
        Field[] fields = objectClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equals(fieldName) && field.isAnnotationPresent(annotationClass)) {
                return true;
            }
        }
        return false;
    }

    private String getNutritionsClassPathFromSubclassOrSeparateClass() throws Exception {
        try {
            Class<?> classRetrieved = Class.forName("com.kenzie.app.Nutritions");
            return "com.kenzie.app.Nutritions";
        }
        catch(Exception e1){

            try {
                Class<?> classRetrieved = Class.forName("com.kenzie.app.Nutrition");
                return "com.kenzie.app.Nutrition";
            }
            catch(Exception e2) {
                return "com.kenzie.app.FruitDTO$Nutritions";
            }
        }


    }

    private Class<?> getNutritionsClassFromSubclassOrSeparateClass() throws Exception {

        Class<?> classRetrieved = null;
        String classPath = getNutritionsClassPathFromSubclassOrSeparateClass();

        try {
            try {
                classRetrieved = Class.forName(classPath);
            }
            catch(Exception e) {

                if(classRetrieved == null) {
                    classRetrieved = Class.forName("com.kenzie.app.FruitDTO");
                }

                if(classRetrieved != null) {
                    Class[] innerClasses = classRetrieved.getDeclaredClasses();
                    for(Class c : innerClasses) {
                        String subclassName = c.getName();
                        if(subclassName == "com.kenzie.app.FruitDTO$Nutritions") {
                            return c;
                        }
                    }
                }
            }
        }
        catch(Exception e1){
            throw new NoSuchElementException("The class Nutritions class has not been created yet. Please ensure you have created the appropriate classes per the assingment instructions before continuing.");
        }

        return classRetrieved;
    }
}
