package com.example.myapplication;

/*
 * Coder: Alexx 'Xander' Blake w/ Collaborative Help
 * Date: 2/24/23
 */

public class SquareModel {
    private String winText; //declare the winning text

    //Sets the Victory Text
    public SquareModel()
    {
        winText = "YOU WON!";
    }
    //Gets the Victory Text
    public String getPlayerWins() {
        return winText;
    }
}
