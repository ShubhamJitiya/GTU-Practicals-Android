package com.shubhamjitiya.mad.practical_15;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.shubhamjitiya.mad.R;

public class Practical_15 extends AppCompatActivity {

    Button btnCapture;
    ImageView imgCapture;
    int CAM_CODE=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical15);

        getSupportActionBar().hide();

        btnCapture=findViewById(R.id.btnCapture);
        imgCapture=findViewById(R.id.imgCapture);
        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkcamPermission()){
                    askPermission();
                    Log.d("TAG", "onClick: Permission Taken");
                    captureImage();
                }else {
                    Log.d("TAG", "onClick: Capture img");
                    captureImage();
                }
            }
        });
    }

    private void captureImage() {
        Intent camIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camIntent,CAM_CODE);
    }

    private void askPermission() {
        ActivityCompat.requestPermissions(this, new
                String[]{Manifest.permission.CAMERA},CAM_CODE);
    }

    private boolean checkcamPermission() {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED;
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==CAM_CODE && resultCode==RESULT_OK){
            Bitmap image=(Bitmap) data.getExtras().get("data");
            imgCapture.setImageBitmap(image);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}