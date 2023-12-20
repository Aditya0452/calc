package com.example.simplecalc;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // this set that content to view in application
    }

    // Button logic for Addition of two numbers
    public void Add(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int result = n1+n2;

        editText3.setText("Added Value is:  " + result);
    }

    // Button logic for Subtraction of two numbers
    public void Subtract(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int result = n1-n2;

        editText3.setText("Subtracted Value is:  " + result);
    }

    // Button logic for Multiplication of two numbers
    public void Multiply(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int result = n1*n2;

        editText3.setText("Multiplied Value is:  " + result);
    }

    // Button logic for Division of two numbers
    public void Division(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);

        double n1 = Integer.parseInt(editText1.getText().toString());
        double n2 = Integer.parseInt(editText2.getText().toString());
        double result = n1/n2;

        editText3.setText("Divided Value is:   " + result);
    }

}