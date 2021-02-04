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

    public void  add(View view) {
        EditText editText1 = findViewById(R.id.num1);
        number1 = Double.parseDouble(editText1.getText().toString());

        EditText editText2 = findViewById(R.id.num2);
        number2 = Double.parseDouble(editText2.getText().toString());

        result = number1 + number2;
        displayRes(result);
    }

    public void  sub(View view) {
        EditText editText1 = findViewById(R.id.num1);
        number1 = Double.parseDouble(editText1.getText().toString());

        EditText editText2 = findViewById(R.id.num2);
        number2 = Double.parseDouble(editText2.getText().toString());

        result = number1 - number2;
        displayRes(result);
    }

    public void  mul(View view) {
        EditText editText1 = findViewById(R.id.num1);
        number1 = Double.parseDouble(editText1.getText().toString());

        EditText editText2 = findViewById(R.id.num2);
        number2 = Double.parseDouble(editText2.getText().toString());

        result = number1 - number2;
        displayRes(result);
    }

    public void  div(View view) {
        EditText editText1 = findViewById(R.id.num1);
        number1 = Double.parseDouble(editText1.getText().toString());

        EditText editText2 = findViewById(R.id.num2);
        number2 = Double.parseDouble(editText2.getText().toString());

        result = number1 - number2;
        displayRes(result);
    }

    private void displayRes(double result) {
       result = result;
    }

    public void  ress(View view) {
            // действия, совершаемые после нажатия на кнопку
            // Создаем объект Intent для вызова новой Activity
            Intent intent = new Intent(this, MessageActivity.class);
            // Получаем текстовое поле в текущей Activity
           // EditText editText = (EditText) findViewById(R.id.editText);
            // Получае текст данного текстового поля
           // String message = editText.getText().toString();
            // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
            // второй параметр - значение этого объекта
            intent.putExtra("mess",result);
            // запуск activity
            startActivity(intent);
        }

}