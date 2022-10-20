package com.shubhamjitiya.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.shubhamjitiya.mad.adapter.MainScreenAdapter;
import com.shubhamjitiya.mad.adapter.StudentDetailsAdapter;
import com.shubhamjitiya.mad.data.MainScreenData;
import com.shubhamjitiya.mad.data.StudentsData;
import com.shubhamjitiya.mad.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        MainScreenAdapter mainScreenAdapter = new MainScreenAdapter(MainScreenData.practicalTitle, MainScreenData.practicalHeading, MainScreenData.practicalDescription);
        activityMainBinding.mainScreenRecyclerView.setHasFixedSize(true);
        activityMainBinding.mainScreenRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.mainScreenRecyclerView.setAdapter(mainScreenAdapter);

    }
}