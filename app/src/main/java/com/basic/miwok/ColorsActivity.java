package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basic.miwok.databinding.ActivityColorsBinding;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        ActivityColorsBinding binding = ActivityColorsBinding.inflate(getLayoutInflater());

        // Set content view.
        setContentView(binding.getRoot());
    }
}