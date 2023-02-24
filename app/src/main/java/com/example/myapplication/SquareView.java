package com.example.myapplication;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/*
 * Coder: Alexx 'Xander' Blake w/ Collaborative Help
 * Date: 2/24/23
 */

public class SquareView {

    public Button[][] buttons; //declares a 2D array of buttons
    public TextView winText; //declares a text object when the player wins
    private SquareModel sModel; //declares a SquareModel object for the button
    private Random ran; //declares a random object
    private Button reset; //declares a reset button

    public SquareView(SquareModel Sm) {
        sModel = Sm;
        buttons = new Button[4][4];
    }
    public void addButton(int row, int col, Button b) {
        buttons[row][col] = b; //add a button to the array
    }
    public void addResetButton(Button button) {
        reset = button; //add the reset button & Colors it Red
        button.setBackgroundColor(Color.RED);
    }
    public void addTextView(TextView text) {
        winText = text; //initialize the winning text
    }
    public void setText(String player_Wins) {
        winText.setText(player_Wins); //sets the winning text
    }

    /*
    * This configures the button display
    */
    public void displayButtons() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buttons[i][j].setVisibility(View.VISIBLE); //set all squares visible
                if (i == 3 && j == 3) {
                    buttons[i][j].setVisibility(View.INVISIBLE); //except the very bottom right square
                }
            }
        }
    }

    /*
     * This shuffles the buttons
     */

    public void shuffleButtons() {
        ran = new Random();
        int randomIndex1;
        int randomIndex2;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    randomIndex1 = ran.nextInt(4); //generates a random number from 0 to 3 for the first index
                    randomIndex2 = ran.nextInt(4); //generates a random number from 0 to 3 for the second index
                /*this statement guarantees that the randomizer cannot select indexes 3 and 3 (the very bottom right square) as a safety measure*/
                   if (randomIndex1 == 3 && randomIndex2 == 3) {
                       randomIndex1 -= ran.nextInt(2) + 1;
                        randomIndex2 -= ran.nextInt(2) + 1;
                    }
                    String num1 = (String) buttons[randomIndex1][randomIndex2].getText();
                    String num2 = (String) buttons[i][j].getText();
                 if(!(i == 3 && j == 3)) {
                     buttons[randomIndex1][randomIndex2].setText(num2);
                     buttons[i][j].setText(num1);
                 }
                else if(i == 3 && j == 3) {
                     buttons[randomIndex1][randomIndex2].setText(num1);
                 }
            }
        }
    }

    /*
     * Checks when the player wins based on the board configuration
     */
    public boolean findResult() {
        /*This array is used to compare the strings of the current board*/
        String[] stringArray = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        int result = 0;
        int z = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!(i == 3 && j == 3) && buttons[i][j].getText().equals(stringArray[z])) {
                    result++; //if we are not at the very bottom right square
                }
                z++;
            }
        }
        if (result == 15) {
           return true;
        }
        else {
            return false;
        }
    }

    /*
     * Changes all buttons when the player wins.
     */
    public void winnerIndication() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    buttons[i][j].setBackgroundColor(Color.GREEN);
                    buttons[i][j].setTextColor(Color.BLACK);
            }
        }
    }
    /*
     * Sets the color to all buttons and text color
     */
    public void buttonDefaultColor() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    buttons[i][j].setBackgroundColor(Color.BLUE);
                    buttons[i][j].setTextColor(Color.WHITE);
            }
        }
    }

    /*
     * Sets the click listener onto all the buttons & reset button
     */
    public void setListener(View.OnClickListener ocl)
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                buttons[i][j].setOnClickListener(ocl);
            }
        }
        reset.setOnClickListener(ocl);
    }
}
