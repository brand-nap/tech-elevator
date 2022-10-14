package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Less20Test {
    Less20 less20 = new Less20();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
    /*
         Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
         and 39 return true, but 40 returns false.
         (Hint: Think "mod".)
         less20(18) → true
         less20(19) → true
         less20(20) → false
     */
    @Test
    public void getLessThan20_withInt1Under20_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = less20.isLessThanMultipleOf20(79);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getLessThan20_withIntOver20_shouldReturnFalse(){
        //Arrange
        boolean expectedResult = false;
        //Act
        boolean actualResult = less20.isLessThanMultipleOf20(30);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getLessThan20_with20_shouldReturnFalse(){
        //Arrange
        boolean expectedResult = false;
        //Act
        boolean actualResult = less20.isLessThanMultipleOf20(1040);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
