package com.example.mvvmexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.mvvmexample.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {


    private MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        binding.setMViewModel(mViewModel);
        binding.setLifecycleOwner(this);
        //this.getActivity().setContentView(binding.getRoot());
    }
}
