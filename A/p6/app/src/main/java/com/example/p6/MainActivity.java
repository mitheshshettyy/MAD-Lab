package com.example.p6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.send);
        et1 = findViewById(R.id.phone);
        et2 = findViewById(R.id.message);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ph = et1.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("sms: "+ph));
                i.putExtra("sms_body", et2.getText().toString());
                startActivity(i);
            }
        });
    }
}