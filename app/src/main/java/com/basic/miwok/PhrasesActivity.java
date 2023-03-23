package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basic.miwok.databinding.ActivityPhrasesBinding;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        ActivityPhrasesBinding binding = ActivityPhrasesBinding.inflate(getLayoutInflater());

        // Set content view.
        setContentView(binding.getRoot());
    }
}