package com.example.projectdana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awal);
    }
    public void clickriwayat (View view){
        Intent i = new Intent(this, transaksi.class);
        startActivity(i);
    }
    public void clickpotoooo (View view){
        Intent i = new Intent(this, profile.class);
        startActivity(i);
    }


}