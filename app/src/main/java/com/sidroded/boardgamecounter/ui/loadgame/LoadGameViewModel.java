package com.sidroded.boardgamecounter.ui.loadgame;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class LoadGameViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LoadGameViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}