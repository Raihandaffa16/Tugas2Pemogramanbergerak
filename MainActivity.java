package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber, editTextNumber2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TextNumber ="TextNumber :" + editTextNumber.getText();
                String TextNumber2 ="TextNumber2 :" + editTextNumber2.getText();
                if (editTextNumber.getText().toString().trim().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Mohon Number diisi terlebih dahulu", Toast.LENGTH_LONG).show();
                } else if (editTextNumber2.getText().toString().trim().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Mohon Number2 diisi terlebih dahulu", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    Bundle b = new Bundle();
                    b.putString("TextNumber", TextNumber);
                    b.putString("TextNumber2", TextNumber2);
                    b.putString("TextNumber", editTextNumber.getText().toString());
                    b.putString("TextNumber2", editTextNumber2.getText().toString());
                    Toast.makeText(getApplicationContext(), TextNumber + TextNumber2, Toast.LENGTH_LONG).show();
                    i.putExtras(b);
                    finish();
                    startActivity(i);
                }
            }
        });
    }
}