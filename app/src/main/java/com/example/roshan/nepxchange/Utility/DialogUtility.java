package com.example.roshan.nepxchange.Utility;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.roshan.nepxchange.R;

public class DialogUtility {

    public static Dialog getOKDialog(Context pContext, String pTitle, String pMsg, String pOK) {
        if(pMsg == null) return null;
        AlertDialog.Builder lBuilder = new AlertDialog.Builder(pContext);
        lBuilder.setCancelable(false);
        if(pTitle == null){
  //          lBuilder.setTitle(pContext.getResources().getString(R.string.message_text));
        } else{
            lBuilder.setTitle(pTitle);
        }
        lBuilder.setMessage(pMsg);
        if(pOK == null){
 //           lBuilder.setPositiveButton(pContext.getResources().getString(R.string.ok_text), null);
        } else{
            lBuilder.setPositiveButton(pOK, null);
        }
        return lBuilder.show();
    }

    public static Dialog getOKDialog(Context pContext, String pTitle, String pMsg, String pOK, DialogInterface.OnClickListener listener) {
        if(pMsg == null) return null;
        AlertDialog.Builder lBuilder = new AlertDialog.Builder(pContext);
        lBuilder.setCancelable(false);
        if(pTitle == null){
  //          lBuilder.setTitle(pContext.getResources().getString(R.string.message_text));
        } else{
            lBuilder.setTitle(pTitle);
        }
        lBuilder.setMessage(pMsg);
        if(pOK == null){
   //         lBuilder.setPositiveButton(pContext.getResources().getString(R.string.ok_text), listener);
        } else{
            lBuilder.setPositiveButton(pOK, listener);
        }
        return lBuilder.show();
    }

    public static Dialog getNoInternetDialog(final Activity c){
        AlertDialog.Builder lBuilder = new AlertDialog.Builder(c);

        lBuilder.setTitle("Device offline!");
        lBuilder.setMessage("Please conect to the internet and try again");
        lBuilder.setPositiveButton("Connect", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                c.startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
            }
        });
        lBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return lBuilder.show();
    }



    public static Dialog getOKDialogFinsih(final Activity pContext, String pTitle, String pMsg, String pOK) {
        if(pMsg == null) return null;
        AlertDialog.Builder lBuilder = new AlertDialog.Builder(pContext);
        lBuilder.setCancelable(false);
        if(pTitle == null){
    //        lBuilder.setTitle(pContext.getResources().getString(R.string.message_text));
        } else{
            lBuilder.setTitle(pTitle);
        }
        lBuilder.setMessage(pMsg);
 //       if(pOK == null){
   //         lBuilder.setPositiveButton(pContext.getResources().getString(R.string.ok_text), new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    dialogInterface.dismiss();
//                    pContext.finish();
//                }
//            });
//        } else{
//            lBuilder.setPositiveButton(pOK, new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    dialogInterface.dismiss();
//                    pContext.finish();
//                    //pContext.overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
//                }
//            });
//        }
        return lBuilder.show();
    }

    public static Dialog getProgressDialog(Context pContext) {
        LayoutInflater inflater = (LayoutInflater)pContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View lView = inflater.inflate(R.layout.progress_dialogue, null, false);
//        ProgressBar bar = (ProgressBar) lView.findViewById(R.id.progress);
//        TextView text = (TextView) lView.findViewById(R.id.loadingtext);

        Dialog lDialog = new Dialog(pContext, android.R.style.Theme_Translucent_NoTitleBar);
//        lDialog.setContentView(lView);
        WindowManager.LayoutParams lp = lDialog.getWindow().getAttributes();
        lp.dimAmount = 0.7f;
        lDialog.getWindow().setAttributes(lp);
        lDialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        return lDialog;
    }

}
