    package com.example.p2;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;

    public class MainActivity extends AppCompatActivity {

        Button add,sub,mul,div,clear;
        int a,b,res;
        EditText num1,num2;
        TextView result;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);
            num1 = findViewById(R.id.num1);
            num2 = findViewById(R.id.num2);
            result = findViewById(R.id.result);
            add = findViewById(R.id.add);
            sub = findViewById(R.id.sub);
            mul = findViewById(R.id.mul);
            div = findViewById(R.id.div);
            clear = findViewById(R.id.clear);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Integer.parseInt(num1.getText().toString());
                    b = Integer.parseInt(num2.getText().toString());
                    res = a+b;
                    result.setText(Integer.toString(res));
                }
            });

            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Integer.parseInt(num1.getText().toString());
                    b = Integer.parseInt(num2.getText().toString());
                    res = a-b;
                    result.setText(Integer.toString(res));
                }
            });

            mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Integer.parseInt(num1.getText().toString());
                    b = Integer.parseInt(num2.getText().toString());
                    res = a*b;
                    result.setText(Integer.toString(res));
                }
            });

            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Integer.parseInt(num1.getText().toString());
                    b = Integer.parseInt(num2.getText().toString());
                    res = a/b;
                    result.setText(Integer.toString(res));
                }
            });

            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num1.setText("");
                    num2.setText("");
                    result.setText("");
                }
            });
        }
    }