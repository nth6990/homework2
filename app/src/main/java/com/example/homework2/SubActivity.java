package com.example.homework2;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class SubActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
}
