package com.example.chatbotcontainer;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CustomWebViewClient extends WebViewClient {
    //View myloadingView;
    LoadingDialog myloadingdialog;
    /*CustomWebViewClient(View loadingView){
        myloadingView = loadingView;
    }*/
    CustomWebViewClient(LoadingDialog dialog){
        myloadingdialog = dialog;
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        myloadingdialog.dismissLoadingDialog();

        //myloadingView.setVisibility(view.GONE);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
    }

    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        myloadingdialog.dismissLoadingDialog();
        //myloadingView.setVisibility(view.GONE);
    }
}
