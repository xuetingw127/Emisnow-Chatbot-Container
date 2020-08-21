package com.example.chatbotcontainer;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class LoadingDialog {
    private Activity activity;
    private AlertDialog dialog;

    LoadingDialog(Activity myactivity){
        activity = myactivity;
    }

    void startLoadingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity,R.style.TransparentDialog);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.loading_dialog,null));
        //dialog.setCancelable(false);
        dialog = builder.create();
        dialog.show();
    }

    void  dismissLoadingDialog(){
        dialog.dismiss();
    }
}
