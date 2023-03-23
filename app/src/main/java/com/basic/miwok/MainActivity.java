package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.basic.miwok.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        // Set content view.
        setContentView(binding.getRoot());

        // Attaching OnClickListener to "numbers" TextView to open "NumbersActivity" when clicked.
        binding.numbers.setOnClickListener((v) -> openWordActivity(NumbersActivity.class));

        // Attaching OnClickListener to "family" TextView to open "FamilyActivity" when clicked.
        binding.family.setOnClickListener((v) -> openWordActivity(FamilyActivity.class));

        // Attaching OnClickListener to "colors" TextView to open "ColorsActivity" when clicked.
        binding.colors.setOnClickListener((v) -> openWordActivity(ColorsActivity.class));

        // Attaching OnClickListener to "phrases" TextView to open "PhrasesActivity" when clicked.
        binding.phrases.setOnClickListener((v) -> openWordActivity(PhrasesActivity.class));
    }

    /**
     * Opens up the activities available in this app.
     *
     * @param category is the component category class.
     */
    private void openWordActivity(Class<?> category) {
        startActivity(new Intent(this, category));
    }
}