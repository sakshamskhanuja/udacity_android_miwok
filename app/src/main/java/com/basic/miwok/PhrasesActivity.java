package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.basic.miwok.databinding.WordListBinding;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        WordListBinding binding = WordListBinding.inflate(getLayoutInflater());

        // Set content view.
        setContentView(binding.getRoot());

        // Initializing a List containing default and miwok translation of phrases.
        ArrayList<Word> phrases = new ArrayList<>();
        phrases.add(new Word(R.string.default_phrase_one, R.string.miwok_phrase_one));
        phrases.add(new Word(R.string.default_phrase_two, R.string.miwok_phrase_two));
        phrases.add(new Word(R.string.default_phrase_three, R.string.miwok_phrase_three));
        phrases.add(new Word(R.string.default_phrase_four, R.string.miwok_phrase_four));
        phrases.add(new Word(R.string.default_phrase_five, R.string.miwok_phrase_five));
        phrases.add(new Word(R.string.default_phrase_six, R.string.miwok_phrase_six));
        phrases.add(new Word(R.string.default_phrase_seven, R.string.miwok_phrase_seven));
        phrases.add(new Word(R.string.default_phrase_eight, R.string.miwok_phrase_eight));
        phrases.add(new Word(R.string.default_phrase_nine, R.string.miwok_phrase_nine));
        phrases.add(new Word(R.string.default_phrase_ten, R.string.miwok_phrase_ten));

        // Initializing a custom ArrayAdapter.
        ArrayAdapter<Word> wordAdapter = new WordAdapter(this, phrases,
                R.color.category_phrases);

        // Attaching wordAdapter to "word_list" ListView.
        binding.wordList.setAdapter(wordAdapter);
    }
}