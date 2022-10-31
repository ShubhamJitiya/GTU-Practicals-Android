package com.shubhamjitiya.mad.practical_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.shubhamjitiya.mad.R;
import com.shubhamjitiya.mad.practical_12.util.ScreenOnOffService;

public class Practical_12 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical12);
        Intent intent = new Intent(this, ScreenOnOffService.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(intent);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        //registBroadcastReceiver();
    }
}