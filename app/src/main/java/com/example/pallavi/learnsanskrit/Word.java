package com.example.pallavi.learnsanskrit;

/**
 * Created by pallavi on 22/3/17.
 */
/**represents a vocabulary words that the user wants to learn
 * It contains a default translation, a Sanskrit translation and Hindi Translation for that word
 */
public class Word {
    private String mDefaultTranslation;
    private String mSanskritTranslation;
    private String mHindiTranslation;

    //create constructor to initialize variables

    public Word(String defaultTranslation, String sanskritTranslation, String hindiTranslation) {
        mDefaultTranslation = defaultTranslation;
        mSanskritTranslation = sanskritTranslation;
        mHindiTranslation = hindiTranslation;
    }

    /**
     * get default english translation of the word
     * @return mDefaultTranslation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get sanskrit translation of the word
     * @return mSanskritTranslation
     */

    public String getSanskritTranslation() {
        return mSanskritTranslation;
    }

    /**
     * get hindi translation of the word
     * @return mHindiTranslation
     */

    public String getHindiTranslation() {
        return mHindiTranslation;
    }
}
