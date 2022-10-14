package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lucky13Test {
    Lucky13 lucky13 = new Lucky13();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
    /*
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     * GetLucky([0, 2, 4]) → true GetLucky([1, 2, 3]) → false GetLucky([1, 2,
     * 4]) → false
     */
    @Test
    public void getLucky13_withLuckyArray_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = lucky13.getLucky(new int[]{0, 2, 4, 34, 54, 129348});
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getLucky13_withArrayContaining1_shouldReturnFalse(){
        //Arrange
        boolean expectedResult = false;
        //Act
        boolean actualResult = lucky13.getLucky(new int[]{0, 2, 4, 34, 1, 129348});
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getLucky13_withArrayContaining3_shouldReturnFalse(){
        //Arrange
        boolean expectedResult = false;
        //Act
        boolean actualResult = lucky13.getLucky(new int[]{0, 2, 4, 3, 54, 129348});
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
