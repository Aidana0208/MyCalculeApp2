package com.example.mycalculeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_message);


        // Получаем объект Intent, который запустил данную activity
        Intent intent = getIntent();
        // Получаем сообщение из объекта intent
        double message = intent.getDoubleExtra("mess",1  );
        // Получаем TextView по его id
        TextView messageText = (TextView) findViewById(R.id.messageText);
        // устанавливаем текст для TextView
        messageText.setText("Result = " + message);
    }
}