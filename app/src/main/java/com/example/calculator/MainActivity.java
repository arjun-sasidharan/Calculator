package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param displayNumber store the number to display on the screen as string.
     * @param operandA
     * @param operandB
     *
     */
    String displayNumber = "";
    float operand = 0;
    float operandB = 0;
    float result = 0;
    String operator ;

    /**
     * this program is in developing stage and will not be stable
     *
     */


    //this method calls when ON button pressed
    public void buttonOn(View view){
        displayNumber = "";
        operator = "";
        operand = 0;
        result = 0;
        operatorDisplay(operator);
        display("0");
    }
    //this method calls when OFF button pressed
    public void buttonOff(View view){
        displayNumber = "";
        operator = "";
        operand = 0;
        result = 0;
        operatorDisplay(operator);
        display(displayNumber);
    }
    //this method calls when 7 button pressed
    public void button7(View view){
        displayNumber = displayNumber + "7";
        operand = Float.parseFloat(displayNumber.toString());
        Log.v("Main Activity","the number is "+ displayNumber + "in string and " + operand + " in float");
        display(displayNumber);
    }
    //this method calls when 8 button pressed
    public void button8(View view){
        displayNumber = displayNumber + "8";
        operand = Float.parseFloat(displayNumber.toString());
        Log.v("Main Activity","the number is "+ displayNumber + "in string and " + operand + " in float");
        display(displayNumber);
    }
    /**this method calls when plus button pressed
     *
     *displayMessage take the String format number in the display text view
     *operandA it convert the String to float number and store it
     */
    public void buttonPlus(View view){
        operator = "+";
        operatorDisplay(operator);
        result = result + operand;
        Log.v("MainActivity", "operand A is " + operand + " and Result is " + result) ;
        displayNumber = "";
        display("" + result);
    }

    /**this method calls when equal button pressed
     *
     *displayMessage take the String format number in the display text view
     *operandA it convert the String to float number and store it
     */
    public void buttonEqualTo(View view){
        TextView displayMessage = (TextView) findViewById(R.id.display_screen);
        if(displayNumber != ""){
            operand = Float.parseFloat(displayMessage.getText().toString());
            if (operator == "+"){
                result = result + operand;
                Log.v("MainActivity", "operand A is " + operand + " and Result is " + result);
                displayNumber = "";
                operator="";
            }
            operatorDisplay(operator);
            display("" + result) ;
        }
        else {
            //TODO : give a toast message
        }

    }


    //this method display the inputs and result on the screen
    public void display(String display) {
        TextView displayMessage = (TextView) findViewById(R.id.display_screen);
        displayMessage.setText(display);

        /** testing String to Float conversion
//        String ex1 = "126";
//        Log.v("Main Activity","String is "+ ex1);
//        float f = Float.parseFloat(ex1);
//        Log.v("Main Activity","Converted to Float");
//        f = f + 1 ;
//        Log.v("Main Activity","1 Added" + f);
         */
    }
    //this method display operator symbol according to what operator is selected
    public void operatorDisplay(String operator){
        TextView currentOperator = (TextView) findViewById(R.id.operator_screen);
        currentOperator.setText(operator);
    }

}