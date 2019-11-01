package com.example.catchat.ui.drafts;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class DraftViewModel extends ViewModel {

    private String mText;

    @Inject
    public DraftViewModel(){

    }

    public DraftViewModel(String text) {
        mText = text;
    }

    public String getText() {
        return mText;
    }
}