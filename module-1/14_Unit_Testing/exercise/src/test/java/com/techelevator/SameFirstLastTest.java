package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SameFirstLastTest {
    SameFirstLast sameFirstLast = new SameFirstLast();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
    /*
     Given an array of ints, return true if the array is length 1 or more, and the first element and
     the last element are equal.
     IsItTheSame([1, 2, 3]) → false
     IsItTheSame([1, 2, 3, 1]) → true
     IsItTheSame([1, 2, 1]) → true
     */
    @Test
    public void getIsItTheSame_withMismatchedArray_shouldReturnFalse(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = sameFirstLast.isItTheSame(new int[]{1,2,3});
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
    }
    @Test
    public void getIsItTheSame_withMatchingArray_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = sameFirstLast.isItTheSame(new int[]{1,1,1});
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getIsItTheSame_withMostlyMatchingArray_shouldReturnFalse(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = sameFirstLast.isItTheSame(new int[]{1,1,1,1,3});
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
    }
}
