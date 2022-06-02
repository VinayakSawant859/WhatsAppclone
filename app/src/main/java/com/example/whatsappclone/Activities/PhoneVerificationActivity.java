package com.example.whatsappclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.whatsappclone.databinding.ActivityMainBinding;

public class PhoneVerificationActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.phoneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(PhoneVerificationActivity.this, OTPActivity.class);
                intent.putExtra("phone", binding.phoneTXT.getText().toString());
                startActivity(intent);
            }
        });
    }
}