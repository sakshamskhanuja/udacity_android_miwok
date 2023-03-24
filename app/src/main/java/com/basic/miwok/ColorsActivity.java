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
        colors.add(new Word(R.string.default_color_one, R.string.miwok_color_one));
        colors.add(new Word(R.string.default_color_two, R.string.miwok_color_two));
        colors.add(new Word(R.string.default_color_three, R.string.miwok_color_three));
        colors.add(new Word(R.string.default_color_four, R.string.miwok_color_four));
        colors.add(new Word(R.string.default_color_five, R.string.miwok_color_five));
        colors.add(new Word(R.string.default_color_six, R.string.miwok_color_six));
        colors.add(new Word(R.string.default_color_seven, R.string.miwok_color_seven));
        colors.add(new Word(R.string.default_color_eight, R.string.miwok_color_eight));

        // Initializing a custom ArrayAdapter.
        ArrayAdapter<Word> wordAdapter = new WordAdapter(this, colors);

        // Attaching wordAdapter to "word_list" ListView.
        binding.wordList.setAdapter(wordAdapter);
    }
}