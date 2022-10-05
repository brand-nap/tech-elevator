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
        boolean expected = true;
        boolean test = animalGroupName.getHerd("ELEPHANT").equals("Herd");

    }
}
