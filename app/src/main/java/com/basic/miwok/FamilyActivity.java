package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basic.miwok.databinding.ActivityFamilyBinding;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        ActivityFamilyBinding binding = ActivityFamilyBinding.inflate(getLayoutInflater());

        // Set content view.
        setContentView(binding.getRoot());
    }
}