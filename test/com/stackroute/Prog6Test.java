package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Prog6Test {
    Prog6 app;

    @BeforeClass
    public static void setUpOnce() {
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce() {
        System.out.println("Inside teardown once");

    }

    @Before
    public void setUp() {
        System.out.println("Inside setup");
        app = new Prog6();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "Small letter";
        //Act
        String actualValue = app.check('a');
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test1() throws Exception {
        //Arrange
        String expectedValue1 = "Capital letter";
        //Act
        String actualValue1 = app.check('A');
        //Assert
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }

    @Test
    public void test2() throws Exception {
        //Arrange
        String expectedValue2 = "Digit";
        //Act
        String actualValue2 = app.check('1');
        //Assert
        assertEquals(expectedValue2, actualValue2);
        assertNotNull(actualValue2);
    }

    @Test
    public void test3() throws Exception {
        //Arrange
        String expectedValue3 = "Special symbol";
        //Act
        String actualValue3 = app.check('$');
        //Assert
        assertEquals(expectedValue3, actualValue3);
        assertNotNull(actualValue3);
    }
}