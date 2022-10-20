package com.shubhamjitiya.mad.practicals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

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
    }
}