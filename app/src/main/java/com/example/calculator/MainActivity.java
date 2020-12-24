package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    // TODO: Fix bug 'can not put dot if a number had decimal part and erased'

    /**
     * @param displayNumber store the number to display as string.
     * @param operand store the number in the text view as float
     * @param
     */
    String displayNumber = "";
    BigDecimal operand = new BigDecimal("0");
    BigDecimal result = new BigDecimal("0");
    String operator;
    BigDecimal numA, numB;
    // this method format the number
    DecimalFormat numberFormat = new DecimalFormat("#.#########");
    /**
     * @param decimalPosition is used to keep track of decimal (dot) button used so if user clicks dot button more than one times a warning message pop up.
     * if it's value is 0, then it means it's not used and no number button is used either
     * if it's value is 1, then it means it's not used, but number button is used
     * if it's value is 2, then it means it's used.
     */
    int decimalPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * this program is in developing stage and will not be stable
     */


    //this method calls when ON or Clear button pressed
    public void buttonOn(View view) {
        displayNumber = "";
        operator = "";
        operand = new BigDecimal("0");
        result = new BigDecimal("0");
        decimalPosition = 0;
        operatorDisplay(operator);
        display("0");
    }

    //this method calls when Backspace button pressed
    public void buttonBackSpace(View view) {
        if (displayNumber.length() != 0) {
            displayNumber = displayNumber.substring(0, displayNumber.length() - 1);
            display(displayNumber);
        }
    }

    //this method calls when 9 button pressed
    public void button9(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "9";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }

    //this method calls when 8 button pressed
    public void button8(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "8";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }

    //this method calls when 7 button pressed
    public void button7(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "7";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }

    //this method calls when 6 button pressed
    public void button6(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "6";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }


    //this method calls when 5 button pressed
    public void button5(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "5";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }


    //this method calls when 4 button pressed
    public void button4(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "4";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }

    //this method calls when 3 button pressed
    public void button3(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "3";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }


    //this method calls when 2 button pressed
    public void button2(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "2";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }

    //this method calls when 1 button pressed
    public void button1(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "1";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }

    //this method calls when 0 button pressed
    public void button0(View view) {
        if (displayNumber.length() <= 15) {
            displayNumber = displayNumber + "0";
            Log.v("Main Activity", "the number is " + displayNumber);
            if (decimalPosition != 2) {
                decimalPosition = 1;
            }
            display(displayNumber);
        } else {
            operatorDisplay(getString(R.string.maximum_number_limit));
//            Toast.makeText(this,getText(R.string.maximum_number_limit),Toast.LENGTH_SHORT).show();
        }
    }

    //this method calls when . (dot) button pressed
    public void buttonDot(View view) {
        if (decimalPosition == 0 && displayNumber == "") {
            displayNumber = displayNumber + "0.";
            decimalPosition = 2;
            Log.v("Main Activity", "the number is " + displayNumber);
            display(displayNumber);
        }
        if (decimalPosition == 1 && displayNumber != "") {
            displayNumber = displayNumber + ".";
            decimalPosition = 2;
            Log.v("Main Activity", "the number is " + displayNumber);
            display(displayNumber);
        }
    }

    /**
     * this method calls when plus button pressed
     * <p>
     * displayMessage take the String format number in the display text view
     * operandA it convert the String to float number and store it
     */
    public void buttonPlus(View view) {
        if (displayNumber != "" && displayNumber.length() != 0) {
            operator = "+";
            operatorDisplay(operator);
            operand = new BigDecimal(displayNumber);
            numA = result;
            numB = operand;
            result = result.add(operand);
            result = result.setScale(9, RoundingMode.HALF_EVEN);
//                numberFormat.setRoundingMode(RoundingMode.CEILING);
            display("" + numberFormat.format(result));
            operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
            Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
            decimalPosition = 0;
            displayNumber = "";
        }

    }

    /**
     * method for subtraction
     */
    public void buttonMinus(View view) {
        if (displayNumber != "" && displayNumber.length() != 0) {
            operator = "-";
            operatorDisplay(operator);
            operand = new BigDecimal(displayNumber);
            result = operand;
            Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
            decimalPosition = 0;
            displayNumber = "";
//            numberFormat.setRoundingMode(RoundingMode.CEILING);
            display("" + numberFormat.format(result));
            operatorDisplay(numberFormat.format(result) + " " + operator + " ");
        }
    }

    /**
     * this method calls when multiply button pressed
     */
    public void buttonMultiply(View view) {
        if (displayNumber != "" && displayNumber.length() != 0) {
            operator = "x";
            operatorDisplay(operator);
            operand = new BigDecimal(displayNumber);
            result = operand;
            Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
            decimalPosition = 0;
            displayNumber = "";
//                numberFormat.setRoundingMode(RoundingMode.CEILING);
            display("" + numberFormat.format(result));
            operatorDisplay(numberFormat.format(result) + " " + operator + " ");
        }

    }

    /**
     * this method calls when divide button pressed
     */
    public void buttonDivide(View view) {
        if (displayNumber != "" && displayNumber.length() != 0) {
            operator = "/";
            operatorDisplay(operator);
            operand = new BigDecimal(displayNumber);
            result = operand;
            Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
            decimalPosition = 0;
            displayNumber = "";
//                numberFormat.setRoundingMode(RoundingMode.CEILING);
            display("" + numberFormat.format(result));
            operatorDisplay(numberFormat.format(result) + " " + operator + " ");
//                display("" + result);
//                operatorDisplay(result + " " + operator + " " );
        }

    }


    /**
     * this method calls when equal button pressed
     * <p>
     * displayMessage take the String format number in the display text view
     * operand it convert the String to float number and store it
     */
    public void buttonEqualTo(View view) {
        if (displayNumber != "" && displayNumber.length() != 0) {
            if (displayNumber == ".") {
                operatorDisplay(getString(R.string.wrong_expression));
            } else {
                operand = new BigDecimal(displayNumber);
                if (operator == "+") {
                    numA = result;
                    numB = operand;
                    result = result.add(operand);
                    result = result.setScale(9, RoundingMode.HALF_EVEN);
//                    numberFormat.setRoundingMode(RoundingMode.CEILING);
                    display("" + numberFormat.format(result));
                    operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
                    Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                } else if (operator == "-") {
                    numA = result;
                    numB = operand;
                    result = result.subtract(operand);
                    result = result.setScale(9, RoundingMode.HALF_EVEN);
//                    numberFormat.setRoundingMode(RoundingMode.CEILING);
                    display("" + numberFormat.format(result));
                    operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
                    Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                } else if (operator == "x") {
                    numA = result;
                    numB = operand;
                    result = result.multiply(operand);
                    result = result.setScale(9, RoundingMode.HALF_EVEN);
//                    numberFormat.setRoundingMode(RoundingMode.CEILING);
                    display("" + numberFormat.format(result));
                    operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
                    Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                } else if (operator == "/") {
                    BigDecimal zero = new BigDecimal("0");
                    boolean isOperandZero = operand.equals(zero);
                    if (isOperandZero) {
                        operatorDisplay(getString(R.string.divide_by_zero));
//                        Toast.makeText(this, getText(R.string.zero_error_toast), Toast.LENGTH_SHORT).show();
                    } else {
                        numA = result;
                        numB = operand;
                        result = result.divide(operand, 9, RoundingMode.HALF_EVEN);
                        display("" + numberFormat.format(result));
                        operatorDisplay(numberFormat.format(numA) + " " + operator + " " + numberFormat.format(numB));
                        Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
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