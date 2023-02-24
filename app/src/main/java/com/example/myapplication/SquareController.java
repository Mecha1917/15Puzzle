package com.example.myapplication;

import android.view.View;

/*
 * Coder: Alexx 'Xander' Blake w/ Collaborative Help
 * Date: 2/24/23
 */

public class SquareController implements View.OnClickListener
{
    private SquareView view; //declares view for buttons
    private SquareModel sModel; //declares model for buttons
    public SquareController(SquareModel Sm, SquareView Sv)
    {
        //Initializes Models
        sModel = Sm;
        view = Sv;
    }

    /*
     * This controls the overall activation of the programming for it's functionalities to utilize
     */
    public void onClick(View v) {
        //This Switch controls all the buttons & checks for which button user clicks and activates all required movements of specified button
        switch(v.getId()) {
            case R.id.b_11: //checks if the user clicks button (0,0)
                if (view.buttons[0][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][0].setVisibility(View.INVISIBLE);
                    view.buttons[0][1].setVisibility(View.VISIBLE);
                    String buttonText1 = (String) view.buttons[0][0].getText();
                    view.buttons[0][1].setText(buttonText1);
                } else if (view.buttons[1][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][0].setVisibility(View.INVISIBLE);
                    view.buttons[1][0].setVisibility(View.VISIBLE);
                    String buttonText2 = (String) view.buttons[0][0].getText();
                    view.buttons[1][0].setText(buttonText2);
                }
                break;
            case R.id.b_12: //checks if the user clicks button (0,1)
                if (view.buttons[0][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][1].setVisibility(View.INVISIBLE);
                    view.buttons[0][0].setVisibility(View.VISIBLE);
                    String buttonText3 = (String) view.buttons[0][1].getText();
                    view.buttons[0][0].setText(buttonText3);
                } else if (view.buttons[1][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][1].setVisibility(View.INVISIBLE);
                    view.buttons[1][1].setVisibility(View.VISIBLE);
                    String buttonText4 = (String) view.buttons[0][1].getText();
                    view.buttons[1][1].setText(buttonText4);
                } else if (view.buttons[0][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][1].setVisibility(View.INVISIBLE);
                    view.buttons[0][2].setVisibility(View.VISIBLE);
                    String buttonText5 = (String) view.buttons[0][1].getText();
                    view.buttons[0][2].setText(buttonText5);
                }
                break;
            case R.id.b_13: //checks if the user clicks button (0,3)
                if (view.buttons[0][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][2].setVisibility(View.INVISIBLE);
                    view.buttons[0][1].setVisibility(View.VISIBLE);
                    String buttonText6 = (String) view.buttons[0][2].getText();
                    view.buttons[0][1].setText(buttonText6);
                } else if (view.buttons[1][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][2].setVisibility(View.INVISIBLE);
                    view.buttons[1][2].setVisibility(View.VISIBLE);
                    String buttonText7 = (String) view.buttons[0][2].getText();
                    view.buttons[1][2].setText(buttonText7);
                } else if (view.buttons[0][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][2].setVisibility(View.INVISIBLE);
                    view.buttons[0][3].setVisibility(View.VISIBLE);
                    String buttonText8 = (String) view.buttons[0][2].getText();
                    view.buttons[0][3].setText(buttonText8);
                }
                break;
            case R.id.b_14: //checks if the user clicks button (0,4)
                if (view.buttons[0][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][3].setVisibility(View.INVISIBLE);
                    view.buttons[0][2].setVisibility(View.VISIBLE);
                    String buttonText9 = (String) view.buttons[0][3].getText();
                    view.buttons[0][2].setText(buttonText9);
                } else if (view.buttons[1][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[0][3].setVisibility(View.INVISIBLE);
                    view.buttons[1][3].setVisibility(View.VISIBLE);
                    String buttonText10 = (String) view.buttons[0][3].getText();
                    view.buttons[1][3].setText(buttonText10);
                }
                break;
            case R.id.b_21: //checks if the user clicks button (1,0)
                if (view.buttons[0][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][0].setVisibility(View.INVISIBLE);
                    view.buttons[0][0].setVisibility(View.VISIBLE);
                    String buttonText11 = (String) view.buttons[1][0].getText();
                    view.buttons[0][0].setText(buttonText11);
                } else if (view.buttons[1][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][0].setVisibility(View.INVISIBLE);
                    view.buttons[1][1].setVisibility(View.VISIBLE);
                    String buttonText12 = (String) view.buttons[1][0].getText();
                    view.buttons[1][1].setText(buttonText12);
                } else if (view.buttons[2][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][0].setVisibility(View.INVISIBLE);
                    view.buttons[2][0].setVisibility(View.VISIBLE);
                    String buttonText13 = (String) view.buttons[1][0].getText();
                    view.buttons[2][0].setText(buttonText13);
                }
                break;
            case R.id.b_22: //checks if the user clicks button (1,1)
                if (view.buttons[1][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][1].setVisibility(View.INVISIBLE);
                    view.buttons[1][0].setVisibility(View.VISIBLE);
                    String buttonText14 = (String) view.buttons[1][1].getText();
                    view.buttons[1][0].setText(buttonText14);
                } else if (view.buttons[0][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][1].setVisibility(View.INVISIBLE);
                    view.buttons[0][1].setVisibility(View.VISIBLE);
                    String buttonText15 = (String) view.buttons[1][1].getText();
                    view.buttons[0][1].setText(buttonText15);
                } else if (view.buttons[2][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][1].setVisibility(View.INVISIBLE);
                    view.buttons[2][1].setVisibility(View.VISIBLE);
                    String buttonText16 = (String) view.buttons[1][1].getText();
                    view.buttons[2][1].setText(buttonText16);
                } else if (view.buttons[1][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][1].setVisibility(View.INVISIBLE);
                    view.buttons[1][2].setVisibility(View.VISIBLE);
                    String buttonText17 = (String) view.buttons[1][1].getText();
                    view.buttons[1][2].setText(buttonText17);
                }
                break;
            case R.id.b_23: //checks if the user clicks button (1,2)
                if(view.buttons[1][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][2].setVisibility(View.INVISIBLE);
                    view.buttons[1][1].setVisibility(View.VISIBLE);
                    String buttonText18 = (String) view.buttons[1][2].getText();
                    view.buttons[1][1].setText(buttonText18);
                } else if (view.buttons[0][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][2].setVisibility(View.INVISIBLE);
                    view.buttons[0][2].setVisibility(View.VISIBLE);
                    String buttonText19 = (String) view.buttons[1][2].getText();
                    view.buttons[0][2].setText(buttonText19);
                } else if (view.buttons[2][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][2].setVisibility(View.INVISIBLE);
                    view.buttons[2][2].setVisibility(View.VISIBLE);
                    String buttonText20 = (String) view.buttons[1][2].getText();
                    view.buttons[2][2].setText(buttonText20);
                } else if (view.buttons[1][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][2].setVisibility(View.INVISIBLE);
                    view.buttons[1][3].setVisibility(View.VISIBLE);
                    String buttonText21 = (String) view.buttons[1][2].getText();
                    view.buttons[1][3].setText(buttonText21);
                }
                break;
            case R.id.b_24: //checks if the user clicks button (1,3)
                if(view.buttons[1][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][3].setVisibility(View.INVISIBLE);
                    view.buttons[1][2].setVisibility(View.VISIBLE);
                    String buttonText22 = (String) view.buttons[1][3].getText();
                    view.buttons[1][2].setText(buttonText22);
                } else if (view.buttons[0][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][3].setVisibility(View.INVISIBLE);
                    view.buttons[0][3].setVisibility(View.VISIBLE);
                    String buttonText23 = (String) view.buttons[1][3].getText();
                    view.buttons[0][3].setText(buttonText23);
                } else if (view.buttons[2][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[1][3].setVisibility(View.INVISIBLE);
                    view.buttons[2][3].setVisibility(View.VISIBLE);
                    String buttonText24 = (String) view.buttons[1][3].getText();
                    view.buttons[2][3].setText(buttonText24);
                }
                break;
            case R.id.b_31: //checks if the user clicks button (2,0)
                if (view.buttons[1][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][0].setVisibility(View.INVISIBLE);
                    view.buttons[1][0].setVisibility(View.VISIBLE);
                    String buttonText25 = (String) view.buttons[2][0].getText();
                    view.buttons[1][0].setText(buttonText25);
                } else if (view.buttons[2][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][0].setVisibility(View.INVISIBLE);
                    view.buttons[2][1].setVisibility(View.VISIBLE);
                    String buttonText26 = (String) view.buttons[2][0].getText();
                    view.buttons[2][1].setText(buttonText26);
                } else if (view.buttons[3][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][0].setVisibility(View.INVISIBLE);
                    view.buttons[3][0].setVisibility(View.VISIBLE);
                    String buttonText27 = (String) view.buttons[2][0].getText();
                    view.buttons[3][0].setText(buttonText27);
                }
                break;
            case R.id.b_32: //checks if the user clicks button (2,1)
                if (view.buttons[2][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][1].setVisibility(View.INVISIBLE);
                    view.buttons[2][0].setVisibility(View.VISIBLE);
                    String buttonText28 = (String) view.buttons[2][1].getText();
                    view.buttons[2][0].setText(buttonText28);
                } else if (view.buttons[1][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][1].setVisibility(View.INVISIBLE);
                    view.buttons[1][1].setVisibility(View.VISIBLE);
                    String buttonText29 = (String) view.buttons[2][1].getText();
                    view.buttons[1][1].setText(buttonText29);
                } else if (view.buttons[3][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][1].setVisibility(View.INVISIBLE);
                    view.buttons[3][1].setVisibility(View.VISIBLE);
                    String buttonText30 = (String) view.buttons[2][1].getText();
                    view.buttons[3][1].setText(buttonText30);
                } else if (view.buttons[2][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][1].setVisibility(View.INVISIBLE);
                    view.buttons[2][2].setVisibility(View.VISIBLE);
                    String buttonText31 = (String) view.buttons[2][1].getText();
                    view.buttons[2][2].setText(buttonText31);
                }
                break;
            case R.id.b_33: //checks if the user clicks button (2,2)
                if(view.buttons[2][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][2].setVisibility(View.INVISIBLE);
                    view.buttons[2][1].setVisibility(View.VISIBLE);
                    String buttonText32 = (String) view.buttons[2][2].getText();
                    view.buttons[2][1].setText(buttonText32);
                } else if (view.buttons[1][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][2].setVisibility(View.INVISIBLE);
                    view.buttons[1][2].setVisibility(View.VISIBLE);
                    String buttonText33 = (String) view.buttons[2][2].getText();
                    view.buttons[1][2].setText(buttonText33);
                } else if (view.buttons[3][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][2].setVisibility(View.INVISIBLE);
                    view.buttons[3][2].setVisibility(View.VISIBLE);
                    String buttonText34 = (String) view.buttons[2][2].getText();
                    view.buttons[3][2].setText(buttonText34);
                } else if (view.buttons[2][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][2].setVisibility(View.INVISIBLE);
                    view.buttons[2][3].setVisibility(View.VISIBLE);
                    String buttonText35 = (String) view.buttons[2][2].getText();
                    view.buttons[2][3].setText(buttonText35);
                }
                break;
            case R.id.b_34: //checks if the user clicks button (2,3)
                if(view.buttons[1][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][3].setVisibility(View.INVISIBLE);
                    view.buttons[1][3].setVisibility(View.VISIBLE);
                    String buttonText36 = (String) view.buttons[2][3].getText();
                    view.buttons[1][3].setText(buttonText36);
                } else if (view.buttons[2][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][3].setVisibility(View.INVISIBLE);
                    view.buttons[2][2].setVisibility(View.VISIBLE);
                    String buttonText37 = (String) view.buttons[2][3].getText();
                    view.buttons[2][2].setText(buttonText37);
                } else if (view.buttons[3][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[2][3].setVisibility(View.INVISIBLE);
                    view.buttons[3][3].setVisibility(View.VISIBLE);
                    String buttonText38 = (String) view.buttons[2][3].getText();
                    view.buttons[3][3].setText(buttonText38);
                }
                break;
            case R.id.b_41: //checks if the user clicks button (3,0)
                if (view.buttons[2][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][0].setVisibility(View.INVISIBLE);
                    view.buttons[2][0].setVisibility(View.VISIBLE);
                    String buttonText39 = (String) view.buttons[3][0].getText();
                    view.buttons[2][0].setText(buttonText39);
                } else if (view.buttons[3][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][0].setVisibility(View.INVISIBLE);
                    view.buttons[3][1].setVisibility(View.VISIBLE);
                    String buttonText40 = (String) view.buttons[3][0].getText();
                    view.buttons[3][1].setText(buttonText40);
                }
                break;
            case R.id.b_42: //checks if the user clicks button (3,1)
                if (view.buttons[3][0].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][1].setVisibility(View.INVISIBLE);
                    view.buttons[3][0].setVisibility(View.VISIBLE);
                    String buttonText41 = (String) view.buttons[3][1].getText();
                    view.buttons[3][0].setText(buttonText41);
                } else if (view.buttons[2][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][1].setVisibility(View.INVISIBLE);
                    view.buttons[2][1].setVisibility(View.VISIBLE);
                    String buttonText42 = (String) view.buttons[3][1].getText();
                    view.buttons[2][1].setText(buttonText42);
                } else if (view.buttons[3][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][1].setVisibility(View.INVISIBLE);
                    view.buttons[3][2].setVisibility(View.VISIBLE); //move there
                    String buttonText43 = (String) view.buttons[3][1].getText();
                    view.buttons[3][2].setText(buttonText43); //and move text there
                }
                break;
            case R.id.b_43: //checks if the user clicks button (3,2)
                if (view.buttons[3][1].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][2].setVisibility(View.INVISIBLE);
                    view.buttons[3][1].setVisibility(View.VISIBLE);
                    String buttonText44 = (String) view.buttons[3][2].getText();
                    view.buttons[3][1].setText(buttonText44);
                } else if (view.buttons[2][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][2].setVisibility(View.INVISIBLE);
                    view.buttons[2][2].setVisibility(View.VISIBLE);
                    String buttonText45 = (String) view.buttons[3][2].getText();
                    view.buttons[2][2].setText(buttonText45);
                } else if (view.buttons[3][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][2].setVisibility(View.INVISIBLE);
                    view.buttons[3][3].setVisibility(View.VISIBLE);
                    String buttonText46 = (String) view.buttons[3][2].getText();
                    view.buttons[3][3].setText(buttonText46);
                }
                break;
            case R.id.b_44: //checks if the user clicks button (3,3)
                if (view.buttons[3][2].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][3].setVisibility(View.INVISIBLE);
                    view.buttons[3][2].setVisibility(View.VISIBLE);
                    String buttonText47 = (String) view.buttons[3][3].getText();
                    view.buttons[3][2].setText(buttonText47);
                } else if (view.buttons[2][3].getVisibility() == View.INVISIBLE) { //if space available & moves related objects to new location
                    view.buttons[3][3].setVisibility(View.INVISIBLE);
                    view.buttons[2][3].setVisibility(View.VISIBLE);
                    String buttonText48 = (String) view.buttons[3][3].getText();
                    view.buttons[2][3].setText(buttonText48);
                }
        }
        if (v.getId() == R.id.b__reset) { //Checks if the user clicks the reset button
          view.shuffleButtons();
          view.buttonDefaultColor(); //reset the squares to blue
          view.winText.setVisibility(View.INVISIBLE);
        }

        boolean result = view.findResult(); //checks the pattern

        if (result) { //Checks if the player did win
            view.winText.setVisibility(View.VISIBLE); //lets the user know they won
            view.winnerIndication(); //lets all the buttons turn green when they won
        }
    }


}

