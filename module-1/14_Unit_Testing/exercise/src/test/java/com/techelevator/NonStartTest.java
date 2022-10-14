package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NonStartTest {
    NonStart nonStart = new NonStart();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
    /*
     Given 2 strings, return their concatenation, except omit the first char of each. The strings will
     be at least length 1.
     GetPartialString("Hello", "There") → "ellohere"
     GetPartialString("java", "code") → "avaode"
     GetPartialString("shotl", "java") → "hotlava"
     */
    @Test
    public void getNonStart_withHelloThere_shouldReturnTrue(){
        //Arrange
        String expectedResult = "ellohere";
        //Act
        String actualResult = nonStart.getPartialString("Hello","There");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getNonStart_withJavaCode_shouldReturnTrue(){
        //Arrange
        String expectedResult = "avaode";
        //Act
        String actualResult = nonStart.getPartialString("java","code");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getNonStart_withShotlJava_shouldReturnTrue(){
        //Arrange
        String expectedResult = "hotlava";
        //Act
        String actualResult = nonStart.getPartialString("shotl","java");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
