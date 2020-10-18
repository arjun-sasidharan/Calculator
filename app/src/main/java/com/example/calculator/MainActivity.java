package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.math.BigDecimal;
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
    BigDecimal op = new BigDecimal("0");
    BigDecimal res = new BigDecimal("0");
    String operator;
    float numA, numB;
    BigDecimal nA, nB;
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


    //this method calls when ON or Clear button pressed
    public void buttonOn(View view) {
        displayNumber = "";
        operator = "";
        op = new BigDecimal("0");
        res = new BigDecimal("0");
        decimalPosition = 0;
        isCalculatorOn = true;
        operatorDisplay(operator);
        display("0");
    }
//TODO: off button function is changing to backspace function
    //this method calls when OFF button pressed
    public void buttonOff(View view) {
//        if (displayNumber.length() != 0) {
//            displayNumber = displayNumber.substring(0, displayNumber.length() - 1);
//        displayNumber = "";
//        operator = "";
//        operand = 0;
//        result = 0;
//        op = new BigDecimal("0");
//        res = new BigDecimal("0");
//        decimalPosition = 0;
//        isCalculatorOn = false;
//        operatorDisplay(operator);
//            display(displayNumber);
//        }
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
        }
        else {
            Toast.makeText(this,"Maximum digit limit reached",Toast.LENGTH_SHORT).show();
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
            operator = "+";
            operatorDisplay(operator);
            if (displayNumber != "") {
                op = new BigDecimal(displayNumber);
                nA = res;
                nB = op;
                res = res.add(op);
                numberFormat.setRoundingMode(RoundingMode.CEILING);
                display("" + numberFormat.format(res));
                operatorDisplay(numberFormat.format(nA) + " " + operator + " " + numberFormat.format(nB));
                Log.v("MainActivity", "operand A is " + op + " and Result is " + res);
                decimalPosition = 0;
                displayNumber = "";
            }

        }

    /**
     * method for subtraction
     */
    public void buttonMinus(View view) {
        operator = "-";
        operatorDisplay(operator);
        if (displayNumber != "") {
            op = new BigDecimal(displayNumber);
            res = op;
            Log.v("MainActivity", "operand A is " + op + " and Result is " + res);
            decimalPosition = 0;
            displayNumber = "";
            numberFormat.setRoundingMode(RoundingMode.CEILING);
            display("" + numberFormat.format(res));
            operatorDisplay(numberFormat.format(res) + " " + operator + " ");
        }
    }

    /**
     * this method calls when multiply button pressed
     */
    public void buttonMultiply(View view) {
            operator = "x";
            operatorDisplay(operator);
            if (displayNumber != "") {
                op = new BigDecimal(displayNumber);
                res = op;
                Log.v("MainActivity", "operand A is " + op + " and Result is " + res);
                decimalPosition = 0;
                displayNumber = "";
                numberFormat.setRoundingMode(RoundingMode.CEILING);
                display("" + numberFormat.format(res));
                operatorDisplay(numberFormat.format(res) + " " + operator + " " );
            }

        }

    /**
     * this method calls when divide button pressed
     */
    public void buttonDivide(View view) {
            operator = "/";
            operatorDisplay(operator);
            if (displayNumber != "") {
                op = new BigDecimal(displayNumber);
                res = op;
                Log.v("MainActivity", "operand A is " + op + " and Result is " + res);
                decimalPosition = 0;
                displayNumber = "";
                numberFormat.setRoundingMode(RoundingMode.CEILING);
                display("" + numberFormat.format(res));
                operatorDisplay(numberFormat.format(res) + " " + operator + " " );
            }

        }


    /**
     * this method calls when equal button pressed
     * <p>
     * displayMessage take the String format number in the display text view
     * operand it convert the String to float number and store it
     */
    public void buttonEqualTo(View view) {
            if (displayNumber != "") {
                op = new BigDecimal(displayNumber);
                if (operator == "+") {
                    nA = res;
                    nB = op;
                    res = res.add(op);
                    numberFormat.setRoundingMode(RoundingMode.CEILING);
                    display("" + numberFormat.format(res));
                    operatorDisplay(numberFormat.format(nA) + " " + operator + " " + numberFormat.format(nB));
                    Log.v("MainActivity", "operand A is " + op + " and Result is " + res);
                }
                else if (operator == "-") {
                    nA = res;
                    nB = op;
                    res = res.subtract(op);
                    numberFormat.setRoundingMode(RoundingMode.CEILING);
                    display("" + numberFormat.format(res));
                    operatorDisplay(numberFormat.format(nA) + " " + operator + " " + numberFormat.format(nB));
                    Log.v("MainActivity", "operand A is " + op + " and Result is " + res);
                }
                else if (operator == "x") {
//                    DecimalFormat numberFormat = new DecimalFormat("#.#######");
                    nA = res;
                    nB = op;
                    res = res.multiply(op);
                    numberFormat.setRoundingMode(RoundingMode.CEILING);
                    display("" + numberFormat.format(res));
                    operatorDisplay(numberFormat.format(nA) + " " + operator + " " + numberFormat.format(nB));
                    Log.v("MainActivity", "operand A is " + op + " and Result is " + res);
                }
                else if (operator == "/") {
                    BigDecimal zero = new BigDecimal("0");
                    boolean isOperandZero = op.equals(zero);
                    if (isOperandZero) {
                        operatorDisplay("ERROR: DIVISION BY ZERO");
                        Toast.makeText(this,getText(R.string.zero_error_toast),Toast.LENGTH_SHORT).show();

                    }
                    else{
//                    DecimalFormat numberFormat = new DecimalFormat("#.#######");
                        nA = res;
                        nB = op;
                        res = res.divide(op);
                        numberFormat.setRoundingMode(RoundingMode.CEILING);
                        display("" + numberFormat.format(res));
                        operatorDisplay(numberFormat.format(nA) + " " + operator + " " + numberFormat.format(nB));
                        Log.v("MainActivity", "operand A is " + op + " and Result is " + res);
                    }
                }
                decimalPosition = 0;
                displayNumber = "";
                operator = "";
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