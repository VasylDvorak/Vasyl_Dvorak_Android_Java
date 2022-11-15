package com.example.vasyl_dvorak_android_java_begin_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClcs(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onToggleClicked(View view) {

        // включена ли кнопка
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            // действия если включена
            String s = "android:ems или setEms(n) задает ширину TextView, чтобы соответствовать тексту из n ' m ' букв независимо от фактического расширения текста и размера текста";
            Toast.makeText(this, s, Toast.LENGTH_LONG).show();
            TextView textView = findViewById(R.id.textView);
            textView.setText(s);
        } else {
            // действия, если выключена
            Toast.makeText(this, "Ответа нету", Toast.LENGTH_LONG).show();
        }
    }
}