package com.shubhamjitiya.mad.practicals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.shubhamjitiya.mad.R;
import com.shubhamjitiya.mad.adapter.StudentDetailsAdapter;
import com.shubhamjitiya.mad.data.StudentsData;
import com.shubhamjitiya.mad.databinding.ActivityPractical7Binding;

public class Practical_7 extends AppCompatActivity {


    ActivityPractical7Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPractical7Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        StudentDetailsAdapter studentAdapter = new StudentDetailsAdapter(new StudentsData());
        binding.rvPractical7.setHasFixedSize(true);
        binding.rvPractical7.setLayoutManager(new LinearLayoutManager(this));
        binding.rvPractical7.setAdapter(studentAdapter);

        binding.btnTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nightModeFlags =
                        view.getContext().getResources().getConfiguration().uiMode &
                                Configuration.UI_MODE_NIGHT_MASK;
                switch (nightModeFlags) {
                    case Configuration.UI_MODE_NIGHT_YES:
                         AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                        Toast.makeText(Practical_7.this, "Night mode disabled", Toast.LENGTH_SHORT).show();
                        break;

                    case Configuration.UI_MODE_NIGHT_NO:
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                        Toast.makeText(Practical_7.this, "Night mode enabled", Toast.LENGTH_SHORT).show();
                        break;

                    case Configuration.UI_MODE_NIGHT_UNDEFINED:
                        Toast.makeText(Practical_7.this, "DK ch", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
}