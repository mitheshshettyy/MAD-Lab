package com.example.p1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button order;
    CheckBox pizza,coffee,burger,juice;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        order = findViewById(R.id.button);
        t = findViewById(R.id.title);
        pizza = findViewById(R.id.c1);
        coffee = findViewById(R.id.c2);
        burger = findViewById(R.id.c3);
        juice = findViewById(R.id.c4);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items: ");
                if (pizza.isChecked()) {
                    result.append("\n Pizza Rs 100");
                    totalAmount += 100;
                }
                if (coffee.isChecked()) {
                    result.append("\n Coffee Rs 50");
                    totalAmount += 50;
                }
                if (burger.isChecked()) {
                    result.append("\n Burger Rs 80");
                    totalAmount += 80;
                }
                if (juice.isChecked()) {
                    result.append("\n Juice Rs 40");
                    totalAmount += 40;
                }

                result.append("\n Total: "+totalAmount+"\n");
                t.setText(result.toString());
            }
        });
    }
}