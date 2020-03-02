package com.example.mvvmexample;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public MutableLiveData<String> editStr = new MutableLiveData<String>();
    public MutableLiveData<String> loopBackStr = new MutableLiveData<String>();
    public MutableLiveData<ArrayList<String>> ddd = new MutableLiveData<>();
    public void onClick(View view){
        loopBackStr.setValue(editStr.getValue());
        //loopBackStr.notify();
    }
}
