package com.shubhamjitiya.mad.practical_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.shubhamjitiya.mad.R;
import com.shubhamjitiya.mad.databinding.ActivityPractical1Binding;

public class Practical_1 extends AppCompatActivity {

    private ActivityPractical1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPractical1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.idBtnLogin.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                final String userName = binding.idEdtUserName.getText().toString();
                final String password = binding.idEdtPassword.getText().toString();

                Log.d("TAG", "onClick: " + userName);
                if(userName.isEmpty()){
                    Snackbar.make(findViewById(R.id.practical1Layout),"Please enter username", Snackbar.LENGTH_SHORT).show();
                    binding.idEdtUserName.requestFocus();
                } else if(password.isEmpty()){
                    Snackbar.make(findViewById(R.id.practical1Layout),"Please enter password", Snackbar.LENGTH_SHORT).show();
                    binding.idEdtPassword.requestFocus();
                }else{
                    Snackbar.make(findViewById(R.id.practical1Layout),"Wrong credential", Snackbar.LENGTH_SHORT).show();
                    binding.idEdtPassword.requestFocus();
                }
            }
        });
    }
}