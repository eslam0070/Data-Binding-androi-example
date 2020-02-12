package com.eso.databinding.withIncludelayout;

import android.os.Bundle;

import com.eso.databinding.Student;
import com.eso.databinding.databinding.ActivityMain2Binding;
import com.eso.databinding.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.view.View;

import com.eso.databinding.R;

public class Main2Activity extends AppCompatActivity {

    ActivityMain2Binding activityMain2Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        activityMain2Binding = DataBindingUtil.setContentView(this,R.layout.activity_main2);
        activityMain2Binding.setStudent(getCurrentStudent());
    }

    private Student getCurrentStudent(){
        Student student = new Student();
        student.setStudentEmail("Eslam@gmail.com");
        student.setStudentName("Eslam");
        return student;
    }
}
