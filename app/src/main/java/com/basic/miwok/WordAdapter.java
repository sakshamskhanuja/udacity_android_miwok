package com.basic.miwok;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    // Store the Activity.
    private final Activity activity;

    // Stores the background color resource.
    private final int backgroundColor;

    /**
     * Initializes the custom ArrayAdapter that shows a list of {@link Word}.
     *
     * @param activity        is the visible Activity.
     * @param words           is the ArrayList of type {@link Word}.
     * @param backgroundColor will be applied to each list item.
     */
    public WordAdapter(Activity activity, ArrayList<Word> words, int backgroundColor) {
        super(activity, 0, words);
        this.activity = activity;
        this.backgroundColor = backgroundColor;
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

        // Initializing ImageView
        ImageView imageView = listItemView.findViewById(R.id.image_view);

        // Checks whether currentWord contains drawable resource.
        if (currentWord.hasImage()) {
            // Makes the imageView visible.
            imageView.setVisibility(View.VISIBLE);

            // Setting the image resource.
            imageView.setImageResource(currentWord.getImageResourceID());
        } else {
            // Hides the imageView.
            imageView.setVisibility(View.GONE);
        }

        // Sets the background color of listItemView.
        LinearLayout layout = listItemView.findViewById(R.id.root_view);
        layout.setBackgroundColor(ContextCompat.getColor(activity, backgroundColor));

        return listItemView;
    }
}
