package com.akash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.akash.geet.databinding.ActivityOtpactivityBinding;

public class OTPActivity extends AppCompatActivity {

    ActivityOtpactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOtpactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}