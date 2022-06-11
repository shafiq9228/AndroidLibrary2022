package com.dosolutions.mymod1;

import android.content.Context;
import android.widget.Toast;

public class MyToaster {

    public void DisplayToast(Context context, String msg){

        Toast.makeText(context, "Library: "+msg, Toast.LENGTH_SHORT).show();

    }
}
