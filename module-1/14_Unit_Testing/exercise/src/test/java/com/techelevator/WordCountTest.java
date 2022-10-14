package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WordCountTest {
    WordCount wordCount = new WordCount();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
    /*
     * Given an array of strings, return a Map<String, Integer> with a key for
     * each different string, with the value the number of times that string appears
     * in the array.
     *
     * ** A CLASSIC **
     *
     * getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
     * getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     * getCount([]) → {}
     * getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
     *
     */
    @Test
    public void getCount_withBaBaBlackSheep_shouldReturnTrue(){
        //Arrange
        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("ba", 2);
        expectedResult.put("black", 1);
        expectedResult.put("sheep", 1);
        //Act
        Map<String, Integer> actualResult = wordCount.getCount(new String[]{"ba", "ba", "black", "sheep"});
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getCount_withABABC_shouldReturnTrue(){
        //Arrange
        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("a", 2);
        expectedResult.put("b", 2);
        expectedResult.put("c", 1);
        //Act
        Map<String, Integer> actualResult = wordCount.getCount(new String[]{"a", "b", "a", "b", "c"});
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getCount_withCBA_shouldReturnTrue(){
        //Arrange
        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("c", 1);
        expectedResult.put("b", 1);
        expectedResult.put("a", 1);
        //Act
        Map<String, Integer> actualResult = wordCount.getCount(new String[]{"c", "b", "a"});
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }


}
