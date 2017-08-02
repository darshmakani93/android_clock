package com.example.darshmakani.setalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Drash Makani on 7/17/2017.
 */

public class AlarmToastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"This is my Alarm",Toast.LENGTH_LONG).show();

    }
}
