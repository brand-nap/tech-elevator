package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringBitsTest {
    StringBits stringBits = new StringBits();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
    /*
     * Given a string, return a new string made of every other char starting with
     * the first, so "Hello" yields "Hlo". GetBits("Hello") → "Hlo" GetBits("Hi")
     * → "H" GetBits("Heeololeo") → "Hello"
     */
    @Test
    public void getBits_withHXEXLXLXO_shouldReturnTrue(){
        //Arrange
        String expectedResult = "Hello";
        //Act
        String actualResult = stringBits.getBits("Hxexlxlxo");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getBits_withHi_shouldReturnTrue(){
        //Arrange
        String expectedResult = "H";
        //Act
        String actualResult = stringBits.getBits("Hi");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getBits_withHello_shouldReturnTrue(){
        //Arrange
        String expectedResult = "Hlo";
        //Act
        String actualResult = stringBits.getBits("Hello");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

}
