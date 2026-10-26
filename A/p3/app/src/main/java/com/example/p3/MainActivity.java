package com.example.p3;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.invoke.ConstantCallSite;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        color = findViewById(R.id.button);

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout r = findViewById(R.id.main);
                Random gen = new Random();
                r.setBackgroundColor(Color.rgb(gen.nextInt(256),gen.nextInt(256),gen.nextInt(256)));
            }
        });
    }
}