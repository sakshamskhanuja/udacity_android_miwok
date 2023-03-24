package com.basic.miwok;

public class Word {

    // Stores the String resource ID of the word in default language.
    private final int defaultTranslation;

    // Stores the String resource ID of the word in Miwok language.
    private final int miwokTranslation;

    // Stores the drawable resource ID of the word.
    private int imageResourceID;

    // Informs whether an image is associated with the word or not.
    private final boolean imageAvailable;

    /**
     * Initializes a Word object.
     *
     * @param defaultTranslation is the String resource ID containing the word in default language.
     * @param miwokTranslation   is the String resource ID containing the word in Miwok language.
     * @param imageResourceID    is the drawable resource ID associated with the word.
     */
    public Word(int defaultTranslation, int miwokTranslation, int imageResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceID = imageResourceID;
        imageAvailable = true;
    }

    /**
     * Initializes a Word object.
     *
     * @param defaultTranslation is the String resource ID containing the word in default language.
     * @param miwokTranslation   is the String resource ID containing the word in Miwok language.
     */
    public Word(int defaultTranslation, int miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        imageAvailable = false;
    }

    /**
     * Get the String resource ID containing the default translation of the Word.
     *
     * @return Resource ID.
     */
    public int getDefaultTranslation() {
        return defaultTranslation;
    }

    /**
     * Get the String resource ID containing the Miwok translation of the Word.
     *
     * @return Resource ID.
     */
    public int getMiwokTranslation() {
        return miwokTranslation;
    }

    /**
     * Get the drawable resource ID associated with the word.
     *
     * @return Resource ID.
     */
    public int getImageResourceID() {
        return imageResourceID;
    }

    /**
     * Whether Word has a drawable associated with it.
     *
     * @return true, if Word contains an image resource, otherwise, false.
     */
    public boolean hasImage() {
        return imageAvailable;
    }
}
