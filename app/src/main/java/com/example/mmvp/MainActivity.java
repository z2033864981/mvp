package com.example.mmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mmvp.base.BaseActivity;
import com.example.mmvp.interfaces.IBasePresenter;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected int getLayout() {
        return 0;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}