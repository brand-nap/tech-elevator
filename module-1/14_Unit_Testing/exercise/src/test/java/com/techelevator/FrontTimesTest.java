package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FrontTimesTest {
    FrontTimes frontTimes = new FrontTimes();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
    /*
     * Given a string and a non-negative int n, we'll say that the front of the
     * string is the first 3 chars, or whatever is there if the string is less than
     * length 3. Return n copies of the front; frontTimes("Chocolate", 2) →
     * "ChoCho" frontTimes("Chocolate", 3) → "ChoChoCho" frontTimes("Abc", 3) →
     * "AbcAbcAbc"
     */

    @Test
    public void getChoChoChoCho_StrAndInt_shouldReturnTrue(){
        //Arrange
        String expectedResult = "ChoChoChoCho";
        //Act
        String actualResult = frontTimes.generateString("Chocolate", 4);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getHiHiHi_withStrLengthLessThanThree_shouldReturnTrue(){
        //Arrange
        String expectedResult = "HiHiHiHi";
        //Act
        String actualResult = frontTimes.generateString("Hi", 4);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getNothing_withNegativeInt_shouldReturnTrue(){
        //Arrange
        String expectedResult = "";
        //Act
        String actualResult = frontTimes.generateString("Hi", -1);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getChoChoCho_withNegativeInt_shouldReturnFalse(){
        //Arrange
        String expectedResult = "ChoChoCho";
        //Act
        String actualResult = frontTimes.generateString("Hi", -1);
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
    }
}
