package com.example.catchat.ui.send;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class SendViewModel extends ViewModel {

    private String mText;

    @Inject
    public SendViewModel(){

    }

    public SendViewModel(String text) {
        mText = text;
    }

    public String getText() {
        return mText;
    }

}