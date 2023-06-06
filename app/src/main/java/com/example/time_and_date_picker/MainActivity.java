package com.example.time_and_date_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.time_and_date_picker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private  String data="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding = ActivityMainBinding.inflate(getLayoutInflater());
      setContentView(binding.getRoot());
    binding.male.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (binding.male.isChecked())
            {
                data=data+"Male/";
                binding.time.setText(data);
            }
            else
            {
                data=data.replaceAll("Male/","");
                binding.time.setText(data);
            }
        }
    });
        binding.male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.female.isChecked())
                {
                    data=data+"Female/";
                    binding.time.setText(data);
                }
                else
                {
                    data=data.replaceAll("Female/","");
                    binding.time.setText(data);
                }
            }
        });
        binding.male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.other.isChecked())
                {
                    data=data+"Other/";
                    binding.time.setText(data);
                }
                else
                {
                    data=data.replaceAll("Other/","");
                    binding.time.setText(data);
                }
            }
        });
    }


}