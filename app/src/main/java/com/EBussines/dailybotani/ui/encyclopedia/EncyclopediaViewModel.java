package com.EBussines.dailybotani.ui.encyclopedia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EncyclopediaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EncyclopediaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Encyclopedia fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}