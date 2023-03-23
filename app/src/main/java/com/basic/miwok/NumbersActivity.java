package com.basic.miwok;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basic.miwok.databinding.ActivityNumbersBinding;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        ActivityNumbersBinding binding = ActivityNumbersBinding.inflate(getLayoutInflater());

        // Set content view.
        setContentView(binding.getRoot());
    }
}