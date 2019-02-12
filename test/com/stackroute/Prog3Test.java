package com.stackroute;

import static org.junit.Assert.*;

import org.junit.*;

public class Prog3Test {
    Prog3 app;

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
        app = new Prog3();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "consonant";
        //Act
        String actualValue = app.check("q");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

        //Arrange
        String expectedValue1 = "vowel";
        //Act
        String actualValue1 = app.check("a");
        //Assert
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);

        //Arrange
        String expectedValue3 = "vowel consonant";
        //Act
        String actualValue3 = app.check("aq");
        //Assert
        assertEquals(expectedValue3, actualValue3);
        assertNotNull(actualValue3);
    }
}
