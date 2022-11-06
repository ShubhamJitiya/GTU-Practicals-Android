package com.shubhamjitiya.mad.practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.shubhamjitiya.mad.R;
import com.shubhamjitiya.mad.databinding.ActivityPractical1Binding;
import com.shubhamjitiya.mad.databinding.ActivityPractical2Binding;

public class Practical_2 extends AppCompatActivity {
    private ActivityPractical2Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical2);
        getSupportActionBar().hide();

        binding = ActivityPractical2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.idBtnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final String userName = binding.idEdtUserName.getText().toString();
                final String password = binding.idEdtPassword.getText().toString();

                Log.d("TAG", "onClick: " + userName);
                if (userName.isEmpty()) {
                    Snackbar.make(findViewById(R.id.practical1Layout), "Please enter username", Snackbar.LENGTH_SHORT).show();
                    binding.idEdtUserName.requestFocus();
                } else if (password.isEmpty()) {
                    Snackbar.make(findViewById(R.id.practical1Layout), "Please enter password", Snackbar.LENGTH_SHORT).show();
                    binding.idEdtPassword.requestFocus();
                } else {
                    Snackbar.make(findViewById(R.id.practical1Layout), "Wrong credential", Snackbar.LENGTH_SHORT).show();
                    binding.idEdtPassword.requestFocus();
                }
            }
        });

    }
}