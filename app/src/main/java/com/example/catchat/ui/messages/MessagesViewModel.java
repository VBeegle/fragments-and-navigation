package com.example.catchat.ui.messages;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class MessagesViewModel extends ViewModel {

    private String mText;

    @Inject
    public MessagesViewModel() {

    }

    public MessagesViewModel(String text){
        mText = text;
    }


    public String getText() {
        return mText;
    }
}