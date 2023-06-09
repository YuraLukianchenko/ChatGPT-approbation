package com.gpttest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyTest {

        private static int setupCounter;

        @BeforeAll
        static void setUpAll() {
            // Perform the setup that applies to all parameterized tests
            setupCounter = 10;
            System.out.println("BeforeAll");
        }

        MyTest() {
            System.out.println("Constructor");
        }

        @ParameterizedTest
        @ValueSource(ints = {1, 2, 3})
        void parameterizedTest(int value) {
            // Perform the test
            System.out.println(" i = " + value);

            int result = value + setupCounter;

            // Assertion
            assertEquals(value + 10, result);
        }

        @Test
        void anotherTest() {
            System.out.println("test");
        }

}
