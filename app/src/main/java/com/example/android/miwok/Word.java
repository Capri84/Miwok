package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Capri84 on 26.01.2018.
 */

public class Word {

    // String values for Miwok and Default translations of the word
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return  mDefaultTranslation;
    }
}
