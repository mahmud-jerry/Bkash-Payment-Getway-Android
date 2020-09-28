package com.rifsan.bkashandroidapi.PaymentGetway.utility;
import android.content.Context;
import android.widget.Toast;

public class JavaScriptInterface {
    Context mContext;
    public JavaScriptInterface(Context c) {
        mContext = c;
    }

    public void switchActivity(String getTransectionId) {
        String[] tranArray = getTransectionId.split("&");
        String[] finalTran = tranArray[1].split("=");
        Toast.makeText(mContext, "Success Payment", Toast.LENGTH_SHORT).show();
    }

}