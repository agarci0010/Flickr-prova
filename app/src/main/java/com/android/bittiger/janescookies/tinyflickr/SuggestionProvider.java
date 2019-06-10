package com.android.bittiger.janescookies.tinyflickr;

import android.content.SearchRecentSuggestionsProvider;


public class SuggestionProvider extends SearchRecentSuggestionsProvider {

    public static final String AUTHORITY = "com.android.bittiger.janescookies.tinyflickr" +
            ".SuggestionProvider";

    public static final int MODE = DATABASE_MODE_QUERIES;

    public SuggestionProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }
}
