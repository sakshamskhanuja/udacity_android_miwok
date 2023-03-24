package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.basic.miwok.databinding.WordListBinding;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        WordListBinding binding = WordListBinding.inflate(getLayoutInflater());

        // Set content view.
        setContentView(binding.getRoot());

        // Initializing a List containing default and miwok translation of family members.
        ArrayList<Word> familyMembers = new ArrayList<>();
        familyMembers.add(new Word(R.string.default_family_one, R.string.miwok_family_one));
        familyMembers.add(new Word(R.string.default_family_two, R.string.miwok_family_two));
        familyMembers.add(new Word(R.string.default_family_three, R.string.miwok_family_three));
        familyMembers.add(new Word(R.string.default_family_four, R.string.miwok_family_four));
        familyMembers.add(new Word(R.string.default_family_five, R.string.miwok_family_five));
        familyMembers.add(new Word(R.string.default_family_six, R.string.miwok_family_six));
        familyMembers.add(new Word(R.string.default_family_seven, R.string.miwok_family_seven));
        familyMembers.add(new Word(R.string.default_family_eight, R.string.miwok_family_eight));
        familyMembers.add(new Word(R.string.default_family_nine, R.string.miwok_family_nine));
        familyMembers.add(new Word(R.string.default_family_ten, R.string.miwok_family_ten));

        // Initializing a custom ArrayAdapter.
        ArrayAdapter<Word> wordAdapter = new WordAdapter(this, familyMembers);

        // Attaching wordAdapter to "word_list" ListView.
        binding.wordList.setAdapter(wordAdapter);
    }
}