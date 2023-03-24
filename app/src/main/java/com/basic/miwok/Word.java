package com.basic.miwok;

public class Word {

    // Stores the String resource ID of the word in default language.
    private final int defaultTranslation;

    // Stores the String resource ID of the word in Miwok language.
    private final int miwokTranslation;

    /**
     * Initializes a Word object.
     *
     * @param defaultTranslation is the String resource ID containing the word in default language.
     * @param miwokTranslation   is the String resource ID containing the word in Miwok language.
     */
    public Word(int defaultTranslation, int miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
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
}
