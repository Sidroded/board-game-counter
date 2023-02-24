package com.sidroded.boardgamecounter.ui.createtemplate;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CreateTemplateViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public CreateTemplateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Create Template fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
