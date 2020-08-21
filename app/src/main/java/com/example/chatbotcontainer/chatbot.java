package com.example.chatbotcontainer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class chatbot extends AppCompatActivity {
    //View myloadingView;
    LoadingDialog myloadingdialog;
    WebView mywebView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);
        init();
    }
    private void init(){
        myloadingdialog = new LoadingDialog(chatbot.this);
        myloadingdialog.startLoadingDialog();
        //myloadingView = findViewById(R.id.loadingView);
        mywebView = (WebView) findViewById(R.id.webView);
        mywebView.setWebViewClient(new CustomWebViewClient(myloadingdialog));

        mywebView.getSettings().setJavaScriptEnabled(true);
        url = "https://emis-dummy-chatbot.herokuapp.com/";
        mywebView.loadUrl(url);
        //getSupportActionBar().show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mywebView.destroy();
    }

}