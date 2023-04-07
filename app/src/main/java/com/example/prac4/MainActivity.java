package com.example.prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void replaceFragments(Log_in inst) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_view, inst).commit();
    }
    public void replaceFragments(Sign_up inst) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_view, inst).commit();
    }
}