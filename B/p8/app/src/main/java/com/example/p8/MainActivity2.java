package com.example.p8;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        w = findViewById(R.id.webView);

        w.setWebViewClient(new WebViewClient());

        Intent i =  getIntent();
        String extra = i.getStringExtra("load");

        if(extra.equals("default12")){
            w.loadUrl("https://www.google.com/");
        }else{
            w.loadUrl(extra);
        }
    }
}