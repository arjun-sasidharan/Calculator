package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param displayNumber store the number to display as string.
     * @param operand store the number in the text view as float
     * @param
     */
    String displayNumber = "";
    float operand = 0;
    float result = 0;
    String operator;
    float numA, numB;
    boolean isCalculatorOn = false;
    // this method format the number
    DecimalFormat numberFormat = new DecimalFormat("#.###");

    /**
     * @param decimalPosition is used to keep track of decimal (dot) button used so if user clicks dot button more than one times a warning message pop up.
     * if it's value is 0, then it means it's not used and no number button is used either
     * if it's value is 1, then it means it's not used, but number button is used
     * if it's value is 2, then it means it's used.
     */
    int decimalPosition = 0;

    /**
     * this program is in developing stage and will not be stable
     */


    //this method calls when ON button pressed
    public void buttonOn(View view) {
        displayNumber = "";
        operator = "";
        operand = 0;
        result = 0;
        decimalPosition = 0;
        isCalculatorOn = true;
        operatorDisplay(operator);
        display("0");
    }

    //this method calls when OFF button pressed
    public void buttonOff(View view) {
        displayNumber = "";
        operator = "";
        operand = 0;
        result = 0;
        decimalPosition = 0;
        isCalculatorOn = false;
        operatorDisplay(operator);
        display(displayNumber);
    }

    //this method calls when 7 button pressed
    public void button7(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "7";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when 8 button pressed
    public void button8(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "8";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when 9 button pressed
    public void button9(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "9";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when 4 button pressed
    public void button4(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "4";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when 5 button pressed
    public void button5(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "5";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when 6 button pressed
    public void button6(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "6";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when 1 button pressed
    public void button1(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "1";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when 2 button pressed
    public void button2(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "2";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when 3 button pressed
    public void button3(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "3";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when 0 button pressed
    public void button0(View view) {
        if (isCalculatorOn == true) {
            displayNumber = displayNumber + "0";
            operand = Float.parseFloat(displayNumber.toString());
            Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
            if (decimalPosition !=2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        }
    }

    //this method calls when . (dot) button pressed
    public void buttonDot(View view) {
        if (isCalculatorOn == true) {
            if (decimalPosition == 0 && displayNumber == "") {
                displayNumber = displayNumber + "0.";
                decimalPosition = 2;
                operand = Float.parseFloat(displayNumber.toString());
                Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
                display(displayNumber);
            }
            if (decimalPosition == 1 && displayNumber != "") {
                displayNumber = displayNumber + ".";
                decimalPosition = 2;
                operand = Float.parseFloat(displayNumber.toString());
                Log.v("Main Activity", "the number is " + displayNumber + "in string and " + operand + " in float");
                display(displayNumber);
            }
        }
    }

    /**
     * this method calls when plus button pressed
     * <p>
     * displayMessage take the String format number in the display text view
     * operandA it convert the String to float number and store it
     */
    public void buttonPlus(View view) {
        if (isCalculatorOn == true) {
            operator = "+";
            operatorDisplay(operator);
            if (displayNumber != "") {
                numA = result;
                numB = operand;
                result = result + operand;
                numberFormat.setRoundingMode(RoundingMode.CEILING);
                display("" + numberFormat.format(result));
                operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
                Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                decimalPosition = 0;
                displayNumber = "";
            }

        }
    }

    /**
     * method for subtraction
     */
    public void buttonMinus(View view) {
        if (isCalculatorOn == true) {
            operator = "-";
            if (displayNumber != "") {
                result = operand;
                operatorDisplay(result + " " + operator + " ");
                Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                decimalPosition = 0;
                displayNumber = "";
                numberFormat.setRoundingMode(RoundingMode.CEILING);
                display("" + numberFormat.format(result));
                operatorDisplay(numberFormat.format(result) + " " + operator + " " );
            }

        }
    }

    /**
     * this method calls when multiply button pressed
     */
    public void buttonMultiply(View view) {
        if (isCalculatorOn == true) {
            operator = "x";
            operatorDisplay(operator);
            if (displayNumber != "") {
                result = operand;
                Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                decimalPosition = 0;
                displayNumber = "";
                numberFormat.setRoundingMode(RoundingMode.CEILING);
                display("" + numberFormat.format(result));
                operatorDisplay(numberFormat.format(result) + " " + operator + " " );
            }

        }
    }

    /**
     * this method calls when divide button pressed
     */
    public void buttonDivide(View view) {
        if (isCalculatorOn == true) {
            operator = "/";
            operatorDisplay(operator);
            if (displayNumber != "") {
                result = operand;
                Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                decimalPosition = 0;
                displayNumber = "";
                numberFormat.setRoundingMode(RoundingMode.CEILING);
                display("" + numberFormat.format(result));
                operatorDisplay(numberFormat.format(result) + " " + operator + " " );
            }

        }
    }


    /**
     * this method calls when equal button pressed
     * <p>
     * displayMessage take the String format number in the display text view
     * operand it convert the String to float number and store it
     */
    public void buttonEqualTo(View view) {
        if (isCalculatorOn == true) {
            TextView displayMessage = (TextView) findViewById(R.id.display_screen);
            if (displayNumber != "") {
                operand = Float.parseFloat(displayMessage.getText().toString());
                if (operator == "+") {
                    numA = result;
                    numB = operand;
                    result = result + operand;
                    numberFormat.setRoundingMode(RoundingMode.CEILING);
                    display("" + numberFormat.format(result));
                    operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
                    Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                }
                else if (operator == "-") {
                    numA = result;
                    numB = operand;
                    result = result - operand;
                    numberFormat.setRoundingMode(RoundingMode.CEILING);
                    display("" + numberFormat.format(result));
                    operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
                    Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                }
                else if (operator == "x") {
//                    DecimalFormat numberFormat = new DecimalFormat("#.#######");
                    numA = result;
                    numB = operand;
                    result = result * operand;
                    numberFormat.setRoundingMode(RoundingMode.CEILING);
                    display("" + numberFormat.format(result));
                    operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
                    Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                }
                else if (operator == "/") {
                    if (operand != 0) {
//                    DecimalFormat numberFormat = new DecimalFormat("#.#######");
                        numA = result;
                        numB = operand;
                        result = result / operand;
                        numberFormat.setRoundingMode(RoundingMode.CEILING);
                        display("" + numberFormat.format(result));
                        operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
                        Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                    }
                    else{
                        operatorDisplay("ERROR: DIVISION BY ZERO");
                        Toast.makeText(this,"Cannot divide a number by zero",Toast.LENGTH_SHORT).show();
                    }
                }
                decimalPosition = 0;
                displayNumber = "";
                operator = "";
            }

        }
    }

    //this method display the inputs and result on the screen
    public void display(String display) {
        TextView displayMessage = (TextView) findViewById(R.id.display_screen);
        displayMessage.setText(display);
    }

    //this method display operator symbol according to what operator is selected
    public void operatorDisplay(String operator) {
        TextView currentOperator = (TextView) findViewById(R.id.operator_screen);
        currentOperator.setText(operator);
    }

}