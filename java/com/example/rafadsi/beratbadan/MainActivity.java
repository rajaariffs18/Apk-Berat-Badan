package com.example.rafadsi.beratbadan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View arg0){
        EditText username = (EditText)findViewById(R.id.username);
        EditText password = (EditText)findViewById(R.id.password);
        TextView textAllert = (TextView)findViewById(R.id.textallert);

        String sUsername = username.getText().toString();
        String sPassword = password.getText().toString();


        if(sUsername.contains("kelompok3") && sPassword.contains("kelompok3")){
            Intent go = new Intent(getApplicationContext(),hitungBeratBadan.class);
            startActivity(go);
            username.setText(" ");
            password.setText("");
        }else{
            textAllert.setText("Username atau password salah");
        }
    }
}
