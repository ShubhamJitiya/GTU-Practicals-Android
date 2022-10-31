package com.shubhamjitiya.mad.practical_12.util;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.shubhamjitiya.mad.practical_12.ScreenSaver;

public class ScreenOnOffReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            Log.d("StackOverflow", "Screen Off");

            Intent screenSaver = new Intent(context, ScreenSaver.class);
            screenSaver.addFlags(FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(screenSaver);

        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            Log.d("StackOverflow", "Screen On");
            Intent screenSaver = new Intent(context, ScreenSaver.class);
            screenSaver.addFlags(FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(screenSaver);
        }
    }
}