package com.example.projectdana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }
    public void clickpocket(View view){
        Intent i = new Intent(this, dompet.class);
        startActivity(i);
    }


}
