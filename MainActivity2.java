package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();

        TextView tvNumber = findViewById(R.id.tvNumber);
        TextView tvNumber2= findViewById(R.id.tvNumber2);

        kembali=findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tvNumber.setText(b.getCharSequence("TextNumber"));
        tvNumber2.setText(b.getCharSequence("TextNumber2"));

        TextView tvPenjumlahan =findViewById(R.id.tvPenjumlahan);
        double TextNumber = Double.parseDouble(b.getString("TextNumber"));
        double TextNumber2 = Double.parseDouble(b.getString("TextNumber2"));
        tvPenjumlahan.setText(String.valueOf("\nPenjumlahan : " + (TextNumber +  TextNumber2)));
    }
    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(), "aktifiti di lihat", Toast.LENGTH_LONG).show();
        super.onPause();
    }
}