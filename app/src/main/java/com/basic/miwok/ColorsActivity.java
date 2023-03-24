package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.basic.miwok.databinding.WordListBinding;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        WordListBinding binding = WordListBinding.inflate(getLayoutInflater());

        // Set content view.
        setContentView(binding.getRoot());

        // Initializing a List containing default and miwok translation of colors.
        ArrayList<Word> colors = new ArrayList<>();
        colors.add(new Word(R.string.default_color_one, R.string.miwok_color_one,
                R.drawable.color_red));
        colors.add(new Word(R.string.default_color_two, R.string.miwok_color_two,
                R.drawable.color_mustard_yellow));
        colors.add(new Word(R.string.default_color_three, R.string.miwok_color_three,
                R.drawable.color_dusty_yellow));
        colors.add(new Word(R.string.default_color_four, R.string.miwok_color_four,
                R.drawable.color_green));
        colors.add(new Word(R.string.default_color_five, R.string.miwok_color_five,
                R.drawable.color_brown));
        colors.add(new Word(R.string.default_color_six, R.string.miwok_color_six,
                R.drawable.color_gray));
        colors.add(new Word(R.string.default_color_seven, R.string.miwok_color_seven,
                R.drawable.color_black));
        colors.add(new Word(R.string.default_color_eight, R.string.miwok_color_eight,
                R.drawable.color_white));

        // Initializing a custom ArrayAdapter.
        ArrayAdapter<Word> wordAdapter = new WordAdapter(this, colors,
                R.color.category_colors);

        // Attaching wordAdapter to "word_list" ListView.
        binding.wordList.setAdapter(wordAdapter);
    }
}