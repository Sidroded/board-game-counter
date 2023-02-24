package com.sidroded.boardgamecounter.ui.newgame;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class NewGameViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewGameViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}