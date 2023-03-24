package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.basic.miwok.databinding.WordListBinding;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        WordListBinding binding = WordListBinding.inflate(getLayoutInflater());

        // Set content view.
        setContentView(binding.getRoot());

        // Initializing a List containing default and miwok translation of numbers.
        ArrayList<Word> numbers = new ArrayList<>();
        numbers.add(new Word(R.string.default_number_one, R.string.miwok_number_one,
                R.drawable.number_one));
        numbers.add(new Word(R.string.default_number_two, R.string.miwok_number_two,
                R.drawable.number_two));
        numbers.add(new Word(R.string.default_number_three, R.string.miwok_number_three,
                R.drawable.number_three));
        numbers.add(new Word(R.string.default_number_four, R.string.miwok_number_four,
                R.drawable.number_four));
        numbers.add(new Word(R.string.default_number_five, R.string.miwok_number_five,
                R.drawable.number_five));
        numbers.add(new Word(R.string.default_number_six, R.string.miwok_number_six,
                R.drawable.number_six));
        numbers.add(new Word(R.string.default_number_seven, R.string.miwok_number_seven,
                R.drawable.number_seven));
        numbers.add(new Word(R.string.default_number_eight, R.string.miwok_number_eight,
                R.drawable.number_eight));
        numbers.add(new Word(R.string.default_number_nine, R.string.miwok_number_nine,
                R.drawable.number_nine));
        numbers.add(new Word(R.string.default_number_ten, R.string.miwok_number_ten,
                R.drawable.number_ten));

        // Initializing a custom ArrayAdapter.
        ArrayAdapter<Word> wordAdapter = new WordAdapter(this, numbers,
                R.color.category_numbers);

        // Attaching wordAdapter to "word_list" ListView.
        binding.wordList.setAdapter(wordAdapter);
    }
}