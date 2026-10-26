package com.example.p5again;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView t;
    ConstraintLayout c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.t);
        c = findViewById(R.id.main);
        registerForContextMenu(c);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context,menu);
        super.onCreateContextMenu(menu,v,menuInfo);
    }

    public boolean onContextItemSelected(@NonNull MenuItem item){
        int id =item.getItemId();
        if(id==R.id.red){
            c.setBackgroundColor(Color.RED);
            return true;
        } else if (id==R.id.green) {
            c.setBackgroundColor(Color.GREEN);
            return true;
        } else if (id==R.id.blue) {
            c.setBackgroundColor(Color.BLUE);
            return true;
        }else {
            return super.onContextItemSelected(item);
        }
    }
}