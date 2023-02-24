package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*
 * Coder: Alexx 'Xander' Blake w/ Collaborative Help
 * Date: 2/24/23
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SquareModel model = new SquareModel(); //creates a model object for the buttons
        SquareView view = new SquareView(model); //creates a view object for the buttons

        //Adds all buttons to the Array & to View
        view.addButton(0,0, findViewById(R.id.b_11));
        view.addButton(0,1, findViewById(R.id.b_12));
        view.addButton(0,2, findViewById(R.id.b_13));
        view.addButton(0,3, findViewById(R.id.b_14));
        view.addButton(1,0, findViewById(R.id.b_21));
        view.addButton(1,1, findViewById(R.id.b_22));
        view.addButton(1,2, findViewById(R.id.b_23));
        view.addButton(1,3, findViewById(R.id.b_24));
        view.addButton(2,0, findViewById(R.id.b_31));
        view.addButton(2,1, findViewById(R.id.b_32));
        view.addButton(2,2, findViewById(R.id.b_33));
        view.addButton(2,3, findViewById(R.id.b_34));
        view.addButton(3,0, findViewById(R.id.b_41));
        view.addButton(3,1, findViewById(R.id.b_42));
        view.addButton(3,2, findViewById(R.id.b_43));
        view.addButton(3,3, findViewById(R.id.b_44));

        view.addResetButton(findViewById(R.id.b__reset)); //add reset button
        view.addTextView(findViewById(R.id.textView)); //add the winning textview
        view.buttonDefaultColor(); //Configures default color
        view.displayButtons(); //Configures display
        view.shuffleButtons(); //Shuffles the Game
        SquareController controller = new SquareController(model, view);
        view.setListener(controller); //Sets listener to buttons and controller
        view.setText(model.getPlayerWins()); //shows text when the player wins
    }
}