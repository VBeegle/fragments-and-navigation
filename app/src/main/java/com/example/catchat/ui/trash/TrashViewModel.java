package com.example.catchat.ui.trash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class TrashViewModel extends ViewModel {

    private String mText;

    @Inject
    public TrashViewModel() {
    }

    public TrashViewModel(String mText) {
        this.mText = mText;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text){
        mText = text;
    }
}