package com.example.githubwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.security.Provider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("hello","world");
        Intent intent = new Intent();
        Fragment fragment = new Fragment();
        Log.e("hello","123");
        System.out.println(123);
		System.out.println(435345);
    }
}
