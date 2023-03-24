package com.basic.miwok;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    // Store the Activity.
    private final Activity activity;

    /**
     * Initializes the custom ArrayAdapter that shows a list of {@link Word}.
     *
     * @param activity is the visible Activity.
     * @param words    is the ArrayList of type {@link Word}.
     */
    public WordAdapter(Activity activity, ArrayList<Word> words) {
        super(activity, 0, words);
        this.activity = activity;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        // Checks if the listItemView is NOT recycled.
        if (listItemView == null) {
            // Inflating view from "layout_item.xml" layout.
            listItemView = activity.getLayoutInflater().inflate(R.layout.list_item, parent,
                    false);
        }

        // Setting Word details to the inflated/recycled listItemView.

        // Stores the Word at the required position.
        Word currentWord = getItem(position);

        // Setting the word in Miwok language.
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(activity.getString(currentWord.getMiwokTranslation()));

        // Setting the word in the default language.
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(activity.getString(currentWord.getDefaultTranslation()));

        return listItemView;
    }
}
