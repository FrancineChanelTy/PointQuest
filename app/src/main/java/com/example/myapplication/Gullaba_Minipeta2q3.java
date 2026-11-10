package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Gullaba_Minipeta2q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_mainstudentfeature); // links to layout_mainstudentfeature.xml

        Button questButton = findViewById(R.id.button9);     // QUEST
        Button shoplistButton = findViewById(R.id.button8);  // SHOPLIST
        Button logoutButton = findViewById(R.id.button7);    // LOGOUT

        questButton.setOnClickListener(v -> {
            Toast.makeText(this, "Quest clicked", Toast.LENGTH_SHORT).show();
            // To open another screen later:
            // startActivity(new Intent(Gullaba_Minipeta2q3.this, QuestActivity.class));
        });

        shoplistButton.setOnClickListener(v -> {
            Toast.makeText(this, "Shoplist clicked", Toast.LENGTH_SHORT).show();
        });

        logoutButton.setOnClickListener(v -> {
            finish(); // closes this screen
        });
    }
}