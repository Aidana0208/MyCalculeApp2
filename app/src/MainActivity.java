package com.example.mycalculeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    double number1;
    double number2;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void  add(View view) {
        EditText editText1 = findViewById(R.id.num1);
        number1 = Double.parseDouble(editText1.getText().toString());

        EditText editText2 = findViewById(R.id.num2);
        number2 = Double.parseDouble(editText2.getText().toString());

        result = number1 + number2;
        Intent intent = new Intent(this, MessageActivity.class);
        intent.putExtra("mess",result);
        startActivity(intent);
    }

    public void  sub(View view) {
        EditText editText1 = findViewById(R.id.num1);
        number1 = Double.parseDouble(editText1.getText().toString());

        EditText editText2 = findViewById(R.id.num2);
        number2 = Double.parseDouble(editText2.getText().toString());

        result = number1 - number2;
        Intent intent = new Intent(this, MessageActivity.class);
        intent.putExtra("mess",result);
        startActivity(intent);
    }

    public void  mul(View view) {
        EditText editText1 = findViewById(R.id.num1);
        number1 = Double.parseDouble(editText1.getText().toString());

        EditText editText2 = findViewById(R.id.num2);
        number2 = Double.parseDouble(editText2.getText().toString());

        result = number1 * number2;
        Intent intent = new Intent(this, MessageActivity.class);
        intent.putExtra("mess",result);
        startActivity(intent);
        
    }

    public void  div(View view) {
        EditText editText1 = findViewById(R.id.num1);
        number1 = Double.parseDouble(editText1.getText().toString());

        EditText editText2 = findViewById(R.id.num2);
        number2 = Double.parseDouble(editText2.getText().toString());

        result = number1 / number2;
        Intent intent = new Intent(this, MessageActivity.class);
        intent.putExtra("mess",result);
        startActivity(intent);
    }


}