package com.cambrian.logicgatecalculator;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.cambrian.logicgatecalculator.Model.Gates;

public class nandGate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nand_gate);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ToggleButton toggleButton = findViewById(R.id.toggleButton3);
        ToggleButton toggleButton2 = findViewById(R.id.toggleButton4);
        EditText editTextNumber = findViewById(R.id.editTextNumber2);
        Button button = findViewById(R.id.button2);


        button.setOnClickListener(v -> {
            int a = toggleButton.isChecked() ? 1 : 0;
            int b = toggleButton2.isChecked() ? 1 : 0;
            int result = Gates.nand(a, b);
            Log.d("result", String.valueOf(result));
            editTextNumber.setText(String.valueOf(result));
        });
    }
}