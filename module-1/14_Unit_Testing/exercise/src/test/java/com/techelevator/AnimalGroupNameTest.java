package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalGroupNameTest {
    AnimalGroupName animalGroupName = new AnimalGroupName();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
    /*
     * Rhino -> Crash
     * Giraffe -> Tower
     * Elephant -> Herd
     * Lion -> Pride
     * Crow -> Murder
     * Pigeon -> Kit
     * Flamingo -> Pat
     * Deer -> Herd
     * Dog -> Pack
     * Crocodile -> Float
     */
    @Test
    public void getHerd_withCapitalizedName_shouldReturnTrue(){
        //Arrange
        String expectedResult = "Herd";
        //Act
        String actualResult = animalGroupName.getHerd("ELEPHANT");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getPride_withLowerCaseName_shouldReturnTrue(){
        //Arrange
        String expectedResult = "Pride";
        //Act
        String actualResult = animalGroupName.getHerd("lion");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getKit_withName_shouldReturnTrue(){
        //Arrange
        String expectedResult = "Kit";
        //Act
        String actualResult = animalGroupName.getHerd("pigeon");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getHerd_withNull_shouldReturnFalse(){
        //Arrange
        String expectedResult = "Herd";
        //Act
        String actualResult = animalGroupName.getHerd(null);
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
    }
    @Test
    public void getCrash_withLion_shouldReturnFalse(){
        //Arrange
        String expectedResult = "Crash";
        //Act
        String actualResult = animalGroupName.getHerd("Lion");
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
    }
}
