package com.example.chatbotcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        WebView webview = new WebView(this);
        webview.getSettings().setJavaScriptEnabled(true);
        try {
            webview.loadUrl("file:///android_asset/chatbot.html");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        setContentView(webview);
    }
}