package com.aurionpro.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.aurionpro.calculator.model.MathUtils;

public class MathUtilsTest {
	MathUtils math = new MathUtils();
	  @BeforeEach
	    void setup() {
	        System.out.println("Starting a new test...");
	    }

	    @AfterEach
	    void teardown() {
	        System.out.println("Test completed.\n");
	    }
	    @Test
	    @DisplayName("Test Addition Method")
	    void testAdd() {
	        assertEquals(8, math.add(5, 3), "Addition failed");
	    }

	    @Test
	    @DisplayName("Test Multiplication Method")
	    void testMultiply() {
	        assertEquals(15, math.multiply(5, 3));
	    }
	    @ParameterizedTest(name= "Test if {0} is even")
	    @ValueSource(ints = {2,3, 4, 6, 8, 10, 100, 0, -2, -4})
	    @DisplayName("Test isEven() Method with Multiple Values")
	    void testIsEven(int number) {
	        assertTrue(math.isEven(number), number + " should be even");
	    }
}
//🔹 Assignment 1: Math Utility Class Test
//Problem Statement:
//Create a class MathUtils with the following methods:
// int add(int a, int b)
// int multiply(int a, int b)
// boolean isEven(int number)
//Write a test class using:
// @BeforeEach and @AfterEach to log setup and teardown (i.e start and stop)
// @DisplayName for custom test method names
// Use @ParameterizedTest with @ValueSource to test isEven() for multiple values