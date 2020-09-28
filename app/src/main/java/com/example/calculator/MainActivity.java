package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float numberA = 0;
    float numberB = 0;
    float result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this program is in developing stage and will not be stable
     *
     */


    //this method calls when ON button pressed
    public void buttonOn(View view){
        display(0);
    }
    //this method calls when OFF button pressed
    public void buttonOff(View view){
        display(-1);
    }
    //this method calls when 7 button pressed not ready yet
    public void button7(View view){
        display(-1);
    }

    //this method display the inputs and result on the screen
    public void display(float number) {
        TextView displayMessage = (TextView) findViewById(R.id.display_screen);
        if (number == -1) {
            displayMessage.setText("");
        } else if (number == 0) {
            displayMessage.setText("0");
        }
    }

}