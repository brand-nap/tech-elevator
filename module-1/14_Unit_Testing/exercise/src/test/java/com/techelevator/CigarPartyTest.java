package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CigarPartyTest {
    CigarParty cigarParty = new CigarParty();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }

    /*
     When squirrels get together for a party, they like to have cigars. A squirrel party is successful
     when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
     there is no upper bound on the number of cigars. Return true if the party with the given values is
     successful, or false otherwise.
     haveParty(30, false) → false
     haveParty(50, false) → true
     haveParty(70, true) → true
     */

    @Test
    public void getHaveParty_withFiftyCigars_onWeekend_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = cigarParty.haveParty(50, true);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getHaveParty_withEightyCigars_onWeekend_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = cigarParty.haveParty(80, true);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getHaveParty_withFortyCigars_offWeekend_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = cigarParty.haveParty(40, false);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getHaveParty_withSixtyCigars_offWeekend_shouldReturnTrue(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = cigarParty.haveParty(60, false);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getHaveParty_withThirtyCigars_offWeekend_shouldReturnFalse(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = cigarParty.haveParty(30, false);
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
    }
    @Test
    public void getHaveParty_withSeventyCigars_offWeekend_shouldReturnFalse(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = cigarParty.haveParty(70, false);
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
    }
    @Test
    public void getHaveParty_withThirtyCigars_onWeekend_shouldReturnFalse(){
        //Arrange
        boolean expectedResult = true;
        //Act
        boolean actualResult = cigarParty.haveParty(30, true);
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
    }
}
