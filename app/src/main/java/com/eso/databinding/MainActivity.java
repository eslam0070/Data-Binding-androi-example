package com.eso.databinding;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.eso.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    ActivityMainBinding activityMainBinding;
    ClickHandlers clickHandlers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setStudent(getCurrentStudent());

        clickHandlers = new ClickHandlers(this);
        activityMainBinding.setClick(clickHandlers);

    }


    private Student getCurrentStudent(){
        Student student = new Student();
        student.setStudentEmail("Eslam@gmail.com");
        student.setStudentName("Eslam");
        return student;
    }
}
