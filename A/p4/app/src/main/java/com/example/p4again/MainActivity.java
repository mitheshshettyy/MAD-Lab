package com.example.p4again;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Toolbar t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.toolbar);
        setSupportActionBar(t);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        Toast.makeText(this,"Menu Clicked"+item.getTitle(),Toast.LENGTH_SHORT).show();
        if(item.getItemId()==R.id.id1){
            startActivity(new Intent(this, MainActivity2.class));
            return true;
        }else if(item.getItemId()==R.id.id2){
            startActivity(new Intent(this, MainActivity3.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}