package com.example.containers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivityFrame extends AppCompatActivity {

    // declarar atts
    Button btnAlfa;
    Button btnBeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frame);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // referenciar
        btnAlfa = findViewById(R.id.btnAlfa);
        btnBeta = findViewById(R.id.btnBeta);

        btnAlfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnAlfa.setVisibility(View.GONE);
                btnBeta.setVisibility(View.VISIBLE);
            }
        });

        btnBeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnAlfa.setVisibility(View.VISIBLE);
                btnBeta.setVisibility(View.GONE);
            }
        });
    }
}