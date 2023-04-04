package com.kenzie.app;

import com.kenzie.app.Application;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicationTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @BeforeEach
    public void setTestInput() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void runMain_CorrectOutPut(){
        runMain();
        String output = outContent.toString();

        assertThat(output, containsString("Apple"));
        assertThat(output, containsString("Apricot"));
        assertThat(output, containsString("Banana"));
        assertThat(output, containsString("Blueberry"));
        assertThat(output, containsString("Durian"));
        assertThat(output, containsString("Grape"));
        assertThat(output, containsString("Guava"));
        assertThat(output, containsString("Lemon"));
        assertThat(output, containsString("Lime"));
        assertThat(output, containsString("Mango"));
        assertThat(output, containsString("Melon"));
        assertThat(output, containsString("Orange"));
        assertThat(output, containsString("Papaya"));
        assertThat(output, containsString("Pear"));
        assertThat(output, containsString("Persimmon"));
        assertThat(output, containsString("Pineapple"));
        assertThat(output, containsString("Raspberry"));
        assertThat(output, containsString("Strawberry"));
        assertThat(output, containsString("Tomato"));
        assertThat(output, containsString("Watermelon"));

        assertEquals(2, countOccurrences(output, "Tomato"));
        assertEquals(2, countOccurrences(output, "Apricot"));
        assertEquals(2, countOccurrences(output, "Durian"));

    }

    private static void runMain() {
        try {
            Application.main(new String[]{});
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int countOccurrences(String str, String word)
    {
        // split the string by spaces in a
        String a[] = str.split("'");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }
}