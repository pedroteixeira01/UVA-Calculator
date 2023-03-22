package com.example.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(View view){

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.result);

        int x,y,z;

        x = Integer.parseInt(num1.getText().toString());
        y = Integer.parseInt(num2.getText().toString());
        z = x+y;

        result.setText(Integer.toString(z));
    }

    public void subtraction(View view){
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.result);

        int x,y,z;

        x = Integer.parseInt(num1.getText().toString());
        y = Integer.parseInt(num2.getText().toString());
        z = x-y;

        result.setText(Integer.toString(z));
    }

    public void multiply(View view){
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.result);

        int x,y,z;

        x = Integer.parseInt(num1.getText().toString());
        y = Integer.parseInt(num2.getText().toString());
        z = x*y;

        result.setText(Integer.toString(z));
    }

    public void divide(View view){
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.result);

        int x,y,z;

        x = Integer.parseInt(num1.getText().toString());
        y = Integer.parseInt(num2.getText().toString());

        try {
            z = x / y;
            result.setText(Integer.toString(z));
        }catch(ArithmeticException e){
            e.getMessage();
        }catch(Exception e){
            e.getMessage();
            e.getStackTrace();
        }
    }
}