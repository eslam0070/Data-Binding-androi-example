package com.eso.databinding.twoway;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.eso.databinding.R;
import com.eso.databinding.databinding.ActivityMain3Binding;
import com.eso.databinding.databinding.ActivityMainBinding;

public class Main3Activity extends AppCompatActivity {

    ActivityMain3Binding activityMain3Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Contact contact = new Contact("Eslam","eslam@gmail.com");
        activityMain3Binding = DataBindingUtil.setContentView(this,R.layout.activity_main3);
        activityMain3Binding.setContact(contact);
    }
}
