package com.rifsan.bkashandroidapi.PaymentGetway.utility;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;

import com.rifsan.bkashandroidapi.OrderActivity;

public class JavaScriptInterface {
    Context mContext;
    public JavaScriptInterface(Context c) {
        mContext = c;
    }

    public void switchActivity(String getTransectionId) {
        String[] tranArray = getTransectionId.split("&");
        String[] finalTran = tranArray[1].split("=");
        Toast.makeText(mContext, "Success Payment", Toast.LENGTH_SHORT).show();

        new AlertDialog.Builder(mContext)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setCancelable(false)
                .setTitle("Order Successful")
                .setMessage("Your Order Has Been Confirmed with Payment")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i =new Intent(mContext, OrderActivity.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(i);
                    }
                })
                .show();
    }

}