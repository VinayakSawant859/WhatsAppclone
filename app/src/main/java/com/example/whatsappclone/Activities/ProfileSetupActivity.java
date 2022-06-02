package com.example.whatsappclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.whatsappclone.databinding.ActivityProfileSetupBinding;

public class ProfileSetupActivity extends AppCompatActivity {

    ActivityProfileSetupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileSetupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}