package com.example.projectdana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class transaksi extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaksi);
    }
    public void clickkembali(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
