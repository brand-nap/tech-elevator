package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MaxEnd3Test {
    MaxEnd3 maxEnd3 = new MaxEnd3();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }

    /*
     Given an array of ints length 3, figure out which is larger between the first and last elements
     in the array, and set all the other elements to be that value. Return the changed array.
     MakeArray([1, 2, 3]) → [3, 3, 3]
     MakeArray([11, 5, 9]) → [11, 11, 11]
     MakeArray([2, 11, 3]) → [3, 3, 3]
     */

    @Test
    public void getMaxEnd3_withBigIntFirst_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        int[] expectedArray = new int[] {3,3,3,3};
        for(int i : expectedArray){
            expectedResult = (i==3) ? expectedResult : false;
        }
        //Act
        boolean actualResult = true;
        int[] actualArray = maxEnd3.makeArray(new int[] {3, 1, 0, 2});
        for(int i : actualArray){
            actualResult = (i==3) ? actualResult : false;
        }
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getMaxEnd3_withBigIntLast_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        int[] expectedArray = new int[] {3,3,3,3};
        for(int i : expectedArray){
            expectedResult = (i==3) ? expectedResult : false;
        }
        //Act
        boolean actualResult = true;
        int[] actualArray = maxEnd3.makeArray(new int[] {2, 1, 0, 3});
        for(int i : actualArray){
            actualResult = (i==3) ? actualResult : false;
        }
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getMaxEnd3_withBigIntMiddle_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        int[] expectedArray = new int[] {3,3,3,3};
        for(int i : expectedArray){
            expectedResult = (i==3) ? expectedResult : false;
        }
        //Act
        boolean actualResult = true;
        int[] actualArray = maxEnd3.makeArray(new int[] {3, 11, 0, 2});
        for(int i : actualArray){
            actualResult = (i==3) ? actualResult : false;
        }
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
