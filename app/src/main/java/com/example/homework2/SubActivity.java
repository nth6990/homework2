package com.example.homework2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SubActivity extends AppCompatActivity {
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment2).commit();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment3).commit();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment4).commit();
            }
        });
    }
}
