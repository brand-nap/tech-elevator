package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateFashionTest {
    DateFashion dateFashion = new DateFashion();
    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
    /*
    You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
    of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
    getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
    stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of
    2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
    */
    @Test
    public void getTableReservation_withFineOutfit_withHotDate_shouldReturnTrue(){
        //Arrange
        int expectedResult = 2;
        //Act
        int actualResult = dateFashion.getATable(5,10);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getTableReservation_withDapperOutfit_withCuteDate_shouldReturnTrue(){
        //Arrange
        int expectedResult = 2;
        //Act
        int actualResult = dateFashion.getATable(10,5);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getTableReservation_withDapperOutfit_withHotDate_shouldReturnTrue(){
        //Arrange
        int expectedResult = 2;
        //Act
        int actualResult = dateFashion.getATable(10,10);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getTableReservation_withFineOutfit_withCuteDate_shouldReturnTrue(){
        //Arrange
        int expectedResult = 1;
        //Act
        int actualResult = dateFashion.getATable(5,5);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getNoTableReservation_withGymOutfit_withHotDate_shouldReturnTrue(){
        //Arrange
        int expectedResult = 0;
        //Act
        int actualResult = dateFashion.getATable(1,10);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getNoTableReservation_withDapperOutfit_withGrossDate_shouldReturnTrue(){
        //Arrange
        int expectedResult = 0;
        //Act
        int actualResult = dateFashion.getATable(9,1);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getNoTableReservation_withFineOutfit_withGrossDate_shouldReturnTrue(){
        //Arrange
        int expectedResult = 0;
        //Act
        int actualResult = dateFashion.getATable(5,1);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getNoTableReservation_withGymOutfit_withCuteDate_shouldReturnTrue(){
        //Arrange
        int expectedResult = 0;
        //Act
        int actualResult = dateFashion.getATable(1,5);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getTableReservation_withGymOutfit_withHotDate_shouldReturnFalse(){
        //Arrange
        int expectedResult = 2;
        //Act
        int actualResult = dateFashion.getATable(1,10);
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
        expectedResult--;
        Assert.assertNotEquals(expectedResult, actualResult);
    }
    @Test
    public void getTableReservation_withDapperOutfit_withGrossDate_shouldReturnFalse(){
        //Arrange
        int expectedResult = 2;
        //Act
        int actualResult = dateFashion.getATable(9,1);
        //Assert
        Assert.assertNotEquals(expectedResult, actualResult);
        expectedResult--;
        Assert.assertNotEquals(expectedResult, actualResult);
    }
}
