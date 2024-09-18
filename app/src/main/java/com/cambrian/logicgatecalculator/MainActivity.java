package com.cambrian.logicgatecalculator;

import static com.cambrian.logicgatecalculator.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button and, not, or, xor, nand, nor;
        and = findViewById(R.id.and_button);
        not = findViewById(R.id.not_button);
        or = findViewById(R.id.or_button);
        xor = findViewById(R.id.xor_button);
        nand = findViewById(id.nand_button);
        nor = findViewById(id.nor_button);

        and.setOnClickListener(v -> {
            Intent intent = new Intent(this, andGate.class);
            startActivity(intent);

        });
        not.setOnClickListener(v -> {
            Intent intent = new Intent(this, notGate.class);
            startActivity(intent);
        });
        or.setOnClickListener(v -> {
            Intent intent = new Intent(this, orGate.class);
            startActivity(intent);

        });
        xor.setOnClickListener(v -> {
            Intent intent = new Intent(this, xorGate.class);
            startActivity(intent);

        });
        nand.setOnClickListener(v -> {
            Intent intent = new Intent(this, nandGate.class);
            startActivity(intent);

        });
        nor.setOnClickListener(v -> {
            Intent intent = new Intent(this, norGate.class);
            startActivity(intent);

        });


    }
}