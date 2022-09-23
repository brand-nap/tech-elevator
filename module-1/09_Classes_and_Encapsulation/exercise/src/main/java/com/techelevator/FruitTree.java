package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public String getTypeOfFruit() {
        return this.typeOfFruit;
    }
    public int getPiecesOfFruitLeft() {
        return this.piecesOfFruitLeft;
    }

    public FruitTree(String setTypeOfFruit, int setPiecesOfFruitLeft){
        this.typeOfFruit = setTypeOfFruit;
        this.piecesOfFruitLeft = setPiecesOfFruitLeft;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        int og = this.piecesOfFruitLeft;
        this.piecesOfFruitLeft -= (numberOfPiecesToRemove<=og) ? numberOfPiecesToRemove : 0;
        return (numberOfPiecesToRemove<=og);
    }
}
