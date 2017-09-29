package com.example.rafadsi.beratbadan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class hitungBeratBadan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_berat_badan);
    }

    public void hitungBerat(View arg0){
        EditText nilaiBerat = (EditText)findViewById(R.id.beratBadan);
        EditText nilaiTinggi = (EditText)findViewById(R.id.tinggiBadan);
        TextView textHasil = (TextView)findViewById(R.id.textHasil);

        String stringBerat = nilaiBerat.getText().toString();
        String stringTinggi = nilaiTinggi.getText().toString();

        int berat = Integer.parseInt(stringBerat);
        int tinggi = Integer.parseInt(stringTinggi);

        double beratBadanIdeal = (tinggi - 100) * 0.9;
        double t = (tinggi * tinggi);
        double bodyMassIndex = (berat / t) * 10000;


        if (bodyMassIndex < 18.5){
            textHasil.setText("Anda kurus, berat badan anda "+berat+", tinggi anda "+tinggi+ "\n Seharusnya berat badan anda "+beratBadanIdeal+ "");
        }else if(bodyMassIndex >= 18.5 && bodyMassIndex <= 23.9){
            textHasil.setText("Anda normal, berat badan anda "+berat+", tinggi anda "+tinggi+ "\n Seharusnya berat badan anda "+beratBadanIdeal+ "");
        }else if(bodyMassIndex >= 24.01 && bodyMassIndex <= 30){
            textHasil.setText("Anda gemuk, berat badan anda "+berat+", tinggi anda "+tinggi+ "\n Seharusnya berat badan anda "+beratBadanIdeal+ "");
        }else if(bodyMassIndex >= 30.01 && bodyMassIndex <= 40){
            textHasil.setText("Anda sangat gemuk, berat badan anda "+berat+", tinggi anda "+tinggi+ "\n Seharusnya berat badan anda "+beratBadanIdeal+ "");
        }else if(bodyMassIndex > 40){
            textHasil.setText("Anda sangan-sangat gemuk, berat badan anda "+berat+", tinggi anda "+tinggi+ "\n Seharusnya berat badan anda "+beratBadanIdeal+ "");
        }else{
            textHasil.setText("Hasil tidak ditemukan");
        }
    }

    public void kembali(View v){
        //Intent go = new Intent(getApplicationContext(),MainActivity.class);
        //startActivity(go);
        moveTaskToBack(true);
    }
}