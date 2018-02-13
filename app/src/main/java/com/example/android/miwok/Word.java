package com.example.android.miwok;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by Capri84 on 26.01.2018.
 */

public class Word {
    // String values for Miwok and Default translations of the word
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    public static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mSoundResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is an image to the words
     */
    public Word(int imageResourceId, String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mImageResourceId = imageResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
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

    /**
     * Get the image of the word.
     */
    public int getImageResourceId() {
        return  mImageResourceId;
    }

    /**
     * Get mHasImage state.
     */
    public boolean hasImage() {
        return mImageResourceId != -1;
    }

    /**
     * Get the sound of the word.
     */
    public int getSoundResourceId() {
        return  mSoundResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }
}
